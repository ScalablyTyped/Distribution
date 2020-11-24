package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverallVolume extends js.Object {
  
  /**
    * An object that contains inbox and junk mail placement metrics for individual email providers.
    */
  var DomainIspPlacements: js.UndefOr[typings.awsSdk.pinpointemailMod.DomainIspPlacements] = js.native
  
  /**
    * The percentage of emails that were sent from the domain that were read by their recipients.
    */
  var ReadRatePercent: js.UndefOr[Percentage] = js.native
  
  /**
    * An object that contains information about the numbers of messages that arrived in recipients' inboxes and junk mail folders.
    */
  var VolumeStatistics: js.UndefOr[typings.awsSdk.pinpointemailMod.VolumeStatistics] = js.native
}
object OverallVolume {
  
  @scala.inline
  def apply(): OverallVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverallVolume]
  }
  
  @scala.inline
  implicit class OverallVolumeOps[Self <: OverallVolume] (val x: Self) extends AnyVal {
    
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
    def setDomainIspPlacementsVarargs(value: DomainIspPlacement*): Self = this.set("DomainIspPlacements", js.Array(value :_*))
    
    @scala.inline
    def setDomainIspPlacements(value: DomainIspPlacements): Self = this.set("DomainIspPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainIspPlacements: Self = this.set("DomainIspPlacements", js.undefined)
    
    @scala.inline
    def setReadRatePercent(value: Percentage): Self = this.set("ReadRatePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadRatePercent: Self = this.set("ReadRatePercent", js.undefined)
    
    @scala.inline
    def setVolumeStatistics(value: VolumeStatistics): Self = this.set("VolumeStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeStatistics: Self = this.set("VolumeStatistics", js.undefined)
  }
}
