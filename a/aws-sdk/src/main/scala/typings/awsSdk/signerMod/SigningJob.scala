package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningJob extends js.Object {
  
  /**
    * The date and time that the signing job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The ID of the signing job.
    */
  var jobId: js.UndefOr[JobId] = js.native
  
  /**
    * A SignedObject structure that contains information about a signing job's signed code image.
    */
  var signedObject: js.UndefOr[SignedObject] = js.native
  
  /**
    * A SigningMaterial object that contains the Amazon Resource Name (ARN) of the certificate used for the signing job.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  
  /**
    * A Source that contains information about a signing job's code image source.
    */
  var source: js.UndefOr[Source] = js.native
  
  /**
    * The status of the signing job.
    */
  var status: js.UndefOr[SigningStatus] = js.native
}
object SigningJob {
  
  @scala.inline
  def apply(): SigningJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningJob]
  }
  
  @scala.inline
  implicit class SigningJobOps[Self <: SigningJob] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: CreatedAt): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setSignedObject(value: SignedObject): Self = this.set("signedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedObject: Self = this.set("signedObject", js.undefined)
    
    @scala.inline
    def setSigningMaterial(value: SigningMaterial): Self = this.set("signingMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningMaterial: Self = this.set("signingMaterial", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStatus(value: SigningStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
