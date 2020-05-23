package typings.babylonjs.BABYLON

import typings.babylonjs.anon.CircleOfConfusion
import typings.babylonjs.anon.Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepthOfFieldMergePostProcessOptions extends js.Object {
  /**
    * Parameters to perform the merge of bloom effect
    */
  var bloom: js.UndefOr[Weight] = js.undefined
  /**
    * Parameters to perform the merge of the depth of field effect
    */
  var depthOfField: js.UndefOr[CircleOfConfusion] = js.undefined
  /**
    * The original image to merge on top of
    */
  var originalFromInput: PostProcess
}

object DepthOfFieldMergePostProcessOptions {
  @scala.inline
  def apply(originalFromInput: PostProcess, bloom: Weight = null, depthOfField: CircleOfConfusion = null): DepthOfFieldMergePostProcessOptions = {
    val __obj = js.Dynamic.literal(originalFromInput = originalFromInput.asInstanceOf[js.Any])
    if (bloom != null) __obj.updateDynamic("bloom")(bloom.asInstanceOf[js.Any])
    if (depthOfField != null) __obj.updateDynamic("depthOfField")(depthOfField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthOfFieldMergePostProcessOptions]
  }
}

