package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Aliases: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyMap = js.native
  val KeyCodes: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCodeTable = js.native
  val ModifierBitMasks: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCodeReverseTable = js.native
  val Modifiers: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCodeTable = js.native
  val ShiftKeys: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyMap = js.native
  def comboMatches(
    a: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo,
    b: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  ): scala.Boolean = js.native
  def getKeyCombo(e: reactLib.KeyboardEvent): atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo = js.native
  def getKeyComboString(e: reactLib.KeyboardEvent): java.lang.String = js.native
  def normalizeKeyCombo(combo: java.lang.String): js.Array[java.lang.String] = js.native
  def normalizeKeyCombo(combo: java.lang.String, platformOverride: java.lang.String): js.Array[java.lang.String] = js.native
  def parseKeyCombo(combo: java.lang.String): atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo = js.native
}

