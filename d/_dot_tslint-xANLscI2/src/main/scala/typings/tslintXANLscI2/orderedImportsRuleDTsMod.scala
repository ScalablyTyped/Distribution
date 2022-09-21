package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderedImportsRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/orderedImportsRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/orderedImportsRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/orderedImportsRule.d.ts", "Rule.IMPORT_SOURCES_NOT_GROUPED_PREFIX")
    @js.native
    def IMPORT_SOURCES_NOT_GROUPED_PREFIX: String = js.native
    inline def IMPORT_SOURCES_NOT_GROUPED_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMPORT_SOURCES_NOT_GROUPED_PREFIX")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/orderedImportsRule.d.ts", "Rule.IMPORT_SOURCES_UNORDERED")
    @js.native
    def IMPORT_SOURCES_UNORDERED: String = js.native
    inline def IMPORT_SOURCES_UNORDERED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMPORT_SOURCES_UNORDERED")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/orderedImportsRule.d.ts", "Rule.NAMED_IMPORTS_UNORDERED")
    @js.native
    def NAMED_IMPORTS_UNORDERED: String = js.native
    inline def NAMED_IMPORTS_UNORDERED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAMED_IMPORTS_UNORDERED")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/orderedImportsRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
