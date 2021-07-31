package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobOutput extends StObject {
  
  var ArtifactList: js.UndefOr[typings.awsSdk.importexportMod.ArtifactList] = js.undefined
  
  var JobId: js.UndefOr[typings.awsSdk.importexportMod.JobId] = js.undefined
  
  var JobType: js.UndefOr[typings.awsSdk.importexportMod.JobType] = js.undefined
  
  var Signature: js.UndefOr[typings.awsSdk.importexportMod.Signature] = js.undefined
  
  var SignatureFileContents: js.UndefOr[typings.awsSdk.importexportMod.SignatureFileContents] = js.undefined
  
  var WarningMessage: js.UndefOr[typings.awsSdk.importexportMod.WarningMessage] = js.undefined
}
object CreateJobOutput {
  
  @scala.inline
  def apply(): CreateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobOutput]
  }
  
  @scala.inline
  implicit class CreateJobOutputMutableBuilder[Self <: CreateJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactList(value: ArtifactList): Self = StObject.set(x, "ArtifactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactListUndefined: Self = StObject.set(x, "ArtifactList", js.undefined)
    
    @scala.inline
    def setArtifactListVarargs(value: Artifact*): Self = StObject.set(x, "ArtifactList", js.Array(value :_*))
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    @scala.inline
    def setSignature(value: Signature): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureFileContents(value: SignatureFileContents): Self = StObject.set(x, "SignatureFileContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureFileContentsUndefined: Self = StObject.set(x, "SignatureFileContents", js.undefined)
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    @scala.inline
    def setWarningMessage(value: WarningMessage): Self = StObject.set(x, "WarningMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningMessageUndefined: Self = StObject.set(x, "WarningMessage", js.undefined)
  }
}
