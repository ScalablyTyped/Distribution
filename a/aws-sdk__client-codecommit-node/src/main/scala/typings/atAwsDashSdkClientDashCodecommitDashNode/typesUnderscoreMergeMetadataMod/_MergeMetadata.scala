package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreMergeMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MergeMetadata extends js.Object {
  /**
    * <p>A Boolean value indicating whether the merge has been made.</p>
    */
  var isMerged: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The Amazon Resource Name (ARN) of the user who merged the branches.</p>
    */
  var mergedBy: js.UndefOr[String] = js.undefined
}

object _MergeMetadata {
  @scala.inline
  def apply(isMerged: js.UndefOr[Boolean] = js.undefined, mergedBy: String = null): _MergeMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMerged)) __obj.updateDynamic("isMerged")(isMerged)
    if (mergedBy != null) __obj.updateDynamic("mergedBy")(mergedBy)
    __obj.asInstanceOf[_MergeMetadata]
  }
}

