package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentFormatRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/commentFormatRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/commentFormatRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def IGNORE_PATTERN_FAILURE_FACTORY(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("IGNORE_PATTERN_FAILURE_FACTORY")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def IGNORE_WORDS_FAILURE_FACTORY(words: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("IGNORE_WORDS_FAILURE_FACTORY")(words.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/commentFormatRule.d.ts", "Rule.LEADING_SPACE_FAILURE")
    @js.native
    def LEADING_SPACE_FAILURE: String = js.native
    inline def LEADING_SPACE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_SPACE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/commentFormatRule.d.ts", "Rule.LOWERCASE_FAILURE")
    @js.native
    def LOWERCASE_FAILURE: String = js.native
    inline def LOWERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOWERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/commentFormatRule.d.ts", "Rule.SPACE_LOWERCASE_FAILURE")
    @js.native
    def SPACE_LOWERCASE_FAILURE: String = js.native
    inline def SPACE_LOWERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_LOWERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/commentFormatRule.d.ts", "Rule.SPACE_UPPERCASE_FAILURE")
    @js.native
    def SPACE_UPPERCASE_FAILURE: String = js.native
    inline def SPACE_UPPERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_UPPERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/commentFormatRule.d.ts", "Rule.UPPERCASE_FAILURE")
    @js.native
    def UPPERCASE_FAILURE: String = js.native
    inline def UPPERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPPERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/commentFormatRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
