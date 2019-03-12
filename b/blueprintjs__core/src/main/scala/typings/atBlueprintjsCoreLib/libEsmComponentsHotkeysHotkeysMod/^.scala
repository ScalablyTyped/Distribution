package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def HotkeysTarget[T /* <: atBlueprintjsCoreLib.libEsmCommonConstructorMod.IConstructor[
    atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
  ] */](WrappedComponent: T): atBlueprintjsCoreLib.Anon_ArgsDisplayName with T = js.native
  def comboMatches(
    a: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo,
    b: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  ): scala.Boolean = js.native
  def getKeyCombo(e: stdLib.KeyboardEvent): atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo = js.native
  def getKeyComboString(e: stdLib.KeyboardEvent): java.lang.String = js.native
  def hideHotkeysDialog(): scala.Unit = js.native
  def parseKeyCombo(combo: java.lang.String): atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo = js.native
  def setHotkeysDialogProps(
    props: stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysDialogMod.IHotkeysDialogProps]
  ): scala.Unit = js.native
}

