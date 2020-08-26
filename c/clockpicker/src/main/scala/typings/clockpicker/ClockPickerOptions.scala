package typings.clockpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClockPickerOptions extends js.Object {
  var afterDone: js.UndefOr[js.Function0[Unit]] = js.native
  var afterHide: js.UndefOr[js.Function0[Unit]] = js.native
  var afterHourSelect: js.UndefOr[js.Function0[Unit]] = js.native
  var afterShow: js.UndefOr[js.Function0[Unit]] = js.native
  var align: js.UndefOr[String] = js.native
  var autoclose: js.UndefOr[Boolean] = js.native
  var beforeDone: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeHide: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeHourSelect: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeShow: js.UndefOr[js.Function0[Unit]] = js.native
  var default: js.UndefOr[String] = js.native
  var donetext: js.UndefOr[String] = js.native
  var fromnow: js.UndefOr[Double] = js.native
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  var placement: js.UndefOr[String] = js.native
  var twelvehour: js.UndefOr[Boolean] = js.native
  var vibrate: js.UndefOr[Boolean] = js.native
}

object ClockPickerOptions {
  @scala.inline
  def apply(): ClockPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClockPickerOptions]
  }
  @scala.inline
  implicit class ClockPickerOptionsOps[Self <: ClockPickerOptions] (val x: Self) extends AnyVal {
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
    def setAfterDone(value: () => Unit): Self = this.set("afterDone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterDone: Self = this.set("afterDone", js.undefined)
    @scala.inline
    def setAfterHide(value: () => Unit): Self = this.set("afterHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterHide: Self = this.set("afterHide", js.undefined)
    @scala.inline
    def setAfterHourSelect(value: () => Unit): Self = this.set("afterHourSelect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterHourSelect: Self = this.set("afterHourSelect", js.undefined)
    @scala.inline
    def setAfterShow(value: () => Unit): Self = this.set("afterShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterShow: Self = this.set("afterShow", js.undefined)
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAutoclose(value: Boolean): Self = this.set("autoclose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoclose: Self = this.set("autoclose", js.undefined)
    @scala.inline
    def setBeforeDone(value: () => Unit): Self = this.set("beforeDone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeDone: Self = this.set("beforeDone", js.undefined)
    @scala.inline
    def setBeforeHide(value: () => Unit): Self = this.set("beforeHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeHide: Self = this.set("beforeHide", js.undefined)
    @scala.inline
    def setBeforeHourSelect(value: () => Unit): Self = this.set("beforeHourSelect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeHourSelect: Self = this.set("beforeHourSelect", js.undefined)
    @scala.inline
    def setBeforeShow(value: () => Unit): Self = this.set("beforeShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeShow: Self = this.set("beforeShow", js.undefined)
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDonetext(value: String): Self = this.set("donetext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDonetext: Self = this.set("donetext", js.undefined)
    @scala.inline
    def setFromnow(value: Double): Self = this.set("fromnow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromnow: Self = this.set("fromnow", js.undefined)
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setTwelvehour(value: Boolean): Self = this.set("twelvehour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwelvehour: Self = this.set("twelvehour", js.undefined)
    @scala.inline
    def setVibrate(value: Boolean): Self = this.set("vibrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVibrate: Self = this.set("vibrate", js.undefined)
  }
  
}

