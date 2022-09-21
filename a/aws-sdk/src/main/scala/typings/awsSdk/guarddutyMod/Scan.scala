package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scan extends StObject {
  
  /**
    * The ID for the account that belongs to the scan.
    */
  var AccountId: js.UndefOr[typings.awsSdk.guarddutyMod.AccountId] = js.undefined
  
  /**
    * The unique detector ID of the administrator account that the request is associated with. Note that this value will be the same as the one used for DetectorId if the account is an administrator.
    */
  var AdminDetectorId: js.UndefOr[DetectorId] = js.undefined
  
  /**
    * List of volumes that were attached to the original instance to be scanned.
    */
  var AttachedVolumes: js.UndefOr[VolumeDetails] = js.undefined
  
  /**
    * The unique ID of the detector that the request is associated with.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.guarddutyMod.DetectorId] = js.undefined
  
  /**
    * Represents the reason for FAILED scan status.
    */
  var FailureReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Represents the number of files that were scanned.
    */
  var FileCount: js.UndefOr[PositiveLong] = js.undefined
  
  /**
    * Represents the resources that were scanned in the scan entry.
    */
  var ResourceDetails: js.UndefOr[typings.awsSdk.guarddutyMod.ResourceDetails] = js.undefined
  
  /**
    * The timestamp of when the scan was finished.
    */
  var ScanEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique scan ID associated with a scan entry.
    */
  var ScanId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Represents the result of the scan.
    */
  var ScanResultDetails: js.UndefOr[typings.awsSdk.guarddutyMod.ScanResultDetails] = js.undefined
  
  /**
    * The timestamp of when the scan was triggered.
    */
  var ScanStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An enum value representing possible scan statuses.
    */
  var ScanStatus: js.UndefOr[typings.awsSdk.guarddutyMod.ScanStatus] = js.undefined
  
  /**
    * Represents total bytes that were scanned.
    */
  var TotalBytes: js.UndefOr[PositiveLong] = js.undefined
  
  /**
    * Represents the reason the scan was triggered.
    */
  var TriggerDetails: js.UndefOr[typings.awsSdk.guarddutyMod.TriggerDetails] = js.undefined
}
object Scan {
  
  inline def apply(): Scan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scan]
  }
  
  extension [Self <: Scan](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAdminDetectorId(value: DetectorId): Self = StObject.set(x, "AdminDetectorId", value.asInstanceOf[js.Any])
    
    inline def setAdminDetectorIdUndefined: Self = StObject.set(x, "AdminDetectorId", js.undefined)
    
    inline def setAttachedVolumes(value: VolumeDetails): Self = StObject.set(x, "AttachedVolumes", value.asInstanceOf[js.Any])
    
    inline def setAttachedVolumesUndefined: Self = StObject.set(x, "AttachedVolumes", js.undefined)
    
    inline def setAttachedVolumesVarargs(value: VolumeDetail*): Self = StObject.set(x, "AttachedVolumes", js.Array(value*))
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "DetectorId", js.undefined)
    
    inline def setFailureReason(value: NonEmptyString): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFileCount(value: PositiveLong): Self = StObject.set(x, "FileCount", value.asInstanceOf[js.Any])
    
    inline def setFileCountUndefined: Self = StObject.set(x, "FileCount", js.undefined)
    
    inline def setResourceDetails(value: ResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
    
    inline def setResourceDetailsUndefined: Self = StObject.set(x, "ResourceDetails", js.undefined)
    
    inline def setScanEndTime(value: js.Date): Self = StObject.set(x, "ScanEndTime", value.asInstanceOf[js.Any])
    
    inline def setScanEndTimeUndefined: Self = StObject.set(x, "ScanEndTime", js.undefined)
    
    inline def setScanId(value: NonEmptyString): Self = StObject.set(x, "ScanId", value.asInstanceOf[js.Any])
    
    inline def setScanIdUndefined: Self = StObject.set(x, "ScanId", js.undefined)
    
    inline def setScanResultDetails(value: ScanResultDetails): Self = StObject.set(x, "ScanResultDetails", value.asInstanceOf[js.Any])
    
    inline def setScanResultDetailsUndefined: Self = StObject.set(x, "ScanResultDetails", js.undefined)
    
    inline def setScanStartTime(value: js.Date): Self = StObject.set(x, "ScanStartTime", value.asInstanceOf[js.Any])
    
    inline def setScanStartTimeUndefined: Self = StObject.set(x, "ScanStartTime", js.undefined)
    
    inline def setScanStatus(value: ScanStatus): Self = StObject.set(x, "ScanStatus", value.asInstanceOf[js.Any])
    
    inline def setScanStatusUndefined: Self = StObject.set(x, "ScanStatus", js.undefined)
    
    inline def setTotalBytes(value: PositiveLong): Self = StObject.set(x, "TotalBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesUndefined: Self = StObject.set(x, "TotalBytes", js.undefined)
    
    inline def setTriggerDetails(value: TriggerDetails): Self = StObject.set(x, "TriggerDetails", value.asInstanceOf[js.Any])
    
    inline def setTriggerDetailsUndefined: Self = StObject.set(x, "TriggerDetails", js.undefined)
  }
}
