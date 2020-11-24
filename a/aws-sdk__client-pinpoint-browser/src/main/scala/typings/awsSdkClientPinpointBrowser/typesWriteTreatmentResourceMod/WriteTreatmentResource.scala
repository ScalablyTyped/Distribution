package typings.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod

import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteTreatmentResource extends js.Object {
  
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[
    typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
  ] = js.native
  
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule] = js.native
  
  /**
    * The allocated percentage of users for this treatment.
    */
  var SizePercent: js.UndefOr[Double] = js.native
  
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[String] = js.native
  
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[String] = js.native
}
object WriteTreatmentResource {
  
  @scala.inline
  def apply(): WriteTreatmentResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteTreatmentResource]
  }
  
  @scala.inline
  implicit class WriteTreatmentResourceOps[Self <: WriteTreatmentResource] (val x: Self) extends AnyVal {
    
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
    def setMessageConfiguration(value: MessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageConfiguration: Self = this.set("MessageConfiguration", js.undefined)
    
    @scala.inline
    def setSchedule(value: Schedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    
    @scala.inline
    def setSizePercent(value: Double): Self = this.set("SizePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizePercent: Self = this.set("SizePercent", js.undefined)
    
    @scala.inline
    def setTreatmentDescription(value: String): Self = this.set("TreatmentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreatmentDescription: Self = this.set("TreatmentDescription", js.undefined)
    
    @scala.inline
    def setTreatmentName(value: String): Self = this.set("TreatmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreatmentName: Self = this.set("TreatmentName", js.undefined)
  }
}
