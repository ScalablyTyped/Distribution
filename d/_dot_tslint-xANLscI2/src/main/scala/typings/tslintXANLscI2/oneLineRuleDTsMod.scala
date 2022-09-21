package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oneLineRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/oneLineRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/oneLineRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/oneLineRule.d.ts", "Rule.WHITESPACE_FAILURE_STRING")
    @js.native
    def WHITESPACE_FAILURE_STRING: String = js.native
    inline def WHITESPACE_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITESPACE_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/oneLineRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
