package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSigningJobResponse extends js.Object {
  
  /**
    * Date and time that the signing job was completed.
    */
  var completedAt: js.UndefOr[CompletedAt] = js.native
  
  /**
    * Date and time that the signing job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The ID of the signing job on output.
    */
  var jobId: js.UndefOr[JobId] = js.native
  
  /**
    * A list of any overrides that were applied to the signing operation.
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.native
  
  /**
    * The microcontroller platform to which your signed code image will be distributed.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  
  /**
    * The name of the profile that initiated the signing operation.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  
  /**
    * The IAM principal that requested the signing job.
    */
  var requestedBy: js.UndefOr[RequestedBy] = js.native
  
  /**
    * Name of the S3 bucket where the signed code image is saved by code signing.
    */
  var signedObject: js.UndefOr[SignedObject] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of your code signing certificate.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  
  /**
    * Map of user-assigned key-value pairs used during signing. These values contain any information that you specified for use in your signing job. 
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.native
  
  /**
    * The object that contains the name of your S3 bucket or your raw code.
    */
  var source: js.UndefOr[Source] = js.native
  
  /**
    * Status of the signing job.
    */
  var status: js.UndefOr[SigningStatus] = js.native
  
  /**
    * String value that contains the status reason.
    */
  var statusReason: js.UndefOr[StatusReason] = js.native
}
object DescribeSigningJobResponse {
  
  @scala.inline
  def apply(): DescribeSigningJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSigningJobResponse]
  }
  
  @scala.inline
  implicit class DescribeSigningJobResponseOps[Self <: DescribeSigningJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompletedAt(value: CompletedAt): Self = this.set("completedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedAt: Self = this.set("completedAt", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setOverrides(value: SigningPlatformOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPlatformId(value: PlatformId): Self = this.set("platformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformId: Self = this.set("platformId", js.undefined)
    
    @scala.inline
    def setProfileName(value: ProfileName): Self = this.set("profileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileName: Self = this.set("profileName", js.undefined)
    
    @scala.inline
    def setRequestedBy(value: RequestedBy): Self = this.set("requestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedBy: Self = this.set("requestedBy", js.undefined)
    
    @scala.inline
    def setSignedObject(value: SignedObject): Self = this.set("signedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedObject: Self = this.set("signedObject", js.undefined)
    
    @scala.inline
    def setSigningMaterial(value: SigningMaterial): Self = this.set("signingMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningMaterial: Self = this.set("signingMaterial", js.undefined)
    
    @scala.inline
    def setSigningParameters(value: SigningParameters): Self = this.set("signingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningParameters: Self = this.set("signingParameters", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStatus(value: SigningStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusReason(value: StatusReason): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
  }
}
