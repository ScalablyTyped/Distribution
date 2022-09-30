package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-success-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `130` extends StObject {
  
  var name: `support-success-inverse`
  
  var `type`: color
}
object `130` {
  
  inline def apply(): `130` = {
    val __obj = js.Dynamic.literal(name = "support-success-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`130`]
  }
  
  extension [Self <: `130`](x: Self) {
    
    inline def setName(value: `support-success-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
