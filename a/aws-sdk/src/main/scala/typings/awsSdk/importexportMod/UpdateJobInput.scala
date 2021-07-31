package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobInput extends StObject {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.undefined
  
  var JobId: typings.awsSdk.importexportMod.JobId
  
  var JobType: typings.awsSdk.importexportMod.JobType
  
  var Manifest: typings.awsSdk.importexportMod.Manifest
  
  var ValidateOnly: typings.awsSdk.importexportMod.ValidateOnly
}
object UpdateJobInput {
  
  @scala.inline
  def apply(JobId: JobId, JobType: JobType, Manifest: Manifest, ValidateOnly: ValidateOnly): UpdateJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobInput]
  }
  
  @scala.inline
  implicit class UpdateJobInputMutableBuilder[Self <: UpdateJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPIVersion(value: APIVersion_): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPIVersionUndefined: Self = StObject.set(x, "APIVersion", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: Manifest): Self = StObject.set(x, "Manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnly(value: ValidateOnly): Self = StObject.set(x, "ValidateOnly", value.asInstanceOf[js.Any])
  }
}
