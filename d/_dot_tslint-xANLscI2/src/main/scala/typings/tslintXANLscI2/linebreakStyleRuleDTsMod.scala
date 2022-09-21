package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linebreakStyleRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/linebreakStyleRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/linebreakStyleRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/linebreakStyleRule.d.ts", "Rule.FAILURE_CRLF")
    @js.native
    def FAILURE_CRLF: String = js.native
    inline def FAILURE_CRLF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_CRLF")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/linebreakStyleRule.d.ts", "Rule.FAILURE_LF")
    @js.native
    def FAILURE_LF: String = js.native
    inline def FAILURE_LF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_LF")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/linebreakStyleRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
