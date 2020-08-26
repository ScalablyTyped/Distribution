package typings.blueprintjsCore.collapseMod

import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollapseProps extends IProps {
  /**
    * Component to render as the root element.
    * Useful when rendering a `Collapse` inside a `<table>`, for instance.
    * @default "div"
    */
  var component: js.UndefOr[ElementType[_]] = js.native
  /**
    * Whether the component is open or closed.
    * @default false
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Whether the child components will remain mounted when the `Collapse` is closed.
    * Setting to true may improve performance by avoiding re-mounting children.
    * @default false
    */
  var keepChildrenMounted: js.UndefOr[Boolean] = js.native
  /**
    * The length of time the transition takes, in milliseconds. This must match
    * the duration of the animation in CSS. Only set this prop if you override
    * Blueprint's default transitions with new transitions of a different
    * length.
    * @default 200
    */
  var transitionDuration: js.UndefOr[Double] = js.native
}

object ICollapseProps {
  @scala.inline
  def apply(): ICollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollapseProps]
  }
  @scala.inline
  implicit class ICollapsePropsOps[Self <: ICollapseProps] (val x: Self) extends AnyVal {
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
    def setComponent(value: ElementType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setKeepChildrenMounted(value: Boolean): Self = this.set("keepChildrenMounted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepChildrenMounted: Self = this.set("keepChildrenMounted", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
  }
  
}

