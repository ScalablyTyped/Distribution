package typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod

import typings.atBlueprintjsCore.Anon_Children
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysMod.IHotkeysProps
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysEvents", "HotkeysEvents")
@js.native
class HotkeysEvents protected () extends js.Object {
  def this(scope: HotkeyScope) = this()
  var actions: js.Any = js.native
  var scope: js.Any = js.native
  def clear(): Unit = js.native
  def count(): Double = js.native
  def handleKeyDown(e: KeyboardEvent): Unit = js.native
  def handleKeyUp(e: KeyboardEvent): Unit = js.native
  /* private */ def invokeNamedCallbackIfComboRecognized(combo: js.Any, callbackName: js.Any, e: js.Any): js.Any = js.native
  /* private */ def isScope(props: js.Any): js.Any = js.native
  /* private */ def isTextInput(e: js.Any): js.Any = js.native
  def setHotkeys(props: IHotkeysProps with Anon_Children): Unit = js.native
}

