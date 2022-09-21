package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cyclomaticComplexityRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/cyclomaticComplexityRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    /* private */ def threshold: Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/cyclomaticComplexityRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/cyclomaticComplexityRule.d.ts", "Rule.DEFAULT_THRESHOLD")
    @js.native
    def DEFAULT_THRESHOLD: Double = js.native
    inline def DEFAULT_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_THRESHOLD")(x.asInstanceOf[js.Any])
    
    inline def FAILURE_STRING(expected: Double, actual: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def FAILURE_STRING(expected: Double, actual: Double, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/cyclomaticComplexityRule.d.ts", "Rule.MINIMUM_THRESHOLD")
    @js.native
    def MINIMUM_THRESHOLD: Double = js.native
    inline def MINIMUM_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINIMUM_THRESHOLD")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/cyclomaticComplexityRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
