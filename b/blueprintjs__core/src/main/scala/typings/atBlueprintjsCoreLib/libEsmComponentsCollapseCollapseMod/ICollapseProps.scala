package typings
package atBlueprintjsCoreLib.libEsmComponentsCollapseCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapseProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Component to render as the root element.
    * Useful when rendering a `Collapse` inside a `<table>`, for instance.
    * @default "div"
    */
  var component: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  /**
    * Whether the component is open or closed.
    * @default false
    */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the child components will remain mounted when the `Collapse` is closed.
    * Setting to true may improve performance by avoiding re-mounting children.
    * @default false
    */
  var keepChildrenMounted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The length of time the transition takes, in milliseconds. This must match
    * the duration of the animation in CSS. Only set this prop if you override
    * Blueprint's default transitions with new transitions of a different
    * length.
    * @default 200
    */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

object ICollapseProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    component: reactLib.reactMod.ReactType[_] = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    keepChildrenMounted: js.UndefOr[scala.Boolean] = js.undefined,
    transitionDuration: scala.Int | scala.Double = null
  ): ICollapseProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(keepChildrenMounted)) __obj.updateDynamic("keepChildrenMounted")(keepChildrenMounted)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollapseProps]
  }
}

