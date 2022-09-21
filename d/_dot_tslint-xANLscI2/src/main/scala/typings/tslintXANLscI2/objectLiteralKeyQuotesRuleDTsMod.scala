package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectLiteralKeyQuotesRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/objectLiteralKeyQuotesRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/objectLiteralKeyQuotesRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/objectLiteralKeyQuotesRule.d.ts", "Rule.INCONSISTENT_PROPERTY")
    @js.native
    def INCONSISTENT_PROPERTY: String = js.native
    inline def INCONSISTENT_PROPERTY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INCONSISTENT_PROPERTY")(x.asInstanceOf[js.Any])
    
    inline def UNNEEDED_QUOTES(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNNEEDED_QUOTES")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def UNQUOTED_PROPERTY(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNQUOTED_PROPERTY")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/objectLiteralKeyQuotesRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
