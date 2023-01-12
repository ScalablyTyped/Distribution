package typings.blueprintjsCore

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsHotkeysHotkeyParserMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeyParser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("comboMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getKeyCombo(e: KeyboardEvent): IKeyCombo = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyCombo")(e.asInstanceOf[js.Any]).asInstanceOf[IKeyCombo]
  
  inline def getKeyComboString(e: KeyboardEvent): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyComboString")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeKeyCombo(combo: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeKeyCombo")(combo.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def normalizeKeyCombo(combo: String, platformOverride: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeKeyCombo")(combo.asInstanceOf[js.Any], platformOverride.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def parseKeyCombo(combo: String): IKeyCombo = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyCombo")(combo.asInstanceOf[js.Any]).asInstanceOf[IKeyCombo]
  
  type IKeyCodeReverseTable = StringDictionary[Double]
  
  type IKeyCodeTable = NumberDictionary[String]
  
  trait IKeyCombo extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var modifiers: Double
  }
  object IKeyCombo {
    
    inline def apply(modifiers: Double): IKeyCombo = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyCombo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IKeyCombo] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setModifiers(value: Double): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    }
  }
  
  type IKeyMap = StringDictionary[String]
}
