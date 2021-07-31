package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStatusOutput extends StObject {
  
  var ArtifactList: js.UndefOr[typings.awsSdk.importexportMod.ArtifactList] = js.undefined
  
  var Carrier: js.UndefOr[typings.awsSdk.importexportMod.Carrier] = js.undefined
  
  var CreationDate: js.UndefOr[typings.awsSdk.importexportMod.CreationDate] = js.undefined
  
  var CurrentManifest: js.UndefOr[typings.awsSdk.importexportMod.CurrentManifest] = js.undefined
  
  var ErrorCount: js.UndefOr[typings.awsSdk.importexportMod.ErrorCount] = js.undefined
  
  var JobId: js.UndefOr[typings.awsSdk.importexportMod.JobId] = js.undefined
  
  var JobType: js.UndefOr[typings.awsSdk.importexportMod.JobType] = js.undefined
  
  var LocationCode: js.UndefOr[typings.awsSdk.importexportMod.LocationCode] = js.undefined
  
  var LocationMessage: js.UndefOr[typings.awsSdk.importexportMod.LocationMessage] = js.undefined
  
  var LogBucket: js.UndefOr[typings.awsSdk.importexportMod.LogBucket] = js.undefined
  
  var LogKey: js.UndefOr[typings.awsSdk.importexportMod.LogKey] = js.undefined
  
  var ProgressCode: js.UndefOr[typings.awsSdk.importexportMod.ProgressCode] = js.undefined
  
  var ProgressMessage: js.UndefOr[typings.awsSdk.importexportMod.ProgressMessage] = js.undefined
  
  var Signature: js.UndefOr[typings.awsSdk.importexportMod.Signature] = js.undefined
  
  var SignatureFileContents: js.UndefOr[Signature] = js.undefined
  
  var TrackingNumber: js.UndefOr[typings.awsSdk.importexportMod.TrackingNumber] = js.undefined
}
object GetStatusOutput {
  
  @scala.inline
  def apply(): GetStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStatusOutput]
  }
  
  @scala.inline
  implicit class GetStatusOutputMutableBuilder[Self <: GetStatusOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactList(value: ArtifactList): Self = StObject.set(x, "ArtifactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactListUndefined: Self = StObject.set(x, "ArtifactList", js.undefined)
    
    @scala.inline
    def setArtifactListVarargs(value: Artifact*): Self = StObject.set(x, "ArtifactList", js.Array(value :_*))
    
    @scala.inline
    def setCarrier(value: Carrier): Self = StObject.set(x, "Carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "Carrier", js.undefined)
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setCurrentManifest(value: CurrentManifest): Self = StObject.set(x, "CurrentManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentManifestUndefined: Self = StObject.set(x, "CurrentManifest", js.undefined)
    
    @scala.inline
    def setErrorCount(value: ErrorCount): Self = StObject.set(x, "ErrorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCountUndefined: Self = StObject.set(x, "ErrorCount", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    @scala.inline
    def setLocationCode(value: LocationCode): Self = StObject.set(x, "LocationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationCodeUndefined: Self = StObject.set(x, "LocationCode", js.undefined)
    
    @scala.inline
    def setLocationMessage(value: LocationMessage): Self = StObject.set(x, "LocationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationMessageUndefined: Self = StObject.set(x, "LocationMessage", js.undefined)
    
    @scala.inline
    def setLogBucket(value: LogBucket): Self = StObject.set(x, "LogBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogBucketUndefined: Self = StObject.set(x, "LogBucket", js.undefined)
    
    @scala.inline
    def setLogKey(value: LogKey): Self = StObject.set(x, "LogKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogKeyUndefined: Self = StObject.set(x, "LogKey", js.undefined)
    
    @scala.inline
    def setProgressCode(value: ProgressCode): Self = StObject.set(x, "ProgressCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressCodeUndefined: Self = StObject.set(x, "ProgressCode", js.undefined)
    
    @scala.inline
    def setProgressMessage(value: ProgressMessage): Self = StObject.set(x, "ProgressMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressMessageUndefined: Self = StObject.set(x, "ProgressMessage", js.undefined)
    
    @scala.inline
    def setSignature(value: Signature): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureFileContents(value: Signature): Self = StObject.set(x, "SignatureFileContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureFileContentsUndefined: Self = StObject.set(x, "SignatureFileContents", js.undefined)
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    @scala.inline
    def setTrackingNumber(value: TrackingNumber): Self = StObject.set(x, "TrackingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingNumberUndefined: Self = StObject.set(x, "TrackingNumber", js.undefined)
  }
}
