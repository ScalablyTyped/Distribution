package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noMergeableNamespaceRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/noMergeableNamespaceRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/noMergeableNamespaceRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def failureStringFactory(name: String, seenBeforeLine: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("failureStringFactory")(name.asInstanceOf[js.Any], seenBeforeLine.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/noMergeableNamespaceRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
