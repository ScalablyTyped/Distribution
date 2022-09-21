package typings.b

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("b_", JSImport.Namespace)
  @js.native
  val ^ : Formatter = js.native
  
  @js.native
  trait BlockFormatter extends StObject {
    
    def apply(): String = js.native
    def apply(elem: String): String = js.native
    def apply(elem: String, mods: Mods): String = js.native
    def apply(mods: Mods): String = js.native
  }
  
  type ElemFormatter = js.Function1[/* mods */ js.UndefOr[Mods], String]
  
  @js.native
  trait Formatter extends StObject {
    
    def apply(block: String): String = js.native
    def apply(block: String, elem: String): String = js.native
    def apply(block: String, elem: String, mods: Mods): String = js.native
    def apply(block: String, mods: Mods): String = js.native
    
    def B(options: Options): Formatter = js.native
    
    def lock(block: String): BlockFormatter = js.native
    def lock(block: String, elem: String): ElemFormatter = js.native
    
    def `with`(block: String): BlockFormatter = js.native
    def `with`(block: String, elem: String): ElemFormatter = js.native
  }
  
  type Mods = StringDictionary[Any]
  
  trait Options extends StObject {
    
    var classSeparator: js.UndefOr[String] = js.undefined
    
    var elementSeparator: js.UndefOr[String] = js.undefined
    
    var isFullBoolValue: js.UndefOr[Boolean] = js.undefined
    
    var isFullModifier: js.UndefOr[Boolean] = js.undefined
    
    var modSeparator: js.UndefOr[String] = js.undefined
    
    var modValueSeparator: js.UndefOr[String] = js.undefined
    
    var tailSpace: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClassSeparator(value: String): Self = StObject.set(x, "classSeparator", value.asInstanceOf[js.Any])
      
      inline def setClassSeparatorUndefined: Self = StObject.set(x, "classSeparator", js.undefined)
      
      inline def setElementSeparator(value: String): Self = StObject.set(x, "elementSeparator", value.asInstanceOf[js.Any])
      
      inline def setElementSeparatorUndefined: Self = StObject.set(x, "elementSeparator", js.undefined)
      
      inline def setIsFullBoolValue(value: Boolean): Self = StObject.set(x, "isFullBoolValue", value.asInstanceOf[js.Any])
      
      inline def setIsFullBoolValueUndefined: Self = StObject.set(x, "isFullBoolValue", js.undefined)
      
      inline def setIsFullModifier(value: Boolean): Self = StObject.set(x, "isFullModifier", value.asInstanceOf[js.Any])
      
      inline def setIsFullModifierUndefined: Self = StObject.set(x, "isFullModifier", js.undefined)
      
      inline def setModSeparator(value: String): Self = StObject.set(x, "modSeparator", value.asInstanceOf[js.Any])
      
      inline def setModSeparatorUndefined: Self = StObject.set(x, "modSeparator", js.undefined)
      
      inline def setModValueSeparator(value: String): Self = StObject.set(x, "modValueSeparator", value.asInstanceOf[js.Any])
      
      inline def setModValueSeparatorUndefined: Self = StObject.set(x, "modValueSeparator", js.undefined)
      
      inline def setTailSpace(value: String): Self = StObject.set(x, "tailSpace", value.asInstanceOf[js.Any])
      
      inline def setTailSpaceUndefined: Self = StObject.set(x, "tailSpace", js.undefined)
    }
  }
  
  type _To = Formatter
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Formatter = ^
}
