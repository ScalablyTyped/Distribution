package typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeyParserMod

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Aliases: IKeyMap = js.native
  val KeyCodes: IKeyCodeTable = js.native
  val ModifierBitMasks: IKeyCodeReverseTable = js.native
  val Modifiers: IKeyCodeTable = js.native
  val ShiftKeys: IKeyMap = js.native
  def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = js.native
  def getKeyCombo(e: KeyboardEvent): IKeyCombo = js.native
  def getKeyComboString(e: KeyboardEvent): String = js.native
  def normalizeKeyCombo(combo: String): js.Array[String] = js.native
  def normalizeKeyCombo(combo: String, platformOverride: String): js.Array[String] = js.native
  def parseKeyCombo(combo: String): IKeyCombo = js.native
}

