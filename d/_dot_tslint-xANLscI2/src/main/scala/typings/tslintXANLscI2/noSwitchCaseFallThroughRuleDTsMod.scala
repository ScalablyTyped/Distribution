package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.AbstractWalker
import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noSwitchCaseFallThroughRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/noSwitchCaseFallThroughRule.d.ts", "NoSwitchCaseFallThroughWalker")
  @js.native
  open class NoSwitchCaseFallThroughWalker protected () extends AbstractWalker[Unit] {
    def this(sourceFile: SourceFile, ruleName: String, options: Unit) = this()
    
    /* private */ var isFallThroughAllowed: Any = js.native
    
    /* private */ var visitSwitchStatement: Any = js.native
  }
  
  @JSImport(".tslint-xANLscI2/lib/rules/noSwitchCaseFallThroughRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/noSwitchCaseFallThroughRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING(keyword: SyntaxKind): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(keyword.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/noSwitchCaseFallThroughRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
