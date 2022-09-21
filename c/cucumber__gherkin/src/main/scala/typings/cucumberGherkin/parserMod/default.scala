package typings.cucumberGherkin.parserMod

import typings.cucumberGherkin.iastbuilderMod.IAstBuilder
import typings.cucumberGherkin.itokenmatcherMod.ITokenMatcher
import typings.cucumberMessages.mod.GherkinDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cucumber/gherkin/dist/src/Parser", JSImport.Default)
@js.native
open class default[AstNode] protected ()
  extends StObject
     with Parser[AstNode] {
  def this(builder: IAstBuilder[AstNode, TokenType, RuleType], tokenMatcher: ITokenMatcher[TokenType]) = this()
  
  /* private */ /* CompleteClass */
  var addError: Any = js.native
  
  /* private */ /* CompleteClass */
  var build: Any = js.native
  
  /* private */ /* CompleteClass */
  override val builder: Any = js.native
  
  /* private */ /* CompleteClass */
  var context: Any = js.native
  
  /* private */ /* CompleteClass */
  var endRule: Any = js.native
  
  /* private */ /* CompleteClass */
  var getResult: Any = js.native
  
  /* private */ /* CompleteClass */
  var handleAstError: Any = js.native
  
  /* private */ /* CompleteClass */
  var handleExternalError: Any = js.native
  
  /* private */ /* CompleteClass */
  var lookahead_0: Any = js.native
  
  /* private */ /* CompleteClass */
  var lookahead_1: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchToken: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_0: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_1: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_10: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_11: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_12: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_13: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_14: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_15: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_16: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_17: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_18: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_19: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_2: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_20: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_21: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_22: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_23: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_24: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_25: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_26: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_27: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_28: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_29: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_3: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_30: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_31: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_32: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_33: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_34: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_35: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_36: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_37: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_38: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_39: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_4: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_40: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_41: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_43: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_44: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_45: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_46: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_47: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_48: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_49: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_5: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_50: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_6: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_7: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_8: Any = js.native
  
  /* private */ /* CompleteClass */
  var matchTokenAt_9: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_BackgroundLine: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_Comment: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_DocStringSeparator: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_EOF: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_Empty: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_ExamplesLine: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_FeatureLine: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_Language: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_Other: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_RuleLine: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_ScenarioLine: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_StepLine: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_TableRow: Any = js.native
  
  /* private */ /* CompleteClass */
  var match_TagLine: Any = js.native
  
  /* CompleteClass */
  override def parse(gherkinSource: String): GherkinDocument = js.native
  
  /* private */ /* CompleteClass */
  var readToken: Any = js.native
  
  /* private */ /* CompleteClass */
  var startRule: Any = js.native
  
  /* CompleteClass */
  var stopAtFirstError: Boolean = js.native
  
  /* private */ /* CompleteClass */
  override val tokenMatcher: Any = js.native
}
