package typings.blueprintjsCore.overlayMod

import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackdropProps extends js.Object {
  /** CSS class names to apply to backdrop element. */
  var backdropClassName: js.UndefOr[String] = js.native
  /** HTML props for the backdrop element. */
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
  /**
    * Whether clicking outside the overlay element (either on backdrop when present or on document)
    * should invoke `onClose`.
    * @default true
    */
  var canOutsideClickClose: js.UndefOr[Boolean] = js.native
  /**
    * Whether a container-spanning backdrop element should be rendered behind the contents.
    * @default true
    */
  var hasBackdrop: js.UndefOr[Boolean] = js.native
}

object IBackdropProps {
  @scala.inline
  def apply(): IBackdropProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBackdropProps]
  }
  @scala.inline
  implicit class IBackdropPropsOps[Self <: IBackdropProps] (val x: Self) extends AnyVal {
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
    def setBackdropClassName(value: String): Self = this.set("backdropClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropClassName: Self = this.set("backdropClassName", js.undefined)
    @scala.inline
    def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = this.set("backdropProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropProps: Self = this.set("backdropProps", js.undefined)
    @scala.inline
    def setCanOutsideClickClose(value: Boolean): Self = this.set("canOutsideClickClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanOutsideClickClose: Self = this.set("canOutsideClickClose", js.undefined)
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = this.set("hasBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBackdrop: Self = this.set("hasBackdrop", js.undefined)
  }
  
}

