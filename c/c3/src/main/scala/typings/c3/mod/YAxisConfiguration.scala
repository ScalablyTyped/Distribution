package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YAxisConfiguration extends AxisConfiguration {
  /**
    * Set center value of y axis.
    */
  var center: js.UndefOr[Double] = js.native
  /**
    * Set default range of y axis. This option set the default value for y axis when there is no data on init.
    */
  var default: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /**
    * Change the direction of y axis.
    * If true set, the direction will be from the top to the bottom.
    */
  var inverted: js.UndefOr[Boolean] = js.native
  @JSName("max")
  var max_YAxisConfiguration: js.UndefOr[Double] = js.native
  @JSName("min")
  var min_YAxisConfiguration: js.UndefOr[Double] = js.native
  var tick: js.UndefOr[YTickConfiguration] = js.native
}

object YAxisConfiguration {
  @scala.inline
  def apply(): YAxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisConfiguration]
  }
  @scala.inline
  implicit class YAxisConfigurationOps[Self <: YAxisConfiguration] (val x: Self) extends AnyVal {
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
    def setCenter(value: Double): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setDefault(value: js.Tuple2[Double, Double]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setTick(value: YTickConfiguration): Self = this.set("tick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
  }
  
}

