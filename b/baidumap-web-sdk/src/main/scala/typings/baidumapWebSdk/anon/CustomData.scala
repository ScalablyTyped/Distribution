package typings.baidumapWebSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomData extends StObject {
  
  var customData: js.Any
}
object CustomData {
  
  @scala.inline
  def apply(customData: js.Any): CustomData = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomData]
  }
  
  @scala.inline
  implicit class CustomDataMutableBuilder[Self <: CustomData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
  }
}
