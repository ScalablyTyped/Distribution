package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.TypedRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecationRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/deprecationRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/deprecationRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING(name: String, message: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(name.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/deprecationRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
