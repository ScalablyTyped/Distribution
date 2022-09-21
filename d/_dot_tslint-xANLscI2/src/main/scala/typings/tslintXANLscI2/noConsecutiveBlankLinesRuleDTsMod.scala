package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TextRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noConsecutiveBlankLinesRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/noConsecutiveBlankLinesRule.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/noConsecutiveBlankLinesRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/noConsecutiveBlankLinesRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/noConsecutiveBlankLinesRule.d.ts", "Rule.DEFAULT_ALLOWED_BLANKS")
    @js.native
    def DEFAULT_ALLOWED_BLANKS: Double = js.native
    inline def DEFAULT_ALLOWED_BLANKS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALLOWED_BLANKS")(x.asInstanceOf[js.Any])
    
    inline def FAILURE_STRING_FACTORY(allowed: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_FACTORY")(allowed.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/noConsecutiveBlankLinesRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  inline def getTemplateRanges(sourceFile: SourceFile): js.Array[TextRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateRanges")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[js.Array[TextRange]]
}
