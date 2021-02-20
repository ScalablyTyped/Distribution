package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecyclePolicyPreviewResult extends StObject {
  
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
  implicit class LifecyclePolicyPreviewResultMutableBuilder[Self <: LifecyclePolicyPreviewResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: LifecyclePolicyRuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAppliedRulePriority(value: LifecyclePolicyRulePriority): Self = StObject.set(x, "appliedRulePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedRulePriorityUndefined: Self = StObject.set(x, "appliedRulePriority", js.undefined)
    
    @scala.inline
    def setImageDigest(value: ImageDigest): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    @scala.inline
    def setImagePushedAt(value: PushTimestamp): Self = StObject.set(x, "imagePushedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePushedAtUndefined: Self = StObject.set(x, "imagePushedAt", js.undefined)
    
    @scala.inline
    def setImageTags(value: ImageTagList): Self = StObject.set(x, "imageTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTagsUndefined: Self = StObject.set(x, "imageTags", js.undefined)
    
    @scala.inline
    def setImageTagsVarargs(value: ImageTag*): Self = StObject.set(x, "imageTags", js.Array(value :_*))
  }
}
