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
    maximumExecutionTimeInMs: Int | Double = null,
    maxresults: Int | Double = null,
    prefix: String = null,
    timeoutIntervalInMs: Int | Double = null
  ): ListBlobsOptions = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (maxresults != null) __obj.updateDynamic("maxresults")(maxresults.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBlobsOptions]
  }
}

