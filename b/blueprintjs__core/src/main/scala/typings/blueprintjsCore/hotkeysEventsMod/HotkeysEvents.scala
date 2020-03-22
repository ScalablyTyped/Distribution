package typings.blueprintjsCore.hotkeysEventsMod

import typings.blueprintjsCore.IHotkeysPropschildrenReacChildren
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysEvents", "HotkeysEvents")
@js.native
class HotkeysEvents protected () extends js.Object {
  def this(scope: HotkeyScope) = this()
  var actions: js.Any = js.native
  var invokeNamedCallbackIfComboRecognized: js.Any = js.native
  var isScope: js.Any = js.native
  var isTextInput: js.Any = js.native
  var scope: js.Any = js.native
  def clear(): Unit = js.native
  def count(): Double = js.native
  def handleKeyDown(e: KeyboardEvent): Unit = js.native
  def handleKeyUp(e: KeyboardEvent): Unit = js.native
  def setHotkeys(props: IHotkeysPropschildrenReacChildren): Unit = js.native
}

