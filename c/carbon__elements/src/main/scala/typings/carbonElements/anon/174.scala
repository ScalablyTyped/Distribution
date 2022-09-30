package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`notification-background-success`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `174` extends StObject {
  
  var name: `notification-background-success`
  
  var `type`: color
}
object `174` {
  
  inline def apply(): `174` = {
    val __obj = js.Dynamic.literal(name = "notification-background-success")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`174`]
  }
  
  extension [Self <: `174`](x: Self) {
    
    inline def setName(value: `notification-background-success`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
