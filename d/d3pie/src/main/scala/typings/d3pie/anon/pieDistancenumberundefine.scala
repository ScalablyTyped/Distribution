package typings.d3pie.anon

import typings.d3pie.d3pieStrings.`label-percentage1`
import typings.d3pie.d3pieStrings.`label-percentage2`
import typings.d3pie.d3pieStrings.`label-value1`
import typings.d3pie.d3pieStrings.`label-value2`
import typings.d3pie.d3pieStrings.label
import typings.d3pie.d3pieStrings.percentage
import typings.d3pie.d3pieStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  pieDistance :number | undefined} & d3pie.d3pie.ID3PieLabelsOptions */
@js.native
trait pieDistancenumberundefine extends js.Object {
  var format: js.UndefOr[
    label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
  ] = js.native
  var hideWhenLessThanPercentage: js.UndefOr[Double] = js.native
  var pieDistance: js.UndefOr[Double] = js.native
}

object pieDistancenumberundefine {
  @scala.inline
  def apply(): pieDistancenumberundefine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pieDistancenumberundefine]
  }
  @scala.inline
  implicit class pieDistancenumberundefineOps[Self <: pieDistancenumberundefine] (val x: Self) extends AnyVal {
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
    def setFormat(
      value: label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
    ): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHideWhenLessThanPercentage(value: Double): Self = this.set("hideWhenLessThanPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideWhenLessThanPercentage: Self = this.set("hideWhenLessThanPercentage", js.undefined)
    @scala.inline
    def setPieDistance(value: Double): Self = this.set("pieDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePieDistance: Self = this.set("pieDistance", js.undefined)
  }
  
}

