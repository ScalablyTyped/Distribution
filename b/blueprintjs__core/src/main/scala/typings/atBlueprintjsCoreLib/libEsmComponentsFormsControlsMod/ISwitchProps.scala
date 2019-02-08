package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsControlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwitchProps extends IControlProps {
  /**
    * Text to display inside the switch indicator when unchecked.
    */
  var innerLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text to display inside the switch indicator when checked.
    * If `innerLabel` is provided and this prop is omitted, then `innerLabel`
    * will be used for both states.
    * @default innerLabel
    */
  var innerLabelChecked: js.UndefOr[java.lang.String] = js.undefined
}

