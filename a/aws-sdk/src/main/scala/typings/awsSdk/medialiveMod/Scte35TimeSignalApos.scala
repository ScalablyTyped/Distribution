package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scte35TimeSignalApos extends StObject {
  
  /**
    * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to embedded SCTE 104/35 messages and does not apply to OOB messages.
    */
  var AdAvailOffset: js.UndefOr[integerMinNegative1000Max1000] = js.undefined
  
  /**
    * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set to 0 will no longer trigger blackouts or Ad Avail slates
    */
  var NoRegionalBlackoutFlag: js.UndefOr[Scte35AposNoRegionalBlackoutBehavior] = js.undefined
  
  /**
    * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set to 0 will no longer trigger blackouts or Ad Avail slates
    */
  var WebDeliveryAllowedFlag: js.UndefOr[Scte35AposWebDeliveryAllowedBehavior] = js.undefined
}
object Scte35TimeSignalApos {
  
  inline def apply(): Scte35TimeSignalApos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scte35TimeSignalApos]
  }
  
  extension [Self <: Scte35TimeSignalApos](x: Self) {
    
    inline def setAdAvailOffset(value: integerMinNegative1000Max1000): Self = StObject.set(x, "AdAvailOffset", value.asInstanceOf[js.Any])
    
    inline def setAdAvailOffsetUndefined: Self = StObject.set(x, "AdAvailOffset", js.undefined)
    
    inline def setNoRegionalBlackoutFlag(value: Scte35AposNoRegionalBlackoutBehavior): Self = StObject.set(x, "NoRegionalBlackoutFlag", value.asInstanceOf[js.Any])
    
    inline def setNoRegionalBlackoutFlagUndefined: Self = StObject.set(x, "NoRegionalBlackoutFlag", js.undefined)
    
    inline def setWebDeliveryAllowedFlag(value: Scte35AposWebDeliveryAllowedBehavior): Self = StObject.set(x, "WebDeliveryAllowedFlag", value.asInstanceOf[js.Any])
    
    inline def setWebDeliveryAllowedFlagUndefined: Self = StObject.set(x, "WebDeliveryAllowedFlag", js.undefined)
  }
}
