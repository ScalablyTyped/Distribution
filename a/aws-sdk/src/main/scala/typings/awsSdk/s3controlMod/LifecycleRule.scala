package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleRule extends StObject {
  
  /**
    * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 waits before permanently removing all parts of the upload. For more information, see  Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy in the Amazon Simple Storage Service Developer Guide.
    */
  var AbortIncompleteMultipartUpload: js.UndefOr[typings.awsSdk.s3controlMod.AbortIncompleteMultipartUpload] = js.undefined
  
  /**
    * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker.
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.undefined
  
  /**
    * The container for the filter of lifecycle rule.
    */
  var Filter: js.UndefOr[LifecycleRuleFilter] = js.undefined
  
  /**
    * Unique identifier for the rule. The value cannot be longer than 255 characters.
    */
  var ID: js.UndefOr[typings.awsSdk.s3controlMod.ID] = js.undefined
  
  /**
    * The noncurrent version expiration of the lifecycle rule.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var NoncurrentVersionExpiration: js.UndefOr[typings.awsSdk.s3controlMod.NoncurrentVersionExpiration] = js.undefined
  
  /**
    *  Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set period in the object's lifetime.   This is not supported by Amazon S3 on Outposts buckets. 
    */
  var NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList] = js.undefined
  
  /**
    * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
    */
  var Status: ExpirationStatus
  
  /**
    * Specifies when an Amazon S3 object transitions to a specified storage class.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var Transitions: js.UndefOr[TransitionList] = js.undefined
}
object LifecycleRule {
  
  @scala.inline
  def apply(Status: ExpirationStatus): LifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  
  @scala.inline
  implicit class LifecycleRuleMutableBuilder[Self <: LifecycleRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
    
    @scala.inline
    def setExpiration(value: LifecycleExpiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    @scala.inline
    def setFilter(value: LifecycleRuleFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = StObject.set(x, "NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "NoncurrentVersionExpiration", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransitions(value: NoncurrentVersionTransitionList): Self = StObject.set(x, "NoncurrentVersionTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncurrentVersionTransitionsUndefined: Self = StObject.set(x, "NoncurrentVersionTransitions", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransitionsVarargs(value: NoncurrentVersionTransition*): Self = StObject.set(x, "NoncurrentVersionTransitions", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: ExpirationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitions(value: TransitionList): Self = StObject.set(x, "Transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsUndefined: Self = StObject.set(x, "Transitions", js.undefined)
    
    @scala.inline
    def setTransitionsVarargs(value: Transition*): Self = StObject.set(x, "Transitions", js.Array(value :_*))
  }
}
