package typings.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomData extends StObject {
  
  var customData: js.Any
}
object CustomData {
  
  inline def apply(customData: js.Any): CustomData = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomData]
  }
  
  extension [Self <: CustomData](x: Self) {
    
    inline def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
  }
}
