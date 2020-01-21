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
  def apply(
    action: LifecyclePolicyRuleAction = null,
    appliedRulePriority: Int | Double = null,
    imageDigest: ImageDigest = null,
    imagePushedAt: PushTimestamp = null,
    imageTags: ImageTagList = null
  ): LifecyclePolicyPreviewResult = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (appliedRulePriority != null) __obj.updateDynamic("appliedRulePriority")(appliedRulePriority.asInstanceOf[js.Any])
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest.asInstanceOf[js.Any])
    if (imagePushedAt != null) __obj.updateDynamic("imagePushedAt")(imagePushedAt.asInstanceOf[js.Any])
    if (imageTags != null) __obj.updateDynamic("imageTags")(imageTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPreviewResult]
  }
}

