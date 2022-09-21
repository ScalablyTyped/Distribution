package typings.tslintXANLscI2

import typings.std.Set
import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noMagicNumbersRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/noMagicNumbersRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/noMagicNumbersRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/noMagicNumbersRule.d.ts", "Rule.ALLOWED_NODES")
    @js.native
    def ALLOWED_NODES: Set[SyntaxKind] = js.native
    inline def ALLOWED_NODES_=(x: Set[SyntaxKind]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALLOWED_NODES")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/noMagicNumbersRule.d.ts", "Rule.DEFAULT_ALLOWED")
    @js.native
    def DEFAULT_ALLOWED: js.Array[Double] = js.native
    inline def DEFAULT_ALLOWED_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALLOWED")(x.asInstanceOf[js.Any])
    
    inline def FAILURE_STRING(num: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/noMagicNumbersRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
