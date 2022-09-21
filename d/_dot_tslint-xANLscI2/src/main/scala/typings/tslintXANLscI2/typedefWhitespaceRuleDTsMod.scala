package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import typings.tslintXANLscI2.tslintXANLscI2Strings.after
import typings.tslintXANLscI2.tslintXANLscI2Strings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedefWhitespaceRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/typedefWhitespaceRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/typedefWhitespaceRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING(option: String, location: before | after, `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(option.asInstanceOf[js.Any], location.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/typedefWhitespaceRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
