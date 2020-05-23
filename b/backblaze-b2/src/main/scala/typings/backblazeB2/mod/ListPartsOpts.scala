package typings.backblazeB2.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartsOpts extends CommonArgs {
  var fileId: String
  /**
    * maximum part count
    * max value 100
    */
  var maxPartCount: js.UndefOr[Double] = js.undefined
  var startPartNumber: js.UndefOr[Double] = js.undefined
}

object ListPartsOpts {
  @scala.inline
  def apply(
    fileId: String,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null,
    maxPartCount: js.UndefOr[Double] = js.undefined,
    startPartNumber: js.UndefOr[Double] = js.undefined
  ): ListPartsOpts = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPartCount)) __obj.updateDynamic("maxPartCount")(maxPartCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startPartNumber)) __obj.updateDynamic("startPartNumber")(startPartNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsOpts]
  }
}

