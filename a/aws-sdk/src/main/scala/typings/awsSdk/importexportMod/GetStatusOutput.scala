package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStatusOutput extends js.Object {
  
  var ArtifactList: js.UndefOr[typings.awsSdk.importexportMod.ArtifactList] = js.native
  
  var Carrier: js.UndefOr[typings.awsSdk.importexportMod.Carrier] = js.native
  
  var CreationDate: js.UndefOr[typings.awsSdk.importexportMod.CreationDate] = js.native
  
  var CurrentManifest: js.UndefOr[typings.awsSdk.importexportMod.CurrentManifest] = js.native
  
  var ErrorCount: js.UndefOr[typings.awsSdk.importexportMod.ErrorCount] = js.native
  
  var JobId: js.UndefOr[typings.awsSdk.importexportMod.JobId] = js.native
  
  var JobType: js.UndefOr[typings.awsSdk.importexportMod.JobType] = js.native
  
  var LocationCode: js.UndefOr[typings.awsSdk.importexportMod.LocationCode] = js.native
  
  var LocationMessage: js.UndefOr[typings.awsSdk.importexportMod.LocationMessage] = js.native
  
  var LogBucket: js.UndefOr[typings.awsSdk.importexportMod.LogBucket] = js.native
  
  var LogKey: js.UndefOr[typings.awsSdk.importexportMod.LogKey] = js.native
  
  var ProgressCode: js.UndefOr[typings.awsSdk.importexportMod.ProgressCode] = js.native
  
  var ProgressMessage: js.UndefOr[typings.awsSdk.importexportMod.ProgressMessage] = js.native
  
  var Signature: js.UndefOr[typings.awsSdk.importexportMod.Signature] = js.native
  
  var SignatureFileContents: js.UndefOr[Signature] = js.native
  
  var TrackingNumber: js.UndefOr[typings.awsSdk.importexportMod.TrackingNumber] = js.native
}
object GetStatusOutput {
  
  @scala.inline
  def apply(): GetStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStatusOutput]
  }
  
  @scala.inline
  implicit class GetStatusOutputOps[Self <: GetStatusOutput] (val x: Self) extends AnyVal {
    
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
    def setArtifactListVarargs(value: Artifact*): Self = this.set("ArtifactList", js.Array(value :_*))
    
    @scala.inline
    def setArtifactList(value: ArtifactList): Self = this.set("ArtifactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactList: Self = this.set("ArtifactList", js.undefined)
    
    @scala.inline
    def setCarrier(value: Carrier): Self = this.set("Carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrier: Self = this.set("Carrier", js.undefined)
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setCurrentManifest(value: CurrentManifest): Self = this.set("CurrentManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentManifest: Self = this.set("CurrentManifest", js.undefined)
    
    @scala.inline
    def setErrorCount(value: ErrorCount): Self = this.set("ErrorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCount: Self = this.set("ErrorCount", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobType: Self = this.set("JobType", js.undefined)
    
    @scala.inline
    def setLocationCode(value: LocationCode): Self = this.set("LocationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationCode: Self = this.set("LocationCode", js.undefined)
    
    @scala.inline
    def setLocationMessage(value: LocationMessage): Self = this.set("LocationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationMessage: Self = this.set("LocationMessage", js.undefined)
    
    @scala.inline
    def setLogBucket(value: LogBucket): Self = this.set("LogBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogBucket: Self = this.set("LogBucket", js.undefined)
    
    @scala.inline
    def setLogKey(value: LogKey): Self = this.set("LogKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogKey: Self = this.set("LogKey", js.undefined)
    
    @scala.inline
    def setProgressCode(value: ProgressCode): Self = this.set("ProgressCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressCode: Self = this.set("ProgressCode", js.undefined)
    
    @scala.inline
    def setProgressMessage(value: ProgressMessage): Self = this.set("ProgressMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressMessage: Self = this.set("ProgressMessage", js.undefined)
    
    @scala.inline
    def setSignature(value: Signature): Self = this.set("Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("Signature", js.undefined)
    
    @scala.inline
    def setSignatureFileContents(value: Signature): Self = this.set("SignatureFileContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureFileContents: Self = this.set("SignatureFileContents", js.undefined)
    
    @scala.inline
    def setTrackingNumber(value: TrackingNumber): Self = this.set("TrackingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingNumber: Self = this.set("TrackingNumber", js.undefined)
  }
}
