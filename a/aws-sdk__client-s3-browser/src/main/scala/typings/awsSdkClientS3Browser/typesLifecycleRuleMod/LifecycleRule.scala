package typings.awsSdkClientS3Browser.typesLifecycleRuleMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
import typings.awsSdkClientS3Browser.typesLifecycleExpirationMod.LifecycleExpiration
import typings.awsSdkClientS3Browser.typesLifecycleRuleFilterMod.LifecycleRuleFilter
import typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
import typings.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
import typings.awsSdkClientS3Browser.typesTransitionMod.Transition
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRule extends js.Object {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  var AbortIncompleteMultipartUpload: js.UndefOr[
    typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
  ] = js.undefined
  /**
    * _LifecycleExpiration shape
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.undefined
  /**
    * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
    */
  var Filter: js.UndefOr[LifecycleRuleFilter] = js.undefined
  /**
    * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
    */
  var ID: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionExpiration: js.UndefOr[
    typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
  ] = js.undefined
  /**
    * _NoncurrentVersionTransitionList shape
    */
  var NoncurrentVersionTransitions: js.UndefOr[js.Array[NoncurrentVersionTransition] | Iterable[NoncurrentVersionTransition]] = js.undefined
  /**
    * <p>Prefix identifying one or more objects to which the rule applies. This is deprecated; use Filter instead.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.</p>
    */
  var Status: Enabled | Disabled | String
  /**
    * _TransitionList shape
    */
  var Transitions: js.UndefOr[js.Array[Transition] | Iterable[Transition]] = js.undefined
}

object LifecycleRule {
  @scala.inline
  def apply(
    Status: Enabled | Disabled | String,
    AbortIncompleteMultipartUpload: AbortIncompleteMultipartUpload = null,
    Expiration: LifecycleExpiration = null,
    Filter: LifecycleRuleFilter = null,
    ID: String = null,
    NoncurrentVersionExpiration: NoncurrentVersionExpiration = null,
    NoncurrentVersionTransitions: js.Array[NoncurrentVersionTransition] | Iterable[NoncurrentVersionTransition] = null,
    Prefix: String = null,
    Transitions: js.Array[Transition] | Iterable[Transition] = null
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

