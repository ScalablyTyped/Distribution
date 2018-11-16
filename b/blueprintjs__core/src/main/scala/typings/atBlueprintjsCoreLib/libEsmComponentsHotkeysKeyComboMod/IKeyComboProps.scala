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

