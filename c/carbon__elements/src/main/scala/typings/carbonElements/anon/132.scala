package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-info-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `132` extends StObject {
  
  var name: `support-info-inverse`
  
  var `type`: color
}
object `132` {
  
  inline def apply(): `132` = {
    val __obj = js.Dynamic.literal(name = "support-info-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`132`]
  }
  
  extension [Self <: `132`](x: Self) {
    
    inline def setName(value: `support-info-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
