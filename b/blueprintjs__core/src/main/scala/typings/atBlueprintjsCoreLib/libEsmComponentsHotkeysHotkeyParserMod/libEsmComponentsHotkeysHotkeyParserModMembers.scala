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
  val getKeyCombo: js.Function1[/* e */ reactLib.KeyboardEvent, IKeyCombo] = js.native
  val getKeyComboString: js.Function1[/* e */ reactLib.KeyboardEvent, java.lang.String] = js.native
  val normalizeKeyCombo: js.Function2[
    /* combo */ java.lang.String, 
    /* platformOverride */ js.UndefOr[java.lang.String], 
    js.Array[java.lang.String]
  ] = js.native
  val parseKeyCombo: js.Function1[/* combo */ java.lang.String, IKeyCombo] = js.native
  def comboMatches(a: IKeyCombo, b: IKeyCombo): scala.Boolean = js.native
}

