package typings.cssSelectorParser

import org.scalablytyped.runtime.StringDictionary
import typings.cssSelectorParser.cssSelectorParserBooleans.`true`
import typings.cssSelectorParser.parserContextMod.PseudoSelectorType
import typings.cssSelectorParser.selectorMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-selector-parser", "CssSelectorParser")
  @js.native
  open class CssSelectorParser () extends StObject {
    
    /* protected */ var attrEqualityMods: StringDictionary[`true`] = js.native
    
    def disableSubstitutes(): this.type = js.native
    
    def enableSubstitutes(): this.type = js.native
    
    def parse(str: String): Selector = js.native
    
    /* protected */ var pseudos: StringDictionary[PseudoSelectorType] = js.native
    
    def registerAttrEqualityMods(mods: String*): this.type = js.native
    
    def registerNestingOperators(operators: String*): this.type = js.native
    
    def registerNumericPseudos(pseudos: String*): this.type = js.native
    
    def registerSelectorPseudos(pseudos: String*): this.type = js.native
    
    def render(path: Selector): String = js.native
    
    /* protected */ var ruleNestingOperators: StringDictionary[`true`] = js.native
    
    /* protected */ var substitutesEnabled: Boolean = js.native
    
    def unregisterAttrEqualityMods(mods: String*): this.type = js.native
    
    def unregisterNestingOperators(operators: String*): this.type = js.native
    
    def unregisterNumericPseudos(pseudos: String*): this.type = js.native
    
    def unregisterSelectorPseudos(pseudos: String*): this.type = js.native
  }
}
