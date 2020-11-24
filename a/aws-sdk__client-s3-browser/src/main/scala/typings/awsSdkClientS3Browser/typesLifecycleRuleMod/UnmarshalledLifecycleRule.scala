package typings.awsSdkClientS3Browser.typesLifecycleRuleMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.UnmarshalledAbortIncompleteMultipartUpload
import typings.awsSdkClientS3Browser.typesLifecycleExpirationMod.UnmarshalledLifecycleExpiration
import typings.awsSdkClientS3Browser.typesLifecycleRuleFilterMod.UnmarshalledLifecycleRuleFilter
import typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.UnmarshalledNoncurrentVersionExpiration
import typings.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.UnmarshalledNoncurrentVersionTransition
import typings.awsSdkClientS3Browser.typesTransitionMod.UnmarshalledTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledLifecycleRule extends LifecycleRule {
  
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  @JSName("AbortIncompleteMultipartUpload")
  var AbortIncompleteMultipartUpload_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledAbortIncompleteMultipartUpload] = js.native
  
  /**
    * _LifecycleExpiration shape
    */
  @JSName("Expiration")
  var Expiration_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledLifecycleExpiration] = js.native
  
  /**
    * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledLifecycleRuleFilter] = js.native
  
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionExpiration")
  var NoncurrentVersionExpiration_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledNoncurrentVersionExpiration] = js.native
  
  /**
    * _NoncurrentVersionTransitionList shape
    */
  @JSName("NoncurrentVersionTransitions")
  var NoncurrentVersionTransitions_UnmarshalledLifecycleRule: js.UndefOr[js.Array[UnmarshalledNoncurrentVersionTransition]] = js.native
  
  /**
    * _TransitionList shape
    */
  @JSName("Transitions")
  var Transitions_UnmarshalledLifecycleRule: js.UndefOr[js.Array[UnmarshalledTransition]] = js.native
}
object UnmarshalledLifecycleRule {
  
  @scala.inline
  def apply(Status: Enabled | Disabled | String): UnmarshalledLifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLifecycleRule]
  }
  
  @scala.inline
  implicit class UnmarshalledLifecycleRuleOps[Self <: UnmarshalledLifecycleRule] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: UnmarshalledLifecycleRuleFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionExpiration(value: UnmarshalledNoncurrentVersionExpiration): Self = this.set("NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentVersionExpiration: Self = this.set("NoncurrentVersionExpiration", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransitionsVarargs(value: UnmarshalledNoncurrentVersionTransition*): Self = this.set("NoncurrentVersionTransitions", js.Array(value :_*))
    
    @scala.inline
    def setNoncurrentVersionTransitions(value: js.Array[UnmarshalledNoncurrentVersionTransition]): Self = this.set("NoncurrentVersionTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentVersionTransitions: Self = this.set("NoncurrentVersionTransitions", js.undefined)
    
    @scala.inline
    def setTransitionsVarargs(value: UnmarshalledTransition*): Self = this.set("Transitions", js.Array(value :_*))
    
    @scala.inline
    def setTransitions(value: js.Array[UnmarshalledTransition]): Self = this.set("Transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitions: Self = this.set("Transitions", js.undefined)
  }
}
