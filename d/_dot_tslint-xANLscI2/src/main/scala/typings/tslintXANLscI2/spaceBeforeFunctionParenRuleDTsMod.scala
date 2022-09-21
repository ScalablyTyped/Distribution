package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceBeforeFunctionParenRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/spaceBeforeFunctionParenRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/spaceBeforeFunctionParenRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/spaceBeforeFunctionParenRule.d.ts", "Rule.INVALID_WHITESPACE_ERROR")
    @js.native
    def INVALID_WHITESPACE_ERROR: String = js.native
    inline def INVALID_WHITESPACE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_WHITESPACE_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/spaceBeforeFunctionParenRule.d.ts", "Rule.MISSING_WHITESPACE_ERROR")
    @js.native
    def MISSING_WHITESPACE_ERROR: String = js.native
    inline def MISSING_WHITESPACE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_WHITESPACE_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/spaceBeforeFunctionParenRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
