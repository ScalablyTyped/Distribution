package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExclusionsResponse extends js.Object {
  /**
    * Information about the exclusions.
    */
  var exclusions: ExclusionMap = js.native
  /**
    * Exclusion details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}

object DescribeExclusionsResponse {
  @scala.inline
  def apply(exclusions: ExclusionMap, failedItems: FailedItems): DescribeExclusionsResponse = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExclusionsResponse]
  }
}

