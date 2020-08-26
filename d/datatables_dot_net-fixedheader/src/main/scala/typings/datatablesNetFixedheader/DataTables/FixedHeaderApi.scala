package typings.datatablesNetFixedheader.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedHeaderApi extends js.Object {
  /**
    * Recalculate the position of the DataTable on the page and adjust the fixed element as appropriate.
    */
  def adjust(): Api = js.native
  /**
    * Disable the fixed elements
    */
  def disable(): Api = js.native
  /**
    * Enable / disable the fixed elements
    */
  def enable(enable: Boolean): Api = js.native
  /**
    * Get the fixed footer's offset.
    */
  def footerOffset(offset: Double): Api = js.native
  /**
    * Get the fixed header's offset.
    */
  def headerOffset(offset: Double): Api = js.native
}

object FixedHeaderApi {
  @scala.inline
  def apply(
    adjust: () => Api,
    disable: () => Api,
    enable: Boolean => Api,
    footerOffset: Double => Api,
    headerOffset: Double => Api
  ): FixedHeaderApi = {
    val __obj = js.Dynamic.literal(adjust = js.Any.fromFunction0(adjust), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction1(enable), footerOffset = js.Any.fromFunction1(footerOffset), headerOffset = js.Any.fromFunction1(headerOffset))
    __obj.asInstanceOf[FixedHeaderApi]
  }
  @scala.inline
  implicit class FixedHeaderApiOps[Self <: FixedHeaderApi] (val x: Self) extends AnyVal {
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
    def setAdjust(value: () => Api): Self = this.set("adjust", js.Any.fromFunction0(value))
    @scala.inline
    def setDisable(value: () => Api): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: Boolean => Api): Self = this.set("enable", js.Any.fromFunction1(value))
    @scala.inline
    def setFooterOffset(value: Double => Api): Self = this.set("footerOffset", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderOffset(value: Double => Api): Self = this.set("headerOffset", js.Any.fromFunction1(value))
  }
  
}

