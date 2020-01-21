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
import scala.scalajs.js.annotation._

trait UnmarshalledLifecycleRule extends LifecycleRule {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  @JSName("AbortIncompleteMultipartUpload")
  var AbortIncompleteMultipartUpload_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledAbortIncompleteMultipartUpload] = js.undefined
  /**
    * _LifecycleExpiration shape
    */
  @JSName("Expiration")
  var Expiration_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledLifecycleExpiration] = js.undefined
  /**
    * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledLifecycleRuleFilter] = js.undefined
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionExpiration")
  var NoncurrentVersionExpiration_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledNoncurrentVersionExpiration] = js.undefined
  /**
    * _NoncurrentVersionTransitionList shape
    */
  @JSName("NoncurrentVersionTransitions")
  var NoncurrentVersionTransitions_UnmarshalledLifecycleRule: js.UndefOr[js.Array[UnmarshalledNoncurrentVersionTransition]] = js.undefined
  /**
    * _TransitionList shape
    */
  @JSName("Transitions")
  var Transitions_UnmarshalledLifecycleRule: js.UndefOr[js.Array[UnmarshalledTransition]] = js.undefined
}

object UnmarshalledLifecycleRule {
  @scala.inline
  def apply(
    Status: Enabled | Disabled | String,
    AbortIncompleteMultipartUpload: UnmarshalledAbortIncompleteMultipartUpload = null,
    Expiration: UnmarshalledLifecycleExpiration = null,
    Filter: UnmarshalledLifecycleRuleFilter = null,
    ID: String = null,
    NoncurrentVersionExpiration: UnmarshalledNoncurrentVersionExpiration = null,
    NoncurrentVersionTransitions: js.Array[UnmarshalledNoncurrentVersionTransition] = null,
    Prefix: String = null,
    Transitions: js.Array[UnmarshalledTransition] = null
  ): UnmarshalledLifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration.asInstanceOf[js.Any])
    if (NoncurrentVersionTransitions != null) __obj.updateDynamic("NoncurrentVersionTransitions")(NoncurrentVersionTransitions.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Transitions != null) __obj.updateDynamic("Transitions")(Transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLifecycleRule]
  }
}

