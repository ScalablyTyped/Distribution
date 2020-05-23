package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  var AbortIncompleteMultipartUpload: js.UndefOr[typings.awsSdk.s3Mod.AbortIncompleteMultipartUpload] = js.native
  /**
    * Specifies the expiration for the lifecycle of the object.
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.native
  /**
    * Unique identifier for the rule. The value can't be longer than 255 characters.
    */
  var ID: js.UndefOr[typings.awsSdk.s3Mod.ID] = js.native
  var NoncurrentVersionExpiration: js.UndefOr[typings.awsSdk.s3Mod.NoncurrentVersionExpiration] = js.native
  var NoncurrentVersionTransition: js.UndefOr[typings.awsSdk.s3Mod.NoncurrentVersionTransition] = js.native
  /**
    * Object key prefix that identifies one or more objects to which this rule applies.
    */
  var Prefix: typings.awsSdk.s3Mod.Prefix = js.native
  /**
    * If Enabled, the rule is currently being applied. If Disabled, the rule is not currently being applied.
    */
  var Status: ExpirationStatus = js.native
  /**
    * Specifies when an object transitions to a specified storage class. For more information about Amazon S3 lifecycle configuration rules, see Transitioning Objects Using Amazon S3 Lifecycle in the Amazon Simple Storage Service Developer Guide.
    */
  var Transition: js.UndefOr[typings.awsSdk.s3Mod.Transition] = js.native
}

object Rule {
  @scala.inline
  def apply(
    Prefix: Prefix,
    Status: ExpirationStatus,
    AbortIncompleteMultipartUpload: AbortIncompleteMultipartUpload = null,
    Expiration: LifecycleExpiration = null,
    ID: ID = null,
    NoncurrentVersionExpiration: NoncurrentVersionExpiration = null,
    NoncurrentVersionTransition: NoncurrentVersionTransition = null,
    Transition: Transition = null
  ): Rule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration.asInstanceOf[js.Any])
    if (NoncurrentVersionTransition != null) __obj.updateDynamic("NoncurrentVersionTransition")(NoncurrentVersionTransition.asInstanceOf[js.Any])
    if (Transition != null) __obj.updateDynamic("Transition")(Transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

