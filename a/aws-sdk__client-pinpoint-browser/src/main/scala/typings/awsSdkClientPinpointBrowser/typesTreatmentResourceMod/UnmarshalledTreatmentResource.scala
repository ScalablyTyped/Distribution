package typings.awsSdkClientPinpointBrowser.typesTreatmentResourceMod

import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.UnmarshalledCampaignState
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledTreatmentResource extends TreatmentResource {
  
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledMessageConfiguration] = js.native
  
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledSchedule] = js.native
  
  /**
    * The treatment status.
    */
  @JSName("State")
  var State_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledCampaignState] = js.native
}
object UnmarshalledTreatmentResource {
  
  @scala.inline
  def apply(): UnmarshalledTreatmentResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledTreatmentResource]
  }
  
  @scala.inline
  implicit class UnmarshalledTreatmentResourceOps[Self <: UnmarshalledTreatmentResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessageConfiguration(value: UnmarshalledMessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageConfiguration: Self = this.set("MessageConfiguration", js.undefined)
    
    @scala.inline
    def setSchedule(value: UnmarshalledSchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    
    @scala.inline
    def setState(value: UnmarshalledCampaignState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
