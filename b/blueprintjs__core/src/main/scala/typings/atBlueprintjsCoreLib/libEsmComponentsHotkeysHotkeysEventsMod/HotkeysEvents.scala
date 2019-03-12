package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysEvents", "HotkeysEvents")
@js.native
class HotkeysEvents protected () extends js.Object {
  def this(scope: HotkeyScope) = this()
  var actions: js.Any = js.native
  var scope: js.Any = js.native
  def clear(): scala.Unit = js.native
  def count(): scala.Double = js.native
  def handleKeyDown(e: stdLib.KeyboardEvent): scala.Unit = js.native
  def handleKeyUp(e: stdLib.KeyboardEvent): scala.Unit = js.native
  /* private */ def invokeNamedCallbackIfComboRecognized(combo: js.Any, callbackName: js.Any, e: js.Any): js.Any = js.native
  /* private */ def isScope(props: js.Any): js.Any = js.native
  /* private */ def isTextInput(e: js.Any): js.Any = js.native
  def setHotkeys(
    props: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysMod.IHotkeysProps with atBlueprintjsCoreLib.Anon_Children
  ): scala.Unit = js.native
}

