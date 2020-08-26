package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPreviewResult extends js.Object {
  /**
    * The type of action to be taken.
    */
  var action: js.UndefOr[LifecyclePolicyRuleAction] = js.native
  /**
    * The priority of the applied rule.
    */
  var appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority] = js.native
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.native
  /**
    * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository.
    */
  var imagePushedAt: js.UndefOr[PushTimestamp] = js.native
  /**
    * The list of tags associated with this image.
    */
  var imageTags: js.UndefOr[ImageTagList] = js.native
}

object LifecyclePolicyPreviewResult {
  @scala.inline
  def apply(): LifecyclePolicyPreviewResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyPreviewResult]
  }
  @scala.inline
  implicit class LifecyclePolicyPreviewResultOps[Self <: LifecyclePolicyPreviewResult] (val x: Self) extends AnyVal {
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
    def setAction(value: LifecyclePolicyRuleAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAppliedRulePriority(value: LifecyclePolicyRulePriority): Self = this.set("appliedRulePriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedRulePriority: Self = this.set("appliedRulePriority", js.undefined)
    @scala.inline
    def setImageDigest(value: ImageDigest): Self = this.set("imageDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageDigest: Self = this.set("imageDigest", js.undefined)
    @scala.inline
    def setImagePushedAt(value: PushTimestamp): Self = this.set("imagePushedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePushedAt: Self = this.set("imagePushedAt", js.undefined)
    @scala.inline
    def setImageTagsVarargs(value: ImageTag*): Self = this.set("imageTags", js.Array(value :_*))
    @scala.inline
    def setImageTags(value: ImageTagList): Self = this.set("imageTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTags: Self = this.set("imageTags", js.undefined)
  }
  
}

