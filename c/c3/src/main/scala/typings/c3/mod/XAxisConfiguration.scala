package typings.c3.mod

import typings.c3.c3Strings.category
import typings.c3.c3Strings.indexed
import typings.c3.c3Strings.timeseries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAxisConfiguration extends AxisConfiguration {
  /**
    * Set category names on category axis.
    * This must be an array that includes category names in string. If category names are included in the date by `data.x` option, this is not required.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set default extent for subchart and zoom. This can be an array or function that returns an array.
    */
  var extent: js.UndefOr[js.Array[Double] | js.Function0[js.Array[Double]]] = js.native
  /**
    * Set height of x axis.
    * The height of x axis can be set manually by this option. If you need more space for x axis, please use this option for that. The unit is pixel.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Set how to treat the timezone of x values.
    * If `true` (default), treat x value as localtime. If `false`, convert to UTC internally.
    */
  var localtime: js.UndefOr[Boolean] = js.native
  var selection: js.UndefOr[js.Any] = js.native
  var tick: js.UndefOr[XTickConfiguration] = js.native
  /**
    * Set type of x axis.
    * Defaults to `"indexed"`.
    */
  var `type`: js.UndefOr[timeseries | category | indexed] = js.native
}

object XAxisConfiguration {
  @scala.inline
  def apply(): XAxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxisConfiguration]
  }
  @scala.inline
  implicit class XAxisConfigurationOps[Self <: XAxisConfiguration] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setExtentVarargs(value: Double*): Self = this.set("extent", js.Array(value :_*))
    @scala.inline
    def setExtentFunction0(value: () => js.Array[Double]): Self = this.set("extent", js.Any.fromFunction0(value))
    @scala.inline
    def setExtent(value: js.Array[Double] | js.Function0[js.Array[Double]]): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLocaltime(value: Boolean): Self = this.set("localtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaltime: Self = this.set("localtime", js.undefined)
    @scala.inline
    def setSelection(value: js.Any): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setTick(value: XTickConfiguration): Self = this.set("tick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    @scala.inline
    def setType(value: timeseries | category | indexed): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

