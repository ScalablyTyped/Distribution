package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobInput extends js.Object {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  
  var JobId: typings.awsSdk.importexportMod.JobId = js.native
  
  var JobType: typings.awsSdk.importexportMod.JobType = js.native
  
  var Manifest: typings.awsSdk.importexportMod.Manifest = js.native
  
  var ValidateOnly: typings.awsSdk.importexportMod.ValidateOnly = js.native
}
object UpdateJobInput {
  
  @scala.inline
  def apply(JobId: JobId, JobType: JobType, Manifest: Manifest, ValidateOnly: ValidateOnly): UpdateJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobInput]
  }
  
  @scala.inline
  implicit class UpdateJobInputOps[Self <: UpdateJobInput] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobType(value: JobType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: Manifest): Self = this.set("Manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnly(value: ValidateOnly): Self = this.set("ValidateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPIVersion(value: APIVersion_): Self = this.set("APIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAPIVersion: Self = this.set("APIVersion", js.undefined)
  }
}
