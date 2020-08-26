package typings.blueprintjsCore.toasterMod

import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToasterProps extends IProps {
  /**
    * Whether a toast should acquire application focus when it first opens.
    * This is disabled by default so that toasts do not interrupt the user's flow.
    * Note that `enforceFocus` is always disabled for `Toaster`s.
    * @default false
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether pressing the `esc` key should clear all active toasts.
    * @default true
    */
  var canEscapeKeyClear: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of active toasts that can be displayed at once.
    *
    * When the limit is about to be exceeded, the oldest active toast is removed.
    * @default undefined
    */
  var maxToasts: js.UndefOr[Double] = js.native
  /**
    * Position of `Toaster` within its container.
    * @default Position.TOP
    */
  var position: js.UndefOr[ToasterPosition] = js.native
  /**
    * Whether the toaster should be rendered into a new element attached to `document.body`.
    * If `false`, then positioning will be relative to the parent element.
    *
    * This prop is ignored by `Toaster.create()` as that method always appends a new element
    * to the container.
    * @default true
    */
  var usePortal: js.UndefOr[Boolean] = js.native
}

object IToasterProps {
  @scala.inline
  def apply(): IToasterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToasterProps]
  }
  @scala.inline
  implicit class IToasterPropsOps[Self <: IToasterProps] (val x: Self) extends AnyVal {
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setCanEscapeKeyClear(value: Boolean): Self = this.set("canEscapeKeyClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanEscapeKeyClear: Self = this.set("canEscapeKeyClear", js.undefined)
    @scala.inline
    def setMaxToasts(value: Double): Self = this.set("maxToasts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxToasts: Self = this.set("maxToasts", js.undefined)
    @scala.inline
    def setPosition(value: ToasterPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setUsePortal(value: Boolean): Self = this.set("usePortal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePortal: Self = this.set("usePortal", js.undefined)
  }
  
}

