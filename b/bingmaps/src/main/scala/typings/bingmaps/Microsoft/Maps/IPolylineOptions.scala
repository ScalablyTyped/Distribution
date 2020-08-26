package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolylineOptions extends IPrimitiveOptions {
  /** Indicates if drawn shape should be generalized based on the zoom level to improve rendering performance. Default true **/
  var generalizable: js.UndefOr[Boolean] = js.native
  /** CSS string or Color object as the poly's color. */
  var strokeColor: js.UndefOr[String | Color] = js.native
  /** An array of numbers separated by spaces, or a string separated by spaces/commas specifying the repetitive stroke pattern. */
  var strokeDashArray: js.UndefOr[js.Array[Double] | String] = js.native
  /** The thickness of the poly stroke. */
  var strokeThickness: js.UndefOr[Double] = js.native
}

object IPolylineOptions {
  @scala.inline
  def apply(): IPolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolylineOptions]
  }
  @scala.inline
  implicit class IPolylineOptionsOps[Self <: IPolylineOptions] (val x: Self) extends AnyVal {
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
    def setGeneralizable(value: Boolean): Self = this.set("generalizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneralizable: Self = this.set("generalizable", js.undefined)
    @scala.inline
    def setStrokeColor(value: String | Color): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeDashArrayVarargs(value: Double*): Self = this.set("strokeDashArray", js.Array(value :_*))
    @scala.inline
    def setStrokeDashArray(value: js.Array[Double] | String): Self = this.set("strokeDashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDashArray: Self = this.set("strokeDashArray", js.undefined)
    @scala.inline
    def setStrokeThickness(value: Double): Self = this.set("strokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeThickness: Self = this.set("strokeThickness", js.undefined)
  }
  
}

