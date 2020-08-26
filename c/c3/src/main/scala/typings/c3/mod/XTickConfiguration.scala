package typings.c3.mod

import typings.c3.anon.MaxNumber
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XTickConfiguration extends TickConfiguration {
  /**
    * Centerise ticks on category axis
    */
  var centered: js.UndefOr[Boolean] = js.native
  /**
    * Setting for culling ticks.
    * If `true` is set, the ticks will be culled, then only limitted tick text will be shown.
    * This option does not hide the tick lines. If `false` is set, all of ticks will be shown.
    */
  var culling: js.UndefOr[Boolean | MaxNumber] = js.native
  /**
    * Fit x axis ticks.
    * If `true` set, the ticks will be positioned nicely. If `false` set, the ticks will be positioned
    * according to x value of the data points.
    */
  var fit: js.UndefOr[Boolean] = js.native
  /**
    * A function to format x-axis tick values. A format string is also supported for timeseries data.
    */
  var format: js.UndefOr[String | (js.Function1[/* x */ Double | Date, String | Double])] = js.native
  var multiline: js.UndefOr[Boolean] = js.native
  var multilineMax: js.UndefOr[Double] = js.native
  /**
    * Set width of x axis tick.
    */
  var width: js.UndefOr[Double] = js.native
}

object XTickConfiguration {
  @scala.inline
  def apply(): XTickConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XTickConfiguration]
  }
  @scala.inline
  implicit class XTickConfigurationOps[Self <: XTickConfiguration] (val x: Self) extends AnyVal {
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
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setCulling(value: Boolean | MaxNumber): Self = this.set("culling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulling: Self = this.set("culling", js.undefined)
    @scala.inline
    def setFit(value: Boolean): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* x */ Double | Date => String | Double): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: String | (js.Function1[/* x */ Double | Date, String | Double])): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setMultilineMax(value: Double): Self = this.set("multilineMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultilineMax: Self = this.set("multilineMax", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

