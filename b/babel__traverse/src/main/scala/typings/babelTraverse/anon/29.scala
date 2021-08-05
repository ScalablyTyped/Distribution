package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSQualifiedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var `type`: TSQualifiedName
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSQualifiedName")
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setType(value: TSQualifiedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
