package typings
package atBlueprintjsCoreLib.libEsmComponentsMenuMenuDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuDividerProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /** This component does not support children. */
  var children: js.UndefOr[scala.Nothing] = js.undefined
  /** Optional header title. */
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object IMenuDividerProps {
  @scala.inline
  def apply(
    children: js.UndefOr[scala.Nothing] = js.undefined,
    className: java.lang.String = null,
    title: reactLib.reactMod.ReactNode = null
  ): IMenuDividerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuDividerProps]
  }
}

