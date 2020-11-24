package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleRule extends js.Object {
  
  /**
    * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 waits before permanently removing all parts of the upload. For more information, see  Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy in the Amazon Simple Storage Service Developer Guide.
    */
  var AbortIncompleteMultipartUpload: js.UndefOr[typings.awsSdk.s3controlMod.AbortIncompleteMultipartUpload] = js.native
  
  /**
    * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker.
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.native
  
  /**
    * The container for the filter of lifecycle rule.
    */
  var Filter: js.UndefOr[LifecycleRuleFilter] = js.native
  
  /**
    * Unique identifier for the rule. The value cannot be longer than 255 characters.
    */
  var ID: js.UndefOr[typings.awsSdk.s3controlMod.ID] = js.native
  
  /**
    * The noncurrent version expiration of the lifecycle rule.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var NoncurrentVersionExpiration: js.UndefOr[typings.awsSdk.s3controlMod.NoncurrentVersionExpiration] = js.native
  
  /**
    *  Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set period in the object's lifetime.   This is not supported by Amazon S3 on Outposts buckets. 
    */
  var NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList] = js.native
  
  /**
    * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
    */
  var Status: ExpirationStatus = js.native
  
  /**
    * Specifies when an Amazon S3 object transitions to a specified storage class.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var Transitions: js.UndefOr[TransitionList] = js.native
}
object LifecycleRule {
  
  @scala.inline
  def apply(Status: ExpirationStatus): LifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  
  @scala.inline
  implicit class LifecycleRuleOps[Self <: LifecycleRule] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: ExpirationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = this.set("AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortIncompleteMultipartUpload: Self = this.set("AbortIncompleteMultipartUpload", js.undefined)
    
    @scala.inline
    def setExpiration(value: LifecycleExpiration): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    
    @scala.inline
    def setFilter(value: LifecycleRuleFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setID(value: ID): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = this.set("NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentVersionExpiration: Self = this.set("NoncurrentVersionExpiration", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransitionsVarargs(value: NoncurrentVersionTransition*): Self = this.set("NoncurrentVersionTransitions", js.Array(value :_*))
    
    @scala.inline
    def setNoncurrentVersionTransitions(value: NoncurrentVersionTransitionList): Self = this.set("NoncurrentVersionTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentVersionTransitions: Self = this.set("NoncurrentVersionTransitions", js.undefined)
    
    @scala.inline
    def setTransitionsVarargs(value: Transition*): Self = this.set("Transitions", js.Array(value :_*))
    
    @scala.inline
    def setTransitions(value: TransitionList): Self = this.set("Transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitions: Self = this.set("Transitions", js.undefined)
  }
}
