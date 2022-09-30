package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`notification-background-info`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  var name: `notification-background-info`
  
  var `type`: color
}
object `175` {
  
  inline def apply(): `175` = {
    val __obj = js.Dynamic.literal(name = "notification-background-info")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`175`]
  }
  
  extension [Self <: `175`](x: Self) {
    
    inline def setName(value: `notification-background-info`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
