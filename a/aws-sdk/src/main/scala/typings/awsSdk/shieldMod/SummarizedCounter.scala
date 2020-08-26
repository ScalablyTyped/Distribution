package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummarizedCounter extends js.Object {
  /**
    * The average value of the counter for a specified time period.
    */
  var Average: js.UndefOr[Double] = js.native
  /**
    * The maximum value of the counter for a specified time period.
    */
  var Max: js.UndefOr[Double] = js.native
  /**
    * The number of counters for a specified time period.
    */
  var N: js.UndefOr[Integer] = js.native
  /**
    * The counter name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The total of counter values for a specified time period.
    */
  var Sum: js.UndefOr[Double] = js.native
  /**
    * The unit of the counters.
    */
  var Unit: js.UndefOr[String] = js.native
}

object SummarizedCounter {
  @scala.inline
  def apply(): SummarizedCounter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummarizedCounter]
  }
  @scala.inline
  implicit class SummarizedCounterOps[Self <: SummarizedCounter] (val x: Self) extends AnyVal {
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
    def setAverage(value: Double): Self = this.set("Average", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage: Self = this.set("Average", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("Max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("Max", js.undefined)
    @scala.inline
    def setN(value: Integer): Self = this.set("N", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("N", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSum(value: Double): Self = this.set("Sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSum: Self = this.set("Sum", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("Unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
  
}

