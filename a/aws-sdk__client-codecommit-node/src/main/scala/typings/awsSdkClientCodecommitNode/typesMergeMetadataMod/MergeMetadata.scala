package typings.awsSdkClientCodecommitNode.typesMergeMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeMetadata extends js.Object {
  /**
    * <p>A Boolean value indicating whether the merge has been made.</p>
    */
  var isMerged: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The Amazon Resource Name (ARN) of the user who merged the branches.</p>
    */
  var mergedBy: js.UndefOr[String] = js.undefined
}

object MergeMetadata {
  @scala.inline
  def apply(isMerged: js.UndefOr[Boolean] = js.undefined, mergedBy: String = null): MergeMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMerged)) __obj.updateDynamic("isMerged")(isMerged.get.asInstanceOf[js.Any])
    if (mergedBy != null) __obj.updateDynamic("mergedBy")(mergedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeMetadata]
  }
}

