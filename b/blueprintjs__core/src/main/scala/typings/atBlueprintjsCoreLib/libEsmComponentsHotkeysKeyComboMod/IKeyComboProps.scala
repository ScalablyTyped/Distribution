package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysKeyComboMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyComboProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /** The key combo to display, such as `"cmd + s"`. */
  var combo: java.lang.String
  /**
    * Whether to render in a minimal style.
    * If `false`, each key in the combo will be rendered inside a `<kbd>` tag.
    * If `true`, only the icon or short name of a key will be rendered with no wrapper styles.
    * @default false
    */
  var minimal: js.UndefOr[scala.Boolean] = js.undefined
}

object IKeyComboProps {
  @scala.inline
  def apply(
    combo: java.lang.String,
    className: java.lang.String = null,
    minimal: js.UndefOr[scala.Boolean] = js.undefined
  ): IKeyComboProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("combo")(combo)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal)
    __obj.asInstanceOf[IKeyComboProps]
  }
}

