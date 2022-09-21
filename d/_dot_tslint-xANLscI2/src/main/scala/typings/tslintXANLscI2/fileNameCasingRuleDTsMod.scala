package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileNameCasingRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/fileNameCasingRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/fileNameCasingRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/fileNameCasingRule.d.ts", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING: Any = js.native
    inline def FAILURE_STRING_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/fileNameCasingRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
    
    inline def showWarning(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showWarning")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport(".tslint-xANLscI2/lib/rules/fileNameCasingRule.d.ts", "Rule.stylizedNameForCasing")
    @js.native
    def stylizedNameForCasing: Any = js.native
    inline def stylizedNameForCasing_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stylizedNameForCasing")(x.asInstanceOf[js.Any])
  }
}
