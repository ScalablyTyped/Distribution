package typings.cssSelectorParser

import org.scalablytyped.runtime.StringDictionary
import typings.cssSelectorParser.cssSelectorParserBooleans.`true`
import typings.cssSelectorParser.parserContextMod.PseudoSelectorType
import typings.cssSelectorParser.selectorMod.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-selector-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class CssSelectorParser () extends js.Object {
    
    var attrEqualityMods: StringDictionary[`true`] = js.native
    
    def disableSubstitutes(): this.type = js.native
    
    def enableSubstitutes(): this.type = js.native
    
    def parse(str: String): Selector = js.native
    
    var pseudos: StringDictionary[PseudoSelectorType] = js.native
    
    def registerAttrEqualityMods(mods: String*): this.type = js.native
    
    def registerNestingOperators(operators: String*): this.type = js.native
    
    def registerNumericPseudos(pseudos: String*): this.type = js.native
    
    def registerSelectorPseudos(pseudos: String*): this.type = js.native
    
    def render(path: Selector): String = js.native
    
    var ruleNestingOperators: StringDictionary[`true`] = js.native
    
    var substitutesEnabled: Boolean = js.native
    
    def unregisterAttrEqualityMods(mods: String*): this.type = js.native
    
    def unregisterNestingOperators(operators: String*): this.type = js.native
    
    def unregisterNumericPseudos(pseudos: String*): this.type = js.native
    
    def unregisterSelectorPseudos(pseudos: String*): this.type = js.native
  }
}
