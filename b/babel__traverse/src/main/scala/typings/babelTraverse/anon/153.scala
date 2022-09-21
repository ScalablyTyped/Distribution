package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXNamespacedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  var `type`: JSXNamespacedName
}
object `153` {
  
  inline def apply(): `153` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[`153`]
  }
  
  extension [Self <: `153`](x: Self) {
    
    inline def setType(value: JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
