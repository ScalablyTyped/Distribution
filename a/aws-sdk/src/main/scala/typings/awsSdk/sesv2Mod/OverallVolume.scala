package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverallVolume extends StObject {
  
  /**
    * An object that contains inbox and junk mail placement metrics for individual email providers.
    */
  var DomainIspPlacements: js.UndefOr[typings.awsSdk.sesv2Mod.DomainIspPlacements] = js.native
  
  /**
    * The percentage of emails that were sent from the domain that were read by their recipients.
    */
  var ReadRatePercent: js.UndefOr[Percentage] = js.native
  
  /**
    * An object that contains information about the numbers of messages that arrived in recipients' inboxes and junk mail folders.
    */
  var VolumeStatistics: js.UndefOr[typings.awsSdk.sesv2Mod.VolumeStatistics] = js.native
}
object OverallVolume {
  
  @scala.inline
  def apply(): OverallVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverallVolume]
  }
  
  @scala.inline
  implicit class OverallVolumeMutableBuilder[Self <: OverallVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainIspPlacements(value: DomainIspPlacements): Self = StObject.set(x, "DomainIspPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIspPlacementsUndefined: Self = StObject.set(x, "DomainIspPlacements", js.undefined)
    
    @scala.inline
    def setDomainIspPlacementsVarargs(value: DomainIspPlacement*): Self = StObject.set(x, "DomainIspPlacements", js.Array(value :_*))
    
    @scala.inline
    def setReadRatePercent(value: Percentage): Self = StObject.set(x, "ReadRatePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadRatePercentUndefined: Self = StObject.set(x, "ReadRatePercent", js.undefined)
    
    @scala.inline
    def setVolumeStatistics(value: VolumeStatistics): Self = StObject.set(x, "VolumeStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeStatisticsUndefined: Self = StObject.set(x, "VolumeStatistics", js.undefined)
  }
}
