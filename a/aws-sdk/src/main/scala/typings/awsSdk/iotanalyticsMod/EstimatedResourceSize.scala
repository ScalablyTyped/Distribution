package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EstimatedResourceSize extends js.Object {
  /**
    * The time when the estimate of the size of the resource was made.
    */
  var estimatedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The estimated size of the resource in bytes.
    */
  var estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.native
}

object EstimatedResourceSize {
  @scala.inline
  def apply(estimatedOn: Timestamp = null, estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.undefined): EstimatedResourceSize = {
    val __obj = js.Dynamic.literal()
    if (estimatedOn != null) __obj.updateDynamic("estimatedOn")(estimatedOn.asInstanceOf[js.Any])
    if (!js.isUndefined(estimatedSizeInBytes)) __obj.updateDynamic("estimatedSizeInBytes")(estimatedSizeInBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EstimatedResourceSize]
  }
}

