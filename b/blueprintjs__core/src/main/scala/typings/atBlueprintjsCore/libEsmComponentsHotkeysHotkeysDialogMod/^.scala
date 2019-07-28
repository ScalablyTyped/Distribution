package typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysDialogMod

import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeyMod.IHotkeyProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hideHotkeysDialog(): Unit = js.native
  def hideHotkeysDialogAfterDelay(): Unit = js.native
  def isHotkeysDialogShowing(): Boolean = js.native
  def setHotkeysDialogProps(props: Partial[IHotkeysDialogProps]): Unit = js.native
  def showHotkeysDialog(hotkeys: js.Array[IHotkeyProps]): Unit = js.native
}

