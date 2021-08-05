package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Decorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `80` extends StObject {
  
  var `type`: Decorator
}
object `80` {
  
  inline def apply(): `80` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Decorator")
    __obj.asInstanceOf[`80`]
  }
  
  extension [Self <: `80`](x: Self) {
    
    inline def setType(value: Decorator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
