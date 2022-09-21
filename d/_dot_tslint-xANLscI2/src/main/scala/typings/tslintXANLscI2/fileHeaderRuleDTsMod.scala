package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileHeaderRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/fileHeaderRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    /* private */ var createComment: Any = js.native
    
    /* private */ var doesNewLineEndingViolationExist: Any = js.native
    
    /* private */ var generateLineEnding: Any = js.native
    
    /* private */ var getFileHeaderText: Any = js.native
    
    /* private */ var getRuleOptions: Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/fileHeaderRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/fileHeaderRule.d.ts", "Rule.MISSING_HEADER_FAILURE_STRING")
    @js.native
    def MISSING_HEADER_FAILURE_STRING: String = js.native
    inline def MISSING_HEADER_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_HEADER_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/fileHeaderRule.d.ts", "Rule.MISSING_NEW_LINE_FAILURE_STRING")
    @js.native
    def MISSING_NEW_LINE_FAILURE_STRING: String = js.native
    inline def MISSING_NEW_LINE_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_NEW_LINE_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/fileHeaderRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
