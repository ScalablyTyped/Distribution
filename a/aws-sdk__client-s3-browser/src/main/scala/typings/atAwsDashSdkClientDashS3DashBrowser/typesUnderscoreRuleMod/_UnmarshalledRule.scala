package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRuleMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Disabled
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Enabled
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreAbortIncompleteMultipartUploadMod._UnmarshalledAbortIncompleteMultipartUpload
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleExpirationMod._UnmarshalledLifecycleExpiration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreNoncurrentVersionExpirationMod._UnmarshalledNoncurrentVersionExpiration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreNoncurrentVersionTransitionMod._UnmarshalledNoncurrentVersionTransition
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTransitionMod._UnmarshalledTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRule extends _Rule {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  @JSName("AbortIncompleteMultipartUpload")
  var AbortIncompleteMultipartUpload__UnmarshalledRule: js.UndefOr[_UnmarshalledAbortIncompleteMultipartUpload] = js.undefined
  /**
    * _LifecycleExpiration shape
    */
  @JSName("Expiration")
  var Expiration__UnmarshalledRule: js.UndefOr[_UnmarshalledLifecycleExpiration] = js.undefined
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionExpiration")
  var NoncurrentVersionExpiration__UnmarshalledRule: js.UndefOr[_UnmarshalledNoncurrentVersionExpiration] = js.undefined
  /**
    * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA or GLACIER storage class at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionTransition")
  var NoncurrentVersionTransition__UnmarshalledRule: js.UndefOr[_UnmarshalledNoncurrentVersionTransition] = js.undefined
  /**
    * _Transition shape
    */
  @JSName("Transition")
  var Transition__UnmarshalledRule: js.UndefOr[_UnmarshalledTransition] = js.undefined
}

object _UnmarshalledRule {
  @scala.inline
  def apply(
    Prefix: String,
    Status: Enabled | Disabled | String,
    AbortIncompleteMultipartUpload: _UnmarshalledAbortIncompleteMultipartUpload = null,
    Expiration: _UnmarshalledLifecycleExpiration = null,
    ID: String = null,
    NoncurrentVersionExpiration: _UnmarshalledNoncurrentVersionExpiration = null,
    NoncurrentVersionTransition: _UnmarshalledNoncurrentVersionTransition = null,
    Transition: _UnmarshalledTransition = null
  ): _UnmarshalledRule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix, Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration)
    if (NoncurrentVersionTransition != null) __obj.updateDynamic("NoncurrentVersionTransition")(NoncurrentVersionTransition)
    if (Transition != null) __obj.updateDynamic("Transition")(Transition)
    __obj.asInstanceOf[_UnmarshalledRule]
  }
}

