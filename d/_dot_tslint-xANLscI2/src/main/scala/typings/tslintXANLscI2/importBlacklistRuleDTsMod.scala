package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importBlacklistRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/importBlacklistRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/importBlacklistRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/importBlacklistRule.d.ts", "Rule.FAILURE_STRING_REGEX")
    @js.native
    def FAILURE_STRING_REGEX: String = js.native
    inline def FAILURE_STRING_REGEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_REGEX")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/importBlacklistRule.d.ts", "Rule.IMPLICIT_NAMED_IMPORT_FAILURE_STRING")
    @js.native
    def IMPLICIT_NAMED_IMPORT_FAILURE_STRING: String = js.native
    inline def IMPLICIT_NAMED_IMPORT_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMPLICIT_NAMED_IMPORT_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    inline def MAKE_NAMED_IMPORT_FAILURE_STRING(importName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MAKE_NAMED_IMPORT_FAILURE_STRING")(importName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/importBlacklistRule.d.ts", "Rule.WHOLE_MODULE_FAILURE_STRING")
    @js.native
    def WHOLE_MODULE_FAILURE_STRING: String = js.native
    inline def WHOLE_MODULE_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHOLE_MODULE_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/importBlacklistRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
