package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scte35DeliveryRestrictions extends js.Object {
  
  /**
    * Corresponds to SCTE-35 archive_allowed_flag.
    */
  var ArchiveAllowedFlag: Scte35ArchiveAllowedFlag = js.native
  
  /**
    * Corresponds to SCTE-35 device_restrictions parameter.
    */
  var DeviceRestrictions: Scte35DeviceRestrictions = js.native
  
  /**
    * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
    */
  var NoRegionalBlackoutFlag: Scte35NoRegionalBlackoutFlag = js.native
  
  /**
    * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
    */
  var WebDeliveryAllowedFlag: Scte35WebDeliveryAllowedFlag = js.native
}
object Scte35DeliveryRestrictions {
  
  @scala.inline
  def apply(
    ArchiveAllowedFlag: Scte35ArchiveAllowedFlag,
    DeviceRestrictions: Scte35DeviceRestrictions,
    NoRegionalBlackoutFlag: Scte35NoRegionalBlackoutFlag,
    WebDeliveryAllowedFlag: Scte35WebDeliveryAllowedFlag
  ): Scte35DeliveryRestrictions = {
    val __obj = js.Dynamic.literal(ArchiveAllowedFlag = ArchiveAllowedFlag.asInstanceOf[js.Any], DeviceRestrictions = DeviceRestrictions.asInstanceOf[js.Any], NoRegionalBlackoutFlag = NoRegionalBlackoutFlag.asInstanceOf[js.Any], WebDeliveryAllowedFlag = WebDeliveryAllowedFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35DeliveryRestrictions]
  }
  
  @scala.inline
  implicit class Scte35DeliveryRestrictionsOps[Self <: Scte35DeliveryRestrictions] (val x: Self) extends AnyVal {
    
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
    def setArchiveAllowedFlag(value: Scte35ArchiveAllowedFlag): Self = this.set("ArchiveAllowedFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRestrictions(value: Scte35DeviceRestrictions): Self = this.set("DeviceRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRegionalBlackoutFlag(value: Scte35NoRegionalBlackoutFlag): Self = this.set("NoRegionalBlackoutFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebDeliveryAllowedFlag(value: Scte35WebDeliveryAllowedFlag): Self = this.set("WebDeliveryAllowedFlag", value.asInstanceOf[js.Any])
  }
}
