package typings.blueprintjsCore

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeyParserMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "Aliases")
  @js.native
  val Aliases: IKeyMap = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "KeyCodes")
  @js.native
  val KeyCodes: IKeyCodeTable = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "ModifierBitMasks")
  @js.native
  val ModifierBitMasks: IKeyCodeReverseTable = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "Modifiers")
  @js.native
  val Modifiers: IKeyCodeTable = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "ShiftKeys")
  @js.native
  val ShiftKeys: IKeyMap = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "comboMatches")
  @js.native
  def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "getKeyCombo")
  @js.native
  def getKeyCombo(e: KeyboardEvent): IKeyCombo = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "getKeyComboString")
  @js.native
  def getKeyComboString(e: KeyboardEvent): String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "normalizeKeyCombo")
  @js.native
  def normalizeKeyCombo(combo: String): js.Array[String] = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "normalizeKeyCombo")
  @js.native
  def normalizeKeyCombo(combo: String, platformOverride: String): js.Array[String] = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", "parseKeyCombo")
  @js.native
  def parseKeyCombo(combo: String): IKeyCombo = js.native
  
  type IKeyCodeReverseTable = StringDictionary[Double]
  
  type IKeyCodeTable = NumberDictionary[String]
  
  @js.native
  trait IKeyCombo extends StObject {
    
    var key: js.UndefOr[String] = js.native
    
    var modifiers: Double = js.native
  }
  object IKeyCombo {
    
    @scala.inline
    def apply(modifiers: Double): IKeyCombo = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyCombo]
    }
    
    @scala.inline
    implicit class IKeyComboMutableBuilder[Self <: IKeyCombo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setModifiers(value: Double): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    }
  }
  
  type IKeyMap = StringDictionary[String]
}
