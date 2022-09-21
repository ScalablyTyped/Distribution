package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `241` extends StObject {
  
  var `type`: DeclareClass
}
object `241` {
  
  inline def apply(): `241` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[`241`]
  }
  
  extension [Self <: `241`](x: Self) {
    
    inline def setType(value: DeclareClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
