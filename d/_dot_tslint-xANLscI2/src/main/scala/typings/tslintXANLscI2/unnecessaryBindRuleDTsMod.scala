package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.OptionallyTypedRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unnecessaryBindRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/unnecessaryBindRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends OptionallyTypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/unnecessaryBindRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/unnecessaryBindRule.d.ts", "Rule.FAILURE_STRING_ARROW")
    @js.native
    def FAILURE_STRING_ARROW: String = js.native
    inline def FAILURE_STRING_ARROW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_ARROW")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/unnecessaryBindRule.d.ts", "Rule.FAILURE_STRING_FUNCTION")
    @js.native
    def FAILURE_STRING_FUNCTION: String = js.native
    inline def FAILURE_STRING_FUNCTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_FUNCTION")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/unnecessaryBindRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
