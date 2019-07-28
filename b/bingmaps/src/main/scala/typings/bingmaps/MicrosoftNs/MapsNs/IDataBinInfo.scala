package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataBinInfo extends js.Object {
  /* An array of all the pushpins that are in the data bin. */
  var containedPushpins: js.Array[Pushpin]
  /* A set of calculated metric values determined using the aggregationProperty value of all the pushpins contained in the data bin. */
  var metrics: IDataBinMetrics
}

object IDataBinInfo {
  @scala.inline
  def apply(containedPushpins: js.Array[Pushpin], metrics: IDataBinMetrics): IDataBinInfo = {
    val __obj = js.Dynamic.literal(containedPushpins = containedPushpins, metrics = metrics)
  
    __obj.asInstanceOf[IDataBinInfo]
  }
}

