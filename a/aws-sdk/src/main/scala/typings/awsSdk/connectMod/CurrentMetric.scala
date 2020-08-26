package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentMetric extends js.Object {
  /**
    * The name of the metric.
    */
  var Name: js.UndefOr[CurrentMetricName] = js.native
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.connectMod.Unit] = js.native
}

object CurrentMetric {
  @scala.inline
  def apply(): CurrentMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMetric]
  }
  @scala.inline
  implicit class CurrentMetricOps[Self <: CurrentMetric] (val x: Self) extends AnyVal {
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
    def setName(value: CurrentMetricName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setUnit(value: Unit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
  
}

