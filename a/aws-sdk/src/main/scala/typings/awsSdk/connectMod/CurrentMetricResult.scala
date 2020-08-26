package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentMetricResult extends js.Object {
  /**
    * The set of metrics.
    */
  var Collections: js.UndefOr[CurrentMetricDataCollections] = js.native
  /**
    * The dimensions for the metrics.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.connectMod.Dimensions] = js.native
}

object CurrentMetricResult {
  @scala.inline
  def apply(): CurrentMetricResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMetricResult]
  }
  @scala.inline
  implicit class CurrentMetricResultOps[Self <: CurrentMetricResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollectionsVarargs(value: CurrentMetricData*): Self = this.set("Collections", js.Array(value :_*))
    @scala.inline
    def setCollections(value: CurrentMetricDataCollections): Self = this.set("Collections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollections: Self = this.set("Collections", js.undefined)
    @scala.inline
    def setDimensions(value: Dimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
  }
  
}

