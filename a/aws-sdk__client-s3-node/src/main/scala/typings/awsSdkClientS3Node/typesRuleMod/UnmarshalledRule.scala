package typings.awsSdkClientS3Node.typesRuleMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod.UnmarshalledAbortIncompleteMultipartUpload
import typings.awsSdkClientS3Node.typesLifecycleExpirationMod.UnmarshalledLifecycleExpiration
import typings.awsSdkClientS3Node.typesNoncurrentVersionExpirationMod.UnmarshalledNoncurrentVersionExpiration
import typings.awsSdkClientS3Node.typesNoncurrentVersionTransitionMod.UnmarshalledNoncurrentVersionTransition
import typings.awsSdkClientS3Node.typesTransitionMod.UnmarshalledTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledRule extends Rule {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  @JSName("AbortIncompleteMultipartUpload")
  var AbortIncompleteMultipartUpload_UnmarshalledRule: js.UndefOr[UnmarshalledAbortIncompleteMultipartUpload] = js.undefined
  /**
    * _LifecycleExpiration shape
    */
  @JSName("Expiration")
  var Expiration_UnmarshalledRule: js.UndefOr[UnmarshalledLifecycleExpiration] = js.undefined
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionExpiration")
  var NoncurrentVersionExpiration_UnmarshalledRule: js.UndefOr[UnmarshalledNoncurrentVersionExpiration] = js.undefined
  /**
    * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA or GLACIER storage class at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionTransition")
  var NoncurrentVersionTransition_UnmarshalledRule: js.UndefOr[UnmarshalledNoncurrentVersionTransition] = js.undefined
  /**
    * _Transition shape
    */
  @JSName("Transition")
  var Transition_UnmarshalledRule: js.UndefOr[UnmarshalledTransition] = js.undefined
}

object UnmarshalledRule {
  @scala.inline
  def apply(
    Prefix: String,
    Status: Enabled | Disabled | String,
    AbortIncompleteMultipartUpload: UnmarshalledAbortIncompleteMultipartUpload = null,
    Expiration: UnmarshalledLifecycleExpiration = null,
    ID: String = null,
    NoncurrentVersionExpiration: UnmarshalledNoncurrentVersionExpiration = null,
    NoncurrentVersionTransition: UnmarshalledNoncurrentVersionTransition = null,
    Transition: UnmarshalledTransition = null
  ): UnmarshalledRule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration.asInstanceOf[js.Any])
    if (NoncurrentVersionTransition != null) __obj.updateDynamic("NoncurrentVersionTransition")(NoncurrentVersionTransition.asInstanceOf[js.Any])
    if (Transition != null) __obj.updateDynamic("Transition")(Transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRule]
  }
}

