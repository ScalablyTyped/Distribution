package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayTypeRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/arrayTypeRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/arrayTypeRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/arrayTypeRule.d.ts", "Rule.FAILURE_STRING_ARRAY")
    @js.native
    def FAILURE_STRING_ARRAY: String = js.native
    inline def FAILURE_STRING_ARRAY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_ARRAY")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/arrayTypeRule.d.ts", "Rule.FAILURE_STRING_ARRAY_SIMPLE")
    @js.native
    def FAILURE_STRING_ARRAY_SIMPLE: String = js.native
    inline def FAILURE_STRING_ARRAY_SIMPLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_ARRAY_SIMPLE")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/arrayTypeRule.d.ts", "Rule.FAILURE_STRING_GENERIC")
    @js.native
    def FAILURE_STRING_GENERIC: String = js.native
    inline def FAILURE_STRING_GENERIC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_GENERIC")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/arrayTypeRule.d.ts", "Rule.FAILURE_STRING_GENERIC_SIMPLE")
    @js.native
    def FAILURE_STRING_GENERIC_SIMPLE: String = js.native
    inline def FAILURE_STRING_GENERIC_SIMPLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_GENERIC_SIMPLE")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/arrayTypeRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
