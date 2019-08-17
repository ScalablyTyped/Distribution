package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleRuleMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Disabled
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Enabled
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreAbortIncompleteMultipartUploadMod._UnmarshalledAbortIncompleteMultipartUpload
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleExpirationMod._UnmarshalledLifecycleExpiration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleRuleFilterMod._UnmarshalledLifecycleRuleFilter
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreNoncurrentVersionExpirationMod._UnmarshalledNoncurrentVersionExpiration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreNoncurrentVersionTransitionMod._UnmarshalledNoncurrentVersionTransition
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTransitionMod._UnmarshalledTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledLifecycleRule extends _LifecycleRule {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  @JSName("AbortIncompleteMultipartUpload")
  var AbortIncompleteMultipartUpload__UnmarshalledLifecycleRule: js.UndefOr[_UnmarshalledAbortIncompleteMultipartUpload] = js.undefined
  /**
    * _LifecycleExpiration shape
    */
  @JSName("Expiration")
  var Expiration__UnmarshalledLifecycleRule: js.UndefOr[_UnmarshalledLifecycleExpiration] = js.undefined
  /**
    * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
    */
  @JSName("Filter")
  var Filter__UnmarshalledLifecycleRule: js.UndefOr[_UnmarshalledLifecycleRuleFilter] = js.undefined
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionExpiration")
  var NoncurrentVersionExpiration__UnmarshalledLifecycleRule: js.UndefOr[_UnmarshalledNoncurrentVersionExpiration] = js.undefined
  /**
    * _NoncurrentVersionTransitionList shape
    */
  @JSName("NoncurrentVersionTransitions")
  var NoncurrentVersionTransitions__UnmarshalledLifecycleRule: js.UndefOr[js.Array[_UnmarshalledNoncurrentVersionTransition]] = js.undefined
  /**
    * _TransitionList shape
    */
  @JSName("Transitions")
  var Transitions__UnmarshalledLifecycleRule: js.UndefOr[js.Array[_UnmarshalledTransition]] = js.undefined
}

object _UnmarshalledLifecycleRule {
  @scala.inline
  def apply(
    Status: Enabled | Disabled | String,
    AbortIncompleteMultipartUpload: _UnmarshalledAbortIncompleteMultipartUpload = null,
    Expiration: _UnmarshalledLifecycleExpiration = null,
    Filter: _UnmarshalledLifecycleRuleFilter = null,
    ID: String = null,
    NoncurrentVersionExpiration: _UnmarshalledNoncurrentVersionExpiration = null,
    NoncurrentVersionTransitions: js.Array[_UnmarshalledNoncurrentVersionTransition] = null,
    Prefix: String = null,
    Transitions: js.Array[_UnmarshalledTransition] = null
  ): _UnmarshalledLifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration)
    if (NoncurrentVersionTransitions != null) __obj.updateDynamic("NoncurrentVersionTransitions")(NoncurrentVersionTransitions)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Transitions != null) __obj.updateDynamic("Transitions")(Transitions)
    __obj.asInstanceOf[_UnmarshalledLifecycleRule]
  }
}

