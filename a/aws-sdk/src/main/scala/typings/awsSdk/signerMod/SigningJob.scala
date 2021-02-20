package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningJob extends StObject {
  
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
  implicit class SigningJobMutableBuilder[Self <: SigningJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setSignedObject(value: SignedObject): Self = StObject.set(x, "signedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedObjectUndefined: Self = StObject.set(x, "signedObject", js.undefined)
    
    @scala.inline
    def setSigningMaterial(value: SigningMaterial): Self = StObject.set(x, "signingMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningMaterialUndefined: Self = StObject.set(x, "signingMaterial", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStatus(value: SigningStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
