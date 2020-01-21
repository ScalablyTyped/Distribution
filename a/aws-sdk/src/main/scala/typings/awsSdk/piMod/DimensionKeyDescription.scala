package typings.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionKeyDescription extends js.Object {
  /**
    * A map of name-value pairs for the dimensions in the group.
    */
  var Dimensions: js.UndefOr[DimensionMap] = js.native
  /**
    * If PartitionBy was specified, PartitionKeys contains the dimensions that were.
    */
  var Partitions: js.UndefOr[MetricValuesList] = js.native
  /**
    * The aggregated metric value for the dimension(s), over the requested time range.
    */
  var Total: js.UndefOr[Double] = js.native
}

object DimensionKeyDescription {
  @scala.inline
  def apply(
    Dimensions: DimensionMap = null,
    Partitions: MetricValuesList = null,
    Total: Int | scala.Double = null
  ): DimensionKeyDescription = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (Partitions != null) __obj.updateDynamic("Partitions")(Partitions.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionKeyDescription]
  }
}

