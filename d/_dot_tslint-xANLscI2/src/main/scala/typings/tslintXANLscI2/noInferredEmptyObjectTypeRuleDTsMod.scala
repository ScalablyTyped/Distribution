package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.TypedRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noInferredEmptyObjectTypeRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/noInferredEmptyObjectTypeRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/noInferredEmptyObjectTypeRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/noInferredEmptyObjectTypeRule.d.ts", "Rule.EMPTY_INTERFACE_FUNCTION")
    @js.native
    def EMPTY_INTERFACE_FUNCTION: String = js.native
    inline def EMPTY_INTERFACE_FUNCTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_INTERFACE_FUNCTION")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/noInferredEmptyObjectTypeRule.d.ts", "Rule.EMPTY_INTERFACE_INSTANCE")
    @js.native
    def EMPTY_INTERFACE_INSTANCE: String = js.native
    inline def EMPTY_INTERFACE_INSTANCE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_INTERFACE_INSTANCE")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/noInferredEmptyObjectTypeRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
