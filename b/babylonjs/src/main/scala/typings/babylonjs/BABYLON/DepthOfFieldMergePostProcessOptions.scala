package typings.babylonjs.BABYLON

import typings.babylonjs.AnonCircleOfConfusion
import typings.babylonjs.AnonWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DepthOfFieldMergePostProcessOptions")
@js.native
class DepthOfFieldMergePostProcessOptions () extends js.Object {
  /**
    * Parameters to perform the merge of bloom effect
    */
  var bloom: js.UndefOr[AnonWeight] = js.native
  /**
    * Parameters to perform the merge of the depth of field effect
    */
  var depthOfField: js.UndefOr[AnonCircleOfConfusion] = js.native
  /**
    * The original image to merge on top of
    */
  var originalFromInput: PostProcess = js.native
}

