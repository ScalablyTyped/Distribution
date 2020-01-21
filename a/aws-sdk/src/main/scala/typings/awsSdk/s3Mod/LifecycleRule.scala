package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleRule extends js.Object {
  var AbortIncompleteMultipartUpload: js.UndefOr[typings.awsSdk.s3Mod.AbortIncompleteMultipartUpload] = js.native
  /**
    * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker.
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.native
  var Filter: js.UndefOr[LifecycleRuleFilter] = js.native
  /**
    * Unique identifier for the rule. The value cannot be longer than 255 characters.
    */
  var ID: js.UndefOr[typings.awsSdk.s3Mod.ID] = js.native
  var NoncurrentVersionExpiration: js.UndefOr[typings.awsSdk.s3Mod.NoncurrentVersionExpiration] = js.native
  /**
    *  Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set period in the object's lifetime. 
    */
  var NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList] = js.native
  /**
    * Prefix identifying one or more objects to which the rule applies. This is No longer used; use Filter instead.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  /**
    * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
    */
  var Status: ExpirationStatus = js.native
  /**
    * Specifies when an Amazon S3 object transitions to a specified storage class.
    */
  var Transitions: js.UndefOr[TransitionList] = js.native
}

object LifecycleRule {
  @scala.inline
  def apply(
    Status: ExpirationStatus,
    AbortIncompleteMultipartUpload: AbortIncompleteMultipartUpload = null,
    Expiration: LifecycleExpiration = null,
    Filter: LifecycleRuleFilter = null,
    ID: ID = null,
    NoncurrentVersionExpiration: NoncurrentVersionExpiration = null,
    NoncurrentVersionTransitions: NoncurrentVersionTransitionList = null,
    Prefix: Prefix = null,
    Transitions: TransitionList = null
  ): LifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration.asInstanceOf[js.Any])
    if (NoncurrentVersionTransitions != null) __obj.updateDynamic("NoncurrentVersionTransitions")(NoncurrentVersionTransitions.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Transitions != null) __obj.updateDynamic("Transitions")(Transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
}

