package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", JSImport.Namespace)
@js.native
object libEsmComponentsHotkeysHotkeyParserModMembers extends js.Object {
  val Aliases: IKeyMap = js.native
  val KeyCodes: IKeyCodeTable = js.native
  val ModifierBitMasks: IKeyCodeReverseTable = js.native
  val Modifiers: IKeyCodeTable = js.native
  val ShiftKeys: IKeyMap = js.native
  def comboMatches(a: IKeyCombo, b: IKeyCombo): scala.Boolean = js.native
  def getKeyCombo(e: reactLib.KeyboardEvent): IKeyCombo = js.native
  def getKeyComboString(e: reactLib.KeyboardEvent): java.lang.String = js.native
  def normalizeKeyCombo(combo: java.lang.String): js.Array[java.lang.String] = js.native
  def normalizeKeyCombo(combo: java.lang.String, platformOverride: java.lang.String): js.Array[java.lang.String] = js.native
  def parseKeyCombo(combo: java.lang.String): IKeyCombo = js.native
}

