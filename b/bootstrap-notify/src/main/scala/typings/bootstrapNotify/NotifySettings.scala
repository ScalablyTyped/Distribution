package typings.bootstrapNotify

import typings.bootstrapNotify.anon.Align
import typings.bootstrapNotify.anon.Enter
import typings.bootstrapNotify.anon.X
import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifySettings extends js.Object {
  var allow_dismiss: js.UndefOr[Boolean] = js.native
  var allow_duplicates: js.UndefOr[Boolean] = js.native
  var animate: js.UndefOr[Enter] = js.native
  var delay: js.UndefOr[Double] = js.native
  var element: js.UndefOr[String] = js.native
  var icon_type: js.UndefOr[String] = js.native
  var mouse_over: js.UndefOr[String] = js.native
  var newest_on_top: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double | X] = js.native
  var onClose: js.UndefOr[js.Function1[/* $ele */ JQuery[HTMLElement], Unit]] = js.native
  var onClosed: js.UndefOr[js.Function1[/* $ele */ JQuery[HTMLElement], Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[/* $ele */ JQuery[HTMLElement], Unit]] = js.native
  var onShown: js.UndefOr[js.Function1[/* $ele */ JQuery[HTMLElement], Unit]] = js.native
  var placement: js.UndefOr[Align] = js.native
  var position: js.UndefOr[String] = js.native
  var showProgressbar: js.UndefOr[Boolean] = js.native
  var spacing: js.UndefOr[Double] = js.native
  var template: js.UndefOr[String] = js.native
  var timer: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url_target: js.UndefOr[String] = js.native
  var z_index: js.UndefOr[Double] = js.native
}

object NotifySettings {
  @scala.inline
  def apply(): NotifySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifySettings]
  }
  @scala.inline
  implicit class NotifySettingsOps[Self <: NotifySettings] (val x: Self) extends AnyVal {
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
    def setAllow_dismiss(value: Boolean): Self = this.set("allow_dismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_dismiss: Self = this.set("allow_dismiss", js.undefined)
    @scala.inline
    def setAllow_duplicates(value: Boolean): Self = this.set("allow_duplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_duplicates: Self = this.set("allow_duplicates", js.undefined)
    @scala.inline
    def setAnimate(value: Enter): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setIcon_type(value: String): Self = this.set("icon_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon_type: Self = this.set("icon_type", js.undefined)
    @scala.inline
    def setMouse_over(value: String): Self = this.set("mouse_over", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouse_over: Self = this.set("mouse_over", js.undefined)
    @scala.inline
    def setNewest_on_top(value: Boolean): Self = this.set("newest_on_top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewest_on_top: Self = this.set("newest_on_top", js.undefined)
    @scala.inline
    def setOffset(value: Double | X): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnClose(value: /* $ele */ JQuery[HTMLElement] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnClosed(value: /* $ele */ JQuery[HTMLElement] => Unit): Self = this.set("onClosed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClosed: Self = this.set("onClosed", js.undefined)
    @scala.inline
    def setOnShow(value: /* $ele */ JQuery[HTMLElement] => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOnShown(value: /* $ele */ JQuery[HTMLElement] => Unit): Self = this.set("onShown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShown: Self = this.set("onShown", js.undefined)
    @scala.inline
    def setPlacement(value: Align): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowProgressbar(value: Boolean): Self = this.set("showProgressbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowProgressbar: Self = this.set("showProgressbar", js.undefined)
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTimer(value: Double): Self = this.set("timer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl_target(value: String): Self = this.set("url_target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl_target: Self = this.set("url_target", js.undefined)
    @scala.inline
    def setZ_index(value: Double): Self = this.set("z_index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ_index: Self = this.set("z_index", js.undefined)
  }
  
}

