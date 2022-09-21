package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareModuleExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222` extends StObject {
  
  var `type`: DeclareModuleExports
}
object `222` {
  
  inline def apply(): `222` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[`222`]
  }
  
  extension [Self <: `222`](x: Self) {
    
    inline def setType(value: DeclareModuleExports): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
