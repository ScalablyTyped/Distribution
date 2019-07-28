package typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysMod

import typings.atBlueprintjsCore.Anon_ArgsDisplayName
import typings.atBlueprintjsCore.libEsmCommonConstructorMod.IConstructor
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysDialogMod.IHotkeysDialogProps
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
import typings.std.KeyboardEvent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): Anon_ArgsDisplayName with T = js.native
  def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = js.native
  def getKeyCombo(e: KeyboardEvent): IKeyCombo = js.native
  def getKeyComboString(e: KeyboardEvent): String = js.native
  def hideHotkeysDialog(): Unit = js.native
  def parseKeyCombo(combo: String): IKeyCombo = js.native
  def setHotkeysDialogProps(props: Partial[IHotkeysDialogProps]): Unit = js.native
}

