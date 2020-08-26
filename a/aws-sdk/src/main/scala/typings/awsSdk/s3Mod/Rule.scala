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
  def apply(Prefix: Prefix, Status: ExpirationStatus): Rule = {
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
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ExpirationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = this.set("AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortIncompleteMultipartUpload: Self = this.set("AbortIncompleteMultipartUpload", js.undefined)
    @scala.inline
    def setExpiration(value: LifecycleExpiration): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    @scala.inline
    def setID(value: ID): Self = this.set("ID", value.asInstanceOf[js.Any])
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

