package typings.blueprintjsCore.keyComboMod

import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyComboProps extends IProps {
  /** The key combo to display, such as `"cmd + s"`. */
  var combo: String
  /**
    * Whether to render in a minimal style.
    * If `false`, each key in the combo will be rendered inside a `<kbd>` tag.
    * If `true`, only the icon or short name of a key will be rendered with no wrapper styles.
    * @default false
    */
  var minimal: js.UndefOr[Boolean] = js.undefined
}

object IKeyComboProps {
  @scala.inline
  def apply(combo: String, className: String = null, minimal: js.UndefOr[Boolean] = js.undefined): IKeyComboProps = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyComboProps]
  }
}

