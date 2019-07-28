package typings.atBlueprintjsCore.libEsmComponentsMenuMenuDividerMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuDividerProps extends IProps {
  /** Optional header title. */
  var title: js.UndefOr[ReactNode] = js.undefined
}

object IMenuDividerProps {
  @scala.inline
  def apply(className: String = null, title: ReactNode = null): IMenuDividerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuDividerProps]
  }
}

