package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noUnnecessaryClassRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/noUnnecessaryClassRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/noUnnecessaryClassRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/noUnnecessaryClassRule.d.ts", "Rule.FAILURE_CONSTRUCTOR_ONLY")
    @js.native
    def FAILURE_CONSTRUCTOR_ONLY: String = js.native
    inline def FAILURE_CONSTRUCTOR_ONLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_CONSTRUCTOR_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/noUnnecessaryClassRule.d.ts", "Rule.FAILURE_EMPTY_CLASS")
    @js.native
    def FAILURE_EMPTY_CLASS: String = js.native
    inline def FAILURE_EMPTY_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_EMPTY_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/noUnnecessaryClassRule.d.ts", "Rule.FAILURE_STATIC_ONLY")
    @js.native
    def FAILURE_STATIC_ONLY: String = js.native
    inline def FAILURE_STATIC_ONLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STATIC_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/noUnnecessaryClassRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
