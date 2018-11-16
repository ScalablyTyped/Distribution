package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", JSImport.Namespace)
@js.native
object libEsmComponentsHotkeysHotkeysModMembers extends js.Object {
  val getKeyCombo: js.Function1[
    /* e */ reactLib.KeyboardEvent, 
    atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  ] = js.native
  val getKeyComboString: js.Function1[/* e */ reactLib.KeyboardEvent, java.lang.String] = js.native
  val parseKeyCombo: js.Function1[
    /* combo */ java.lang.String, 
    atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  ] = js.native
  def HotkeysTarget[T /* <: atBlueprintjsCoreLib.libEsmCommonConstructorMod.IConstructor[
    atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
  ] */](WrappedComponent: T): atBlueprintjsCoreLib.Anon_DisplayName with T = js.native
  def comboMatches(
    a: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo,
    b: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  ): scala.Boolean = js.native
  def hideHotkeysDialog(): scala.Unit = js.native
  def setHotkeysDialogProps(
    props: stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysDialogMod.IHotkeysDialogProps]
  ): scala.Unit = js.native
}

