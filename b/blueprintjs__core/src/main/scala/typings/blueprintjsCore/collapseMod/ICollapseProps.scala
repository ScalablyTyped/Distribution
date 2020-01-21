package typings.blueprintjsCore.collapseMod

import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapseProps extends IProps {
  /**
    * Component to render as the root element.
    * Useful when rendering a `Collapse` inside a `<table>`, for instance.
    * @default "div"
    */
  var component: js.UndefOr[ReactType[_]] = js.undefined
  /**
    * Whether the component is open or closed.
    * @default false
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the child components will remain mounted when the `Collapse` is closed.
    * Setting to true may improve performance by avoiding re-mounting children.
    * @default false
    */
  var keepChildrenMounted: js.UndefOr[Boolean] = js.undefined
  /**
    * The length of time the transition takes, in milliseconds. This must match
    * the duration of the animation in CSS. Only set this prop if you override
    * Blueprint's default transitions with new transitions of a different
    * length.
    * @default 200
    */
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object ICollapseProps {
  @scala.inline
  def apply(
    className: String = null,
    component: ReactType[_] = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    keepChildrenMounted: js.UndefOr[Boolean] = js.undefined,
    transitionDuration: Int | Double = null
  ): ICollapseProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(keepChildrenMounted)) __obj.updateDynamic("keepChildrenMounted")(keepChildrenMounted.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollapseProps]
  }
}

