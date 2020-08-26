package typings.bootbox

import typings.bootbox.bootboxStrings.`extra-large`
import typings.bootbox.bootboxStrings.large
import typings.bootbox.bootboxStrings.lg
import typings.bootbox.bootboxStrings.sm
import typings.bootbox.bootboxStrings.small
import typings.bootbox.bootboxStrings.xl
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options shared by all modal types */
@js.native
trait BootboxBaseOptions[T] extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var backdrop: js.UndefOr[Boolean] = js.native
  var buttons: js.UndefOr[BootboxButtonMap] = js.native
  var callback: js.UndefOr[js.Function1[/* result */ T, _]] = js.native
  var className: js.UndefOr[String] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[String] = js.native
  var onEscape: js.UndefOr[js.Function0[_] | Boolean] = js.native
   // complex object where each key is of type BootboxButton
  var scrollable: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
  /** All other values result in medium */
  var size: js.UndefOr[small | sm | large | lg | `extra-large` | xl] = js.native
  var title: js.UndefOr[String | Element] = js.native
}

object BootboxBaseOptions {
  @scala.inline
  def apply[T](): BootboxBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootboxBaseOptions[T]]
  }
  @scala.inline
  implicit class BootboxBaseOptionsOps[Self <: BootboxBaseOptions[_], T] (val x: Self with BootboxBaseOptions[T]) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBackdrop(value: Boolean): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    @scala.inline
    def setButtons(value: BootboxButtonMap): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCallback(value: /* result */ T => _): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setOnEscapeFunction0(value: () => _): Self = this.set("onEscape", js.Any.fromFunction0(value))
    @scala.inline
    def setOnEscape(value: js.Function0[_] | Boolean): Self = this.set("onEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEscape: Self = this.set("onEscape", js.undefined)
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSize(value: small | sm | large | lg | `extra-large` | xl): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTitle(value: String | Element): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

