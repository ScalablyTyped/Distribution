package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.TypedRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awaitPromiseRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/awaitPromiseRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/awaitPromiseRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/awaitPromiseRule.d.ts", "Rule.FAILURE_FOR_AWAIT_OF")
    @js.native
    def FAILURE_FOR_AWAIT_OF: String = js.native
    inline def FAILURE_FOR_AWAIT_OF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_FOR_AWAIT_OF")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/awaitPromiseRule.d.ts", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING: String = js.native
    inline def FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/awaitPromiseRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
