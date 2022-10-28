package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103` extends StObject {
  
  var `type`: JSXAttribute
}
object `103` {
  
  inline def apply(): `103` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[`103`]
  }
  
  extension [Self <: `103`](x: Self) {
    
    inline def setType(value: JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
