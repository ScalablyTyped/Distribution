package typings.awsSdkClientS3Browser.typesRuleMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.UnmarshalledAbortIncompleteMultipartUpload
import typings.awsSdkClientS3Browser.typesLifecycleExpirationMod.UnmarshalledLifecycleExpiration
import typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.UnmarshalledNoncurrentVersionExpiration
import typings.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.UnmarshalledNoncurrentVersionTransition
import typings.awsSdkClientS3Browser.typesTransitionMod.UnmarshalledTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledRule extends Rule {
  
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  @JSName("AbortIncompleteMultipartUpload")
  var AbortIncompleteMultipartUpload_UnmarshalledRule: js.UndefOr[UnmarshalledAbortIncompleteMultipartUpload] = js.native
  
  /**
    * _LifecycleExpiration shape
    */
  @JSName("Expiration")
  var Expiration_UnmarshalledRule: js.UndefOr[UnmarshalledLifecycleExpiration] = js.native
  
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionExpiration")
  var NoncurrentVersionExpiration_UnmarshalledRule: js.UndefOr[UnmarshalledNoncurrentVersionExpiration] = js.native
  
  /**
    * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA or GLACIER storage class at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionTransition")
  var NoncurrentVersionTransition_UnmarshalledRule: js.UndefOr[UnmarshalledNoncurrentVersionTransition] = js.native
  
  /**
    * _Transition shape
    */
  @JSName("Transition")
  var Transition_UnmarshalledRule: js.UndefOr[UnmarshalledTransition] = js.native
}
object UnmarshalledRule {
  
  @scala.inline
  def apply(Prefix: String, Status: Enabled | Disabled | String): UnmarshalledRule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRule]
  }
  
  @scala.inline
  implicit class UnmarshalledRuleOps[Self <: UnmarshalledRule] (val x: Self) extends AnyVal {
    
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
    def setAbortIncompleteMultipartUpload(value: UnmarshalledAbortIncompleteMultipartUpload): Self = this.set("AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortIncompleteMultipartUpload: Self = this.set("AbortIncompleteMultipartUpload", js.undefined)
    
    @scala.inline
    def setExpiration(value: UnmarshalledLifecycleExpiration): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionExpiration(value: UnmarshalledNoncurrentVersionExpiration): Self = this.set("NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentVersionExpiration: Self = this.set("NoncurrentVersionExpiration", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransition(value: UnmarshalledNoncurrentVersionTransition): Self = this.set("NoncurrentVersionTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentVersionTransition: Self = this.set("NoncurrentVersionTransition", js.undefined)
    
    @scala.inline
    def setTransition(value: UnmarshalledTransition): Self = this.set("Transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("Transition", js.undefined)
  }
}
