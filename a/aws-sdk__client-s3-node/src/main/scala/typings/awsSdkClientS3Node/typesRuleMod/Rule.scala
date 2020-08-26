package typings.awsSdkClientS3Node.typesRuleMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
import typings.awsSdkClientS3Node.typesLifecycleExpirationMod.LifecycleExpiration
import typings.awsSdkClientS3Node.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
import typings.awsSdkClientS3Node.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
import typings.awsSdkClientS3Node.typesTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  var AbortIncompleteMultipartUpload: js.UndefOr[
    typings.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
  ] = js.native
  /**
    * _LifecycleExpiration shape
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.native
  /**
    * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
    */
  var ID: js.UndefOr[String] = js.native
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionExpiration: js.UndefOr[
    typings.awsSdkClientS3Node.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
  ] = js.native
  /**
    * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA or GLACIER storage class at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionTransition: js.UndefOr[
    typings.awsSdkClientS3Node.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
  ] = js.native
  /**
    * <p>Prefix identifying one or more objects to which the rule applies.</p>
    */
  var Prefix: String = js.native
  /**
    * <p>If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.</p>
    */
  var Status: Enabled | Disabled | String = js.native
  /**
    * _Transition shape
    */
  var Transition: js.UndefOr[typings.awsSdkClientS3Node.typesTransitionMod.Transition] = js.native
}

object Rule {
  @scala.inline
  def apply(Prefix: String, Status: Enabled | Disabled | String): Rule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Enabled | Disabled | String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = this.set("AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortIncompleteMultipartUpload: Self = this.set("AbortIncompleteMultipartUpload", js.undefined)
    @scala.inline
    def setExpiration(value: LifecycleExpiration): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
    @scala.inline
    def setNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = this.set("NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoncurrentVersionExpiration: Self = this.set("NoncurrentVersionExpiration", js.undefined)
    @scala.inline
    def setNoncurrentVersionTransition(value: NoncurrentVersionTransition): Self = this.set("NoncurrentVersionTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoncurrentVersionTransition: Self = this.set("NoncurrentVersionTransition", js.undefined)
    @scala.inline
    def setTransition(value: Transition): Self = this.set("Transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("Transition", js.undefined)
  }
  
}

