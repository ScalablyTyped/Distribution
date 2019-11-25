package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleRuleMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Disabled
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Enabled
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAbortIncompleteMultipartUploadMod._AbortIncompleteMultipartUpload
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleExpirationMod._LifecycleExpiration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleRuleFilterMod._LifecycleRuleFilter
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNoncurrentVersionExpirationMod._NoncurrentVersionExpiration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNoncurrentVersionTransitionMod._NoncurrentVersionTransition
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTransitionMod._Transition
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _LifecycleRule extends js.Object {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  var AbortIncompleteMultipartUpload: js.UndefOr[_AbortIncompleteMultipartUpload] = js.undefined
  /**
    * _LifecycleExpiration shape
    */
  var Expiration: js.UndefOr[_LifecycleExpiration] = js.undefined
  /**
    * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
    */
  var Filter: js.UndefOr[_LifecycleRuleFilter] = js.undefined
  /**
    * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
    */
  var ID: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionExpiration: js.UndefOr[_NoncurrentVersionExpiration] = js.undefined
  /**
    * _NoncurrentVersionTransitionList shape
    */
  var NoncurrentVersionTransitions: js.UndefOr[js.Array[_NoncurrentVersionTransition] | Iterable[_NoncurrentVersionTransition]] = js.undefined
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
  var Transitions: js.UndefOr[js.Array[_Transition] | Iterable[_Transition]] = js.undefined
}

object _LifecycleRule {
  @scala.inline
  def apply(
    Status: Enabled | Disabled | String,
    AbortIncompleteMultipartUpload: _AbortIncompleteMultipartUpload = null,
    Expiration: _LifecycleExpiration = null,
    Filter: _LifecycleRuleFilter = null,
    ID: String = null,
    NoncurrentVersionExpiration: _NoncurrentVersionExpiration = null,
    NoncurrentVersionTransitions: js.Array[_NoncurrentVersionTransition] | Iterable[_NoncurrentVersionTransition] = null,
    Prefix: String = null,
    Transitions: js.Array[_Transition] | Iterable[_Transition] = null
  ): _LifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration.asInstanceOf[js.Any])
    if (NoncurrentVersionTransitions != null) __obj.updateDynamic("NoncurrentVersionTransitions")(NoncurrentVersionTransitions.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Transitions != null) __obj.updateDynamic("Transitions")(Transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[_LifecycleRule]
  }
}

