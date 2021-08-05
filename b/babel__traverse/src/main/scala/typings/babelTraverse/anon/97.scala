package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var `type`: Identifier
}
object `97` {
  
  inline def apply(): `97` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[`97`]
  }
  
  extension [Self <: `97`](x: Self) {
    
    inline def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
