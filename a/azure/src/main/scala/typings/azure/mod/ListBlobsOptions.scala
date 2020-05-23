package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBlobsOptions extends ListContainersOptions {
  var delimiter: js.UndefOr[String] = js.undefined
}

object ListBlobsOptions {
  @scala.inline
  def apply(
    marker: String,
    delimiter: String = null,
    include: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    maxresults: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): ListBlobsOptions = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxresults)) __obj.updateDynamic("maxresults")(maxresults.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBlobsOptions]
  }
}

