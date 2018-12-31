package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to be set when merging outputs from the default pipeline.
  */
@JSGlobal("BABYLON.DepthOfFieldMergePostProcessOptions")
@js.native
class DepthOfFieldMergePostProcessOptions () extends js.Object {
  /**
    * Parameters to perform the merge of bloom effect
    */
  var bloom: js.UndefOr[babylonjsLib.Anon_Weight] = js.native
  /**
    * Parameters to perform the merge of the depth of field effect
    */
  var depthOfField: js.UndefOr[babylonjsLib.Anon_CircleOfConfusion] = js.native
  /**
    * The original image to merge on top of
    */
  var originalFromInput: PostProcess = js.native
}

