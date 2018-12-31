package typings
package atBlueprintjsCoreLib.libEsmCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionProps
  extends IIntentProps
     with IProps {
  /** Whether this action is non-interactive. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render before the text. */
  var icon: js.UndefOr[atBlueprintjsIconsLib.libEsmIconNameMod.IconName | MaybeElement] = js.undefined
  /** Click event handler. */
  var onClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /** Action text. Can be any single React renderable. */
  var text: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

