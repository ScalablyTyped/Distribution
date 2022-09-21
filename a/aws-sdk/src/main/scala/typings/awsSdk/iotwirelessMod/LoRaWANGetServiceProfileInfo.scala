package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANGetServiceProfileInfo extends StObject {
  
  /**
    * The AddGWMetaData value.
    */
  var AddGwMetadata: js.UndefOr[typings.awsSdk.iotwirelessMod.AddGwMetadata] = js.undefined
  
  /**
    * The ChannelMask value.
    */
  var ChannelMask: js.UndefOr[typings.awsSdk.iotwirelessMod.ChannelMask] = js.undefined
  
  /**
    * The DevStatusReqFreq value.
    */
  var DevStatusReqFreq: js.UndefOr[typings.awsSdk.iotwirelessMod.DevStatusReqFreq] = js.undefined
  
  /**
    * The DLBucketSize value.
    */
  var DlBucketSize: js.UndefOr[typings.awsSdk.iotwirelessMod.DlBucketSize] = js.undefined
  
  /**
    * The DLRate value.
    */
  var DlRate: js.UndefOr[typings.awsSdk.iotwirelessMod.DlRate] = js.undefined
  
  /**
    * The DLRatePolicy value.
    */
  var DlRatePolicy: js.UndefOr[typings.awsSdk.iotwirelessMod.DlRatePolicy] = js.undefined
  
  /**
    * The DRMax value.
    */
  var DrMax: js.UndefOr[typings.awsSdk.iotwirelessMod.DrMax] = js.undefined
  
  /**
    * The DRMin value.
    */
  var DrMin: js.UndefOr[typings.awsSdk.iotwirelessMod.DrMin] = js.undefined
  
  /**
    * The HRAllowed value that describes whether handover roaming is allowed.
    */
  var HrAllowed: js.UndefOr[typings.awsSdk.iotwirelessMod.HrAllowed] = js.undefined
  
  /**
    * The MinGwDiversity value.
    */
  var MinGwDiversity: js.UndefOr[typings.awsSdk.iotwirelessMod.MinGwDiversity] = js.undefined
  
  /**
    * The NwkGeoLoc value.
    */
  var NwkGeoLoc: js.UndefOr[typings.awsSdk.iotwirelessMod.NwkGeoLoc] = js.undefined
  
  /**
    * The PRAllowed value that describes whether passive roaming is allowed.
    */
  var PrAllowed: js.UndefOr[typings.awsSdk.iotwirelessMod.PrAllowed] = js.undefined
  
  /**
    * The RAAllowed value that describes whether roaming activation is allowed.
    */
  var RaAllowed: js.UndefOr[typings.awsSdk.iotwirelessMod.RaAllowed] = js.undefined
  
  /**
    * The ReportDevStatusBattery value.
    */
  var ReportDevStatusBattery: js.UndefOr[typings.awsSdk.iotwirelessMod.ReportDevStatusBattery] = js.undefined
  
  /**
    * The ReportDevStatusMargin value.
    */
  var ReportDevStatusMargin: js.UndefOr[typings.awsSdk.iotwirelessMod.ReportDevStatusMargin] = js.undefined
  
  /**
    * The TargetPER value.
    */
  var TargetPer: js.UndefOr[typings.awsSdk.iotwirelessMod.TargetPer] = js.undefined
  
  /**
    * The ULBucketSize value.
    */
  var UlBucketSize: js.UndefOr[typings.awsSdk.iotwirelessMod.UlBucketSize] = js.undefined
  
  /**
    * The ULRate value.
    */
  var UlRate: js.UndefOr[typings.awsSdk.iotwirelessMod.UlRate] = js.undefined
  
  /**
    * The ULRatePolicy value.
    */
  var UlRatePolicy: js.UndefOr[typings.awsSdk.iotwirelessMod.UlRatePolicy] = js.undefined
}
object LoRaWANGetServiceProfileInfo {
  
  inline def apply(): LoRaWANGetServiceProfileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANGetServiceProfileInfo]
  }
  
  extension [Self <: LoRaWANGetServiceProfileInfo](x: Self) {
    
    inline def setAddGwMetadata(value: AddGwMetadata): Self = StObject.set(x, "AddGwMetadata", value.asInstanceOf[js.Any])
    
    inline def setAddGwMetadataUndefined: Self = StObject.set(x, "AddGwMetadata", js.undefined)
    
    inline def setChannelMask(value: ChannelMask): Self = StObject.set(x, "ChannelMask", value.asInstanceOf[js.Any])
    
    inline def setChannelMaskUndefined: Self = StObject.set(x, "ChannelMask", js.undefined)
    
    inline def setDevStatusReqFreq(value: DevStatusReqFreq): Self = StObject.set(x, "DevStatusReqFreq", value.asInstanceOf[js.Any])
    
    inline def setDevStatusReqFreqUndefined: Self = StObject.set(x, "DevStatusReqFreq", js.undefined)
    
    inline def setDlBucketSize(value: DlBucketSize): Self = StObject.set(x, "DlBucketSize", value.asInstanceOf[js.Any])
    
    inline def setDlBucketSizeUndefined: Self = StObject.set(x, "DlBucketSize", js.undefined)
    
    inline def setDlRate(value: DlRate): Self = StObject.set(x, "DlRate", value.asInstanceOf[js.Any])
    
    inline def setDlRatePolicy(value: DlRatePolicy): Self = StObject.set(x, "DlRatePolicy", value.asInstanceOf[js.Any])
    
    inline def setDlRatePolicyUndefined: Self = StObject.set(x, "DlRatePolicy", js.undefined)
    
    inline def setDlRateUndefined: Self = StObject.set(x, "DlRate", js.undefined)
    
    inline def setDrMax(value: DrMax): Self = StObject.set(x, "DrMax", value.asInstanceOf[js.Any])
    
    inline def setDrMaxUndefined: Self = StObject.set(x, "DrMax", js.undefined)
    
    inline def setDrMin(value: DrMin): Self = StObject.set(x, "DrMin", value.asInstanceOf[js.Any])
    
    inline def setDrMinUndefined: Self = StObject.set(x, "DrMin", js.undefined)
    
    inline def setHrAllowed(value: HrAllowed): Self = StObject.set(x, "HrAllowed", value.asInstanceOf[js.Any])
    
    inline def setHrAllowedUndefined: Self = StObject.set(x, "HrAllowed", js.undefined)
    
    inline def setMinGwDiversity(value: MinGwDiversity): Self = StObject.set(x, "MinGwDiversity", value.asInstanceOf[js.Any])
    
    inline def setMinGwDiversityUndefined: Self = StObject.set(x, "MinGwDiversity", js.undefined)
    
    inline def setNwkGeoLoc(value: NwkGeoLoc): Self = StObject.set(x, "NwkGeoLoc", value.asInstanceOf[js.Any])
    
    inline def setNwkGeoLocUndefined: Self = StObject.set(x, "NwkGeoLoc", js.undefined)
    
    inline def setPrAllowed(value: PrAllowed): Self = StObject.set(x, "PrAllowed", value.asInstanceOf[js.Any])
    
    inline def setPrAllowedUndefined: Self = StObject.set(x, "PrAllowed", js.undefined)
    
    inline def setRaAllowed(value: RaAllowed): Self = StObject.set(x, "RaAllowed", value.asInstanceOf[js.Any])
    
    inline def setRaAllowedUndefined: Self = StObject.set(x, "RaAllowed", js.undefined)
    
    inline def setReportDevStatusBattery(value: ReportDevStatusBattery): Self = StObject.set(x, "ReportDevStatusBattery", value.asInstanceOf[js.Any])
    
    inline def setReportDevStatusBatteryUndefined: Self = StObject.set(x, "ReportDevStatusBattery", js.undefined)
    
    inline def setReportDevStatusMargin(value: ReportDevStatusMargin): Self = StObject.set(x, "ReportDevStatusMargin", value.asInstanceOf[js.Any])
    
    inline def setReportDevStatusMarginUndefined: Self = StObject.set(x, "ReportDevStatusMargin", js.undefined)
    
    inline def setTargetPer(value: TargetPer): Self = StObject.set(x, "TargetPer", value.asInstanceOf[js.Any])
    
    inline def setTargetPerUndefined: Self = StObject.set(x, "TargetPer", js.undefined)
    
    inline def setUlBucketSize(value: UlBucketSize): Self = StObject.set(x, "UlBucketSize", value.asInstanceOf[js.Any])
    
    inline def setUlBucketSizeUndefined: Self = StObject.set(x, "UlBucketSize", js.undefined)
    
    inline def setUlRate(value: UlRate): Self = StObject.set(x, "UlRate", value.asInstanceOf[js.Any])
    
    inline def setUlRatePolicy(value: UlRatePolicy): Self = StObject.set(x, "UlRatePolicy", value.asInstanceOf[js.Any])
    
    inline def setUlRatePolicyUndefined: Self = StObject.set(x, "UlRatePolicy", js.undefined)
    
    inline def setUlRateUndefined: Self = StObject.set(x, "UlRate", js.undefined)
  }
}
