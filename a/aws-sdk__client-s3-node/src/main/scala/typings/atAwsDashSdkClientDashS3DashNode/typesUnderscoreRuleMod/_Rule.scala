package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRuleMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Disabled
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Enabled
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAbortIncompleteMultipartUploadMod._AbortIncompleteMultipartUpload
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleExpirationMod._LifecycleExpiration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNoncurrentVersionExpirationMod._NoncurrentVersionExpiration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNoncurrentVersionTransitionMod._NoncurrentVersionTransition
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTransitionMod._Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Rule extends js.Object {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  var AbortIncompleteMultipartUpload: js.UndefOr[_AbortIncompleteMultipartUpload] = js.undefined
  /**
    * _LifecycleExpiration shape
    */
  var Expiration: js.UndefOr[_LifecycleExpiration] = js.undefined
  /**
    * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
    */
  var ID: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionExpiration: js.UndefOr[_NoncurrentVersionExpiration] = js.undefined
  /**
    * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA or GLACIER storage class at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionTransition: js.UndefOr[_NoncurrentVersionTransition] = js.undefined
  /**
    * <p>Prefix identifying one or more objects to which the rule applies.</p>
    */
  var Prefix: String
  /**
    * <p>If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.</p>
    */
  var Status: Enabled | Disabled | String
  /**
    * _Transition shape
    */
  var Transition: js.UndefOr[_Transition] = js.undefined
}

object _Rule {
  @scala.inline
  def apply(
    Prefix: String,
    Status: Enabled | Disabled | String,
    AbortIncompleteMultipartUpload: _AbortIncompleteMultipartUpload = null,
    Expiration: _LifecycleExpiration = null,
    ID: String = null,
    NoncurrentVersionExpiration: _NoncurrentVersionExpiration = null,
    NoncurrentVersionTransition: _NoncurrentVersionTransition = null,
    Transition: _Transition = null
  ): _Rule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix, Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration)
    if (NoncurrentVersionTransition != null) __obj.updateDynamic("NoncurrentVersionTransition")(NoncurrentVersionTransition)
    if (Transition != null) __obj.updateDynamic("Transition")(Transition)
    __obj.asInstanceOf[_Rule]
  }
}

