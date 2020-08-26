package typings.baseui.toastMod

import typings.baseui.anon.Dismiss
import typings.baseui.baseuiStrings.`inline`
import typings.baseui.baseuiStrings.info
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.toast
import typings.baseui.baseuiStrings.warning
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastProps extends js.Object {
  var autoHideDuration: js.UndefOr[Double] = js.native
  var children: js.UndefOr[(js.Function1[/* args */ Dismiss, ReactNode]) | ReactNode] = js.native
  var closeable: js.UndefOr[Boolean] = js.native
  var `data-baseweb`: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var kind: js.UndefOr[info | positive | warning | negative] = js.native
  var notificationType: js.UndefOr[`inline` | toast] = js.native
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  var onClose: js.UndefOr[js.Function0[_]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  var overrides: js.UndefOr[ToastOverrides] = js.native
}

object ToastProps {
  @scala.inline
  def apply(): ToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastProps]
  }
  @scala.inline
  implicit class ToastPropsOps[Self <: ToastProps] (val x: Self) extends AnyVal {
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
    def setAutoHideDuration(value: Double): Self = this.set("autoHideDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHideDuration: Self = this.set("autoHideDuration", js.undefined)
    @scala.inline
    def setChildrenFunction1(value: /* args */ Dismiss => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: (js.Function1[/* args */ Dismiss, ReactNode]) | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCloseable(value: Boolean): Self = this.set("closeable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseable: Self = this.set("closeable", js.undefined)
    @scala.inline
    def `setData-baseweb`(value: String): Self = this.set("data-baseweb", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteData-baseweb`: Self = this.set("data-baseweb", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKind(value: info | positive | warning | negative): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNotificationType(value: `inline` | toast): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationType: Self = this.set("notificationType", js.undefined)
    @scala.inline
    def setOnBlur(value: /* e */ Event => _): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnClose(value: () => _): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnFocus(value: /* e */ Event => _): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: /* e */ Event => _): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: /* e */ Event => _): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOverrides(value: ToastOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

