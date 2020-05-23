package typings.blueprintjsCore.nonIdealStateMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.ReactChild
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INonIdealStateProps extends IProps {
  /** An action to resolve the non-ideal state which appears after `description`. */
  var action: js.UndefOr[Element] = js.undefined
  /**
    * Advanced usage: React `children` will appear last (after `action`).
    * Avoid passing raw strings as they will not receive margins and disrupt the layout flow.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * A longer description of the non-ideal state.
    * A string or number value will be wrapped in a `<div>` to preserve margins.
    */
  var description: js.UndefOr[ReactChild] = js.undefined
  /** The name of a Blueprint icon or a JSX Element (such as `<Spinner/>`) to render above the title. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /** The title of the non-ideal state. */
  var title: js.UndefOr[ReactNode] = js.undefined
}

object INonIdealStateProps {
  @scala.inline
  def apply(
    action: Element = null,
    children: ReactNode = null,
    className: String = null,
    description: ReactChild = null,
    icon: js.UndefOr[Null | IconName | MaybeElement] = js.undefined,
    title: ReactNode = null
  ): INonIdealStateProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[INonIdealStateProps]
  }
}

