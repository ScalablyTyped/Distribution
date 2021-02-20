package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEventConfigurationsRequest extends StObject {
  
  /**
    * The new event configuration values.
    */
  var eventConfigurations: js.UndefOr[EventConfigurations] = js.native
}
object UpdateEventConfigurationsRequest {
  
  @scala.inline
  def apply(): UpdateEventConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEventConfigurationsRequest]
  }
  
  @scala.inline
  implicit class UpdateEventConfigurationsRequestMutableBuilder[Self <: UpdateEventConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventConfigurations(value: EventConfigurations): Self = StObject.set(x, "eventConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventConfigurationsUndefined: Self = StObject.set(x, "eventConfigurations", js.undefined)
  }
}
