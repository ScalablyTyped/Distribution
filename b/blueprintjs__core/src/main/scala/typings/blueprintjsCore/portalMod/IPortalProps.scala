package typings.blueprintjsCore.portalMod

import typings.blueprintjsCore.propsMod.IProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPortalProps extends IProps {
  /**
    * The HTML element that children will be mounted to.
    * @default document.body
    */
  var container: js.UndefOr[HTMLElement] = js.native
  /**
    * Callback invoked when the children of this `Portal` have been added to the DOM.
    */
  var onChildrenMount: js.UndefOr[js.Function0[Unit]] = js.native
}

object IPortalProps {
  @scala.inline
  def apply(): IPortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPortalProps]
  }
  @scala.inline
  implicit class IPortalPropsOps[Self <: IPortalProps] (val x: Self) extends AnyVal {
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setOnChildrenMount(value: () => Unit): Self = this.set("onChildrenMount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnChildrenMount: Self = this.set("onChildrenMount", js.undefined)
  }
  
}

