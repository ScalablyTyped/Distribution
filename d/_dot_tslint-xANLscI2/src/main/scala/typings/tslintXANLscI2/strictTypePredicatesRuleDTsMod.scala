package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.TypedRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import typings.tslintXANLscI2.tslintXANLscI2Strings.`null`
import typings.tslintXANLscI2.tslintXANLscI2Strings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictTypePredicatesRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/strictTypePredicatesRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/strictTypePredicatesRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRICT_PREFER_STRICT_EQUALS(value: `null` | undefined, isPositive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRICT_PREFER_STRICT_EQUALS")(value.asInstanceOf[js.Any], isPositive.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def FAILURE_STRING(value: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/strictTypePredicatesRule.d.ts", "Rule.FAILURE_STRING_BAD_TYPEOF")
    @js.native
    def FAILURE_STRING_BAD_TYPEOF: String = js.native
    inline def FAILURE_STRING_BAD_TYPEOF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_BAD_TYPEOF")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/strictTypePredicatesRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
