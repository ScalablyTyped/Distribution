package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJobOutput extends js.Object {
  
  var ArtifactList: js.UndefOr[typings.awsSdk.importexportMod.ArtifactList] = js.native
  
  var JobId: js.UndefOr[typings.awsSdk.importexportMod.JobId] = js.native
  
  var JobType: js.UndefOr[typings.awsSdk.importexportMod.JobType] = js.native
  
  var Signature: js.UndefOr[typings.awsSdk.importexportMod.Signature] = js.native
  
  var SignatureFileContents: js.UndefOr[typings.awsSdk.importexportMod.SignatureFileContents] = js.native
  
  var WarningMessage: js.UndefOr[typings.awsSdk.importexportMod.WarningMessage] = js.native
}
object CreateJobOutput {
  
  @scala.inline
  def apply(): CreateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobOutput]
  }
  
  @scala.inline
  implicit class CreateJobOutputOps[Self <: CreateJobOutput] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobType: Self = this.set("JobType", js.undefined)
    
    @scala.inline
    def setSignature(value: Signature): Self = this.set("Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("Signature", js.undefined)
    
    @scala.inline
    def setSignatureFileContents(value: SignatureFileContents): Self = this.set("SignatureFileContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureFileContents: Self = this.set("SignatureFileContents", js.undefined)
    
    @scala.inline
    def setWarningMessage(value: WarningMessage): Self = this.set("WarningMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningMessage: Self = this.set("WarningMessage", js.undefined)
  }
}
