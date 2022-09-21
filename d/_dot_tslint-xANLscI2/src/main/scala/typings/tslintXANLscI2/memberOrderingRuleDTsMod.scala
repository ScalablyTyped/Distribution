package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`-1`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`0`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberOrderingRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/memberOrderingRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/memberOrderingRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING_ALPHABETIZE(prevName: String, curName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_ALPHABETIZE")(prevName.asInstanceOf[js.Any], curName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/memberOrderingRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
    
    inline def stringCompare(a: String, b: String): `1` | `-1` | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("stringCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `-1` | `0`]
  }
}
