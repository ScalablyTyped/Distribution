package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHotkeysTargetComponent
  extends reactLib.reactMod.Component[js.Object, js.Object, js.Any] {
  /**
       * Components decorated with the `@HotkeysTarget` decorator must implement
       * this method, and it must return a `Hotkeys` React element.
       */
  def renderHotkeys(): reactLib.reactMod.ReactNs.ReactElement[atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysMod.IHotkeysProps] = js.native
}

