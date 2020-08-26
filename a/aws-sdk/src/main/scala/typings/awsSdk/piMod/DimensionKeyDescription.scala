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
  def apply(): DimensionKeyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionKeyDescription]
  }
  @scala.inline
  implicit class DimensionKeyDescriptionOps[Self <: DimensionKeyDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDimensions(value: DimensionMap): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setPartitionsVarargs(value: Double*): Self = this.set("Partitions", js.Array(value :_*))
    @scala.inline
    def setPartitions(value: MetricValuesList): Self = this.set("Partitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitions: Self = this.set("Partitions", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("Total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
  
}

