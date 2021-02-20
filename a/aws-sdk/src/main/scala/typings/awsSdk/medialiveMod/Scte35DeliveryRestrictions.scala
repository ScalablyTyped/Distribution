package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scte35DeliveryRestrictions extends StObject {
  
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
  implicit class Scte35DeliveryRestrictionsMutableBuilder[Self <: Scte35DeliveryRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveAllowedFlag(value: Scte35ArchiveAllowedFlag): Self = StObject.set(x, "ArchiveAllowedFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRestrictions(value: Scte35DeviceRestrictions): Self = StObject.set(x, "DeviceRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRegionalBlackoutFlag(value: Scte35NoRegionalBlackoutFlag): Self = StObject.set(x, "NoRegionalBlackoutFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebDeliveryAllowedFlag(value: Scte35WebDeliveryAllowedFlag): Self = StObject.set(x, "WebDeliveryAllowedFlag", value.asInstanceOf[js.Any])
  }
}
