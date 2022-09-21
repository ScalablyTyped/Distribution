package typings.cucumberGherkin.parserMod

import typings.cucumberMessages.mod.GherkinDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parser[AstNode] extends StObject {
  
  /* private */ var addError: Any
  
  /* private */ var build: Any
  
  /* private */ val builder: Any
  
  /* private */ var context: Any
  
  /* private */ var endRule: Any
  
  /* private */ var getResult: Any
  
  /* private */ var handleAstError: Any
  
  /* private */ var handleExternalError: Any
  
  /* private */ var lookahead_0: Any
  
  /* private */ var lookahead_1: Any
  
  /* private */ var matchToken: Any
  
  /* private */ var matchTokenAt_0: Any
  
  /* private */ var matchTokenAt_1: Any
  
  /* private */ var matchTokenAt_10: Any
  
  /* private */ var matchTokenAt_11: Any
  
  /* private */ var matchTokenAt_12: Any
  
  /* private */ var matchTokenAt_13: Any
  
  /* private */ var matchTokenAt_14: Any
  
  /* private */ var matchTokenAt_15: Any
  
  /* private */ var matchTokenAt_16: Any
  
  /* private */ var matchTokenAt_17: Any
  
  /* private */ var matchTokenAt_18: Any
  
  /* private */ var matchTokenAt_19: Any
  
  /* private */ var matchTokenAt_2: Any
  
  /* private */ var matchTokenAt_20: Any
  
  /* private */ var matchTokenAt_21: Any
  
  /* private */ var matchTokenAt_22: Any
  
  /* private */ var matchTokenAt_23: Any
  
  /* private */ var matchTokenAt_24: Any
  
  /* private */ var matchTokenAt_25: Any
  
  /* private */ var matchTokenAt_26: Any
  
  /* private */ var matchTokenAt_27: Any
  
  /* private */ var matchTokenAt_28: Any
  
  /* private */ var matchTokenAt_29: Any
  
  /* private */ var matchTokenAt_3: Any
  
  /* private */ var matchTokenAt_30: Any
  
  /* private */ var matchTokenAt_31: Any
  
  /* private */ var matchTokenAt_32: Any
  
  /* private */ var matchTokenAt_33: Any
  
  /* private */ var matchTokenAt_34: Any
  
  /* private */ var matchTokenAt_35: Any
  
  /* private */ var matchTokenAt_36: Any
  
  /* private */ var matchTokenAt_37: Any
  
  /* private */ var matchTokenAt_38: Any
  
  /* private */ var matchTokenAt_39: Any
  
  /* private */ var matchTokenAt_4: Any
  
  /* private */ var matchTokenAt_40: Any
  
  /* private */ var matchTokenAt_41: Any
  
  /* private */ var matchTokenAt_43: Any
  
  /* private */ var matchTokenAt_44: Any
  
  /* private */ var matchTokenAt_45: Any
  
  /* private */ var matchTokenAt_46: Any
  
  /* private */ var matchTokenAt_47: Any
  
  /* private */ var matchTokenAt_48: Any
  
  /* private */ var matchTokenAt_49: Any
  
  /* private */ var matchTokenAt_5: Any
  
  /* private */ var matchTokenAt_50: Any
  
  /* private */ var matchTokenAt_6: Any
  
  /* private */ var matchTokenAt_7: Any
  
  /* private */ var matchTokenAt_8: Any
  
  /* private */ var matchTokenAt_9: Any
  
  /* private */ var match_BackgroundLine: Any
  
  /* private */ var match_Comment: Any
  
  /* private */ var match_DocStringSeparator: Any
  
  /* private */ var match_EOF: Any
  
  /* private */ var match_Empty: Any
  
  /* private */ var match_ExamplesLine: Any
  
  /* private */ var match_FeatureLine: Any
  
  /* private */ var match_Language: Any
  
  /* private */ var match_Other: Any
  
  /* private */ var match_RuleLine: Any
  
  /* private */ var match_ScenarioLine: Any
  
  /* private */ var match_StepLine: Any
  
  /* private */ var match_TableRow: Any
  
  /* private */ var match_TagLine: Any
  
  def parse(gherkinSource: String): GherkinDocument
  
  /* private */ var readToken: Any
  
  /* private */ var startRule: Any
  
  var stopAtFirstError: Boolean
  
  /* private */ val tokenMatcher: Any
}
object Parser {
  
  inline def apply[AstNode](
    addError: Any,
    build: Any,
    builder: Any,
    context: Any,
    endRule: Any,
    getResult: Any,
    handleAstError: Any,
    handleExternalError: Any,
    lookahead_0: Any,
    lookahead_1: Any,
    matchToken: Any,
    matchTokenAt_0: Any,
    matchTokenAt_1: Any,
    matchTokenAt_10: Any,
    matchTokenAt_11: Any,
    matchTokenAt_12: Any,
    matchTokenAt_13: Any,
    matchTokenAt_14: Any,
    matchTokenAt_15: Any,
    matchTokenAt_16: Any,
    matchTokenAt_17: Any,
    matchTokenAt_18: Any,
    matchTokenAt_19: Any,
    matchTokenAt_2: Any,
    matchTokenAt_20: Any,
    matchTokenAt_21: Any,
    matchTokenAt_22: Any,
    matchTokenAt_23: Any,
    matchTokenAt_24: Any,
    matchTokenAt_25: Any,
    matchTokenAt_26: Any,
    matchTokenAt_27: Any,
    matchTokenAt_28: Any,
    matchTokenAt_29: Any,
    matchTokenAt_3: Any,
    matchTokenAt_30: Any,
    matchTokenAt_31: Any,
    matchTokenAt_32: Any,
    matchTokenAt_33: Any,
    matchTokenAt_34: Any,
    matchTokenAt_35: Any,
    matchTokenAt_36: Any,
    matchTokenAt_37: Any,
    matchTokenAt_38: Any,
    matchTokenAt_39: Any,
    matchTokenAt_4: Any,
    matchTokenAt_40: Any,
    matchTokenAt_41: Any,
    matchTokenAt_43: Any,
    matchTokenAt_44: Any,
    matchTokenAt_45: Any,
    matchTokenAt_46: Any,
    matchTokenAt_47: Any,
    matchTokenAt_48: Any,
    matchTokenAt_49: Any,
    matchTokenAt_5: Any,
    matchTokenAt_50: Any,
    matchTokenAt_6: Any,
    matchTokenAt_7: Any,
    matchTokenAt_8: Any,
    matchTokenAt_9: Any,
    match_BackgroundLine: Any,
    match_Comment: Any,
    match_DocStringSeparator: Any,
    match_EOF: Any,
    match_Empty: Any,
    match_ExamplesLine: Any,
    match_FeatureLine: Any,
    match_Language: Any,
    match_Other: Any,
    match_RuleLine: Any,
    match_ScenarioLine: Any,
    match_StepLine: Any,
    match_TableRow: Any,
    match_TagLine: Any,
    parse: String => GherkinDocument,
    readToken: Any,
    startRule: Any,
    stopAtFirstError: Boolean,
    tokenMatcher: Any
  ): Parser[AstNode] = {
    val __obj = js.Dynamic.literal(addError = addError.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], builder = builder.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], endRule = endRule.asInstanceOf[js.Any], getResult = getResult.asInstanceOf[js.Any], handleAstError = handleAstError.asInstanceOf[js.Any], handleExternalError = handleExternalError.asInstanceOf[js.Any], lookahead_0 = lookahead_0.asInstanceOf[js.Any], lookahead_1 = lookahead_1.asInstanceOf[js.Any], matchToken = matchToken.asInstanceOf[js.Any], matchTokenAt_0 = matchTokenAt_0.asInstanceOf[js.Any], matchTokenAt_1 = matchTokenAt_1.asInstanceOf[js.Any], matchTokenAt_10 = matchTokenAt_10.asInstanceOf[js.Any], matchTokenAt_11 = matchTokenAt_11.asInstanceOf[js.Any], matchTokenAt_12 = matchTokenAt_12.asInstanceOf[js.Any], matchTokenAt_13 = matchTokenAt_13.asInstanceOf[js.Any], matchTokenAt_14 = matchTokenAt_14.asInstanceOf[js.Any], matchTokenAt_15 = matchTokenAt_15.asInstanceOf[js.Any], matchTokenAt_16 = matchTokenAt_16.asInstanceOf[js.Any], matchTokenAt_17 = matchTokenAt_17.asInstanceOf[js.Any], matchTokenAt_18 = matchTokenAt_18.asInstanceOf[js.Any], matchTokenAt_19 = matchTokenAt_19.asInstanceOf[js.Any], matchTokenAt_2 = matchTokenAt_2.asInstanceOf[js.Any], matchTokenAt_20 = matchTokenAt_20.asInstanceOf[js.Any], matchTokenAt_21 = matchTokenAt_21.asInstanceOf[js.Any], matchTokenAt_22 = matchTokenAt_22.asInstanceOf[js.Any], matchTokenAt_23 = matchTokenAt_23.asInstanceOf[js.Any], matchTokenAt_24 = matchTokenAt_24.asInstanceOf[js.Any], matchTokenAt_25 = matchTokenAt_25.asInstanceOf[js.Any], matchTokenAt_26 = matchTokenAt_26.asInstanceOf[js.Any], matchTokenAt_27 = matchTokenAt_27.asInstanceOf[js.Any], matchTokenAt_28 = matchTokenAt_28.asInstanceOf[js.Any], matchTokenAt_29 = matchTokenAt_29.asInstanceOf[js.Any], matchTokenAt_3 = matchTokenAt_3.asInstanceOf[js.Any], matchTokenAt_30 = matchTokenAt_30.asInstanceOf[js.Any], matchTokenAt_31 = matchTokenAt_31.asInstanceOf[js.Any], matchTokenAt_32 = matchTokenAt_32.asInstanceOf[js.Any], matchTokenAt_33 = matchTokenAt_33.asInstanceOf[js.Any], matchTokenAt_34 = matchTokenAt_34.asInstanceOf[js.Any], matchTokenAt_35 = matchTokenAt_35.asInstanceOf[js.Any], matchTokenAt_36 = matchTokenAt_36.asInstanceOf[js.Any], matchTokenAt_37 = matchTokenAt_37.asInstanceOf[js.Any], matchTokenAt_38 = matchTokenAt_38.asInstanceOf[js.Any], matchTokenAt_39 = matchTokenAt_39.asInstanceOf[js.Any], matchTokenAt_4 = matchTokenAt_4.asInstanceOf[js.Any], matchTokenAt_40 = matchTokenAt_40.asInstanceOf[js.Any], matchTokenAt_41 = matchTokenAt_41.asInstanceOf[js.Any], matchTokenAt_43 = matchTokenAt_43.asInstanceOf[js.Any], matchTokenAt_44 = matchTokenAt_44.asInstanceOf[js.Any], matchTokenAt_45 = matchTokenAt_45.asInstanceOf[js.Any], matchTokenAt_46 = matchTokenAt_46.asInstanceOf[js.Any], matchTokenAt_47 = matchTokenAt_47.asInstanceOf[js.Any], matchTokenAt_48 = matchTokenAt_48.asInstanceOf[js.Any], matchTokenAt_49 = matchTokenAt_49.asInstanceOf[js.Any], matchTokenAt_5 = matchTokenAt_5.asInstanceOf[js.Any], matchTokenAt_50 = matchTokenAt_50.asInstanceOf[js.Any], matchTokenAt_6 = matchTokenAt_6.asInstanceOf[js.Any], matchTokenAt_7 = matchTokenAt_7.asInstanceOf[js.Any], matchTokenAt_8 = matchTokenAt_8.asInstanceOf[js.Any], matchTokenAt_9 = matchTokenAt_9.asInstanceOf[js.Any], match_BackgroundLine = match_BackgroundLine.asInstanceOf[js.Any], match_Comment = match_Comment.asInstanceOf[js.Any], match_DocStringSeparator = match_DocStringSeparator.asInstanceOf[js.Any], match_EOF = match_EOF.asInstanceOf[js.Any], match_Empty = match_Empty.asInstanceOf[js.Any], match_ExamplesLine = match_ExamplesLine.asInstanceOf[js.Any], match_FeatureLine = match_FeatureLine.asInstanceOf[js.Any], match_Language = match_Language.asInstanceOf[js.Any], match_Other = match_Other.asInstanceOf[js.Any], match_RuleLine = match_RuleLine.asInstanceOf[js.Any], match_ScenarioLine = match_ScenarioLine.asInstanceOf[js.Any], match_StepLine = match_StepLine.asInstanceOf[js.Any], match_TableRow = match_TableRow.asInstanceOf[js.Any], match_TagLine = match_TagLine.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), readToken = readToken.asInstanceOf[js.Any], startRule = startRule.asInstanceOf[js.Any], stopAtFirstError = stopAtFirstError.asInstanceOf[js.Any], tokenMatcher = tokenMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parser[AstNode]]
  }
  
  extension [Self <: Parser[?], AstNode](x: Self & Parser[AstNode]) {
    
    inline def setAddError(value: Any): Self = StObject.set(x, "addError", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: Any): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuilder(value: Any): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setEndRule(value: Any): Self = StObject.set(x, "endRule", value.asInstanceOf[js.Any])
    
    inline def setGetResult(value: Any): Self = StObject.set(x, "getResult", value.asInstanceOf[js.Any])
    
    inline def setHandleAstError(value: Any): Self = StObject.set(x, "handleAstError", value.asInstanceOf[js.Any])
    
    inline def setHandleExternalError(value: Any): Self = StObject.set(x, "handleExternalError", value.asInstanceOf[js.Any])
    
    inline def setLookahead_0(value: Any): Self = StObject.set(x, "lookahead_0", value.asInstanceOf[js.Any])
    
    inline def setLookahead_1(value: Any): Self = StObject.set(x, "lookahead_1", value.asInstanceOf[js.Any])
    
    inline def setMatchToken(value: Any): Self = StObject.set(x, "matchToken", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_0(value: Any): Self = StObject.set(x, "matchTokenAt_0", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_1(value: Any): Self = StObject.set(x, "matchTokenAt_1", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_10(value: Any): Self = StObject.set(x, "matchTokenAt_10", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_11(value: Any): Self = StObject.set(x, "matchTokenAt_11", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_12(value: Any): Self = StObject.set(x, "matchTokenAt_12", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_13(value: Any): Self = StObject.set(x, "matchTokenAt_13", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_14(value: Any): Self = StObject.set(x, "matchTokenAt_14", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_15(value: Any): Self = StObject.set(x, "matchTokenAt_15", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_16(value: Any): Self = StObject.set(x, "matchTokenAt_16", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_17(value: Any): Self = StObject.set(x, "matchTokenAt_17", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_18(value: Any): Self = StObject.set(x, "matchTokenAt_18", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_19(value: Any): Self = StObject.set(x, "matchTokenAt_19", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_2(value: Any): Self = StObject.set(x, "matchTokenAt_2", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_20(value: Any): Self = StObject.set(x, "matchTokenAt_20", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_21(value: Any): Self = StObject.set(x, "matchTokenAt_21", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_22(value: Any): Self = StObject.set(x, "matchTokenAt_22", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_23(value: Any): Self = StObject.set(x, "matchTokenAt_23", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_24(value: Any): Self = StObject.set(x, "matchTokenAt_24", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_25(value: Any): Self = StObject.set(x, "matchTokenAt_25", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_26(value: Any): Self = StObject.set(x, "matchTokenAt_26", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_27(value: Any): Self = StObject.set(x, "matchTokenAt_27", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_28(value: Any): Self = StObject.set(x, "matchTokenAt_28", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_29(value: Any): Self = StObject.set(x, "matchTokenAt_29", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_3(value: Any): Self = StObject.set(x, "matchTokenAt_3", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_30(value: Any): Self = StObject.set(x, "matchTokenAt_30", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_31(value: Any): Self = StObject.set(x, "matchTokenAt_31", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_32(value: Any): Self = StObject.set(x, "matchTokenAt_32", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_33(value: Any): Self = StObject.set(x, "matchTokenAt_33", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_34(value: Any): Self = StObject.set(x, "matchTokenAt_34", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_35(value: Any): Self = StObject.set(x, "matchTokenAt_35", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_36(value: Any): Self = StObject.set(x, "matchTokenAt_36", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_37(value: Any): Self = StObject.set(x, "matchTokenAt_37", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_38(value: Any): Self = StObject.set(x, "matchTokenAt_38", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_39(value: Any): Self = StObject.set(x, "matchTokenAt_39", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_4(value: Any): Self = StObject.set(x, "matchTokenAt_4", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_40(value: Any): Self = StObject.set(x, "matchTokenAt_40", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_41(value: Any): Self = StObject.set(x, "matchTokenAt_41", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_43(value: Any): Self = StObject.set(x, "matchTokenAt_43", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_44(value: Any): Self = StObject.set(x, "matchTokenAt_44", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_45(value: Any): Self = StObject.set(x, "matchTokenAt_45", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_46(value: Any): Self = StObject.set(x, "matchTokenAt_46", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_47(value: Any): Self = StObject.set(x, "matchTokenAt_47", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_48(value: Any): Self = StObject.set(x, "matchTokenAt_48", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_49(value: Any): Self = StObject.set(x, "matchTokenAt_49", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_5(value: Any): Self = StObject.set(x, "matchTokenAt_5", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_50(value: Any): Self = StObject.set(x, "matchTokenAt_50", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_6(value: Any): Self = StObject.set(x, "matchTokenAt_6", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_7(value: Any): Self = StObject.set(x, "matchTokenAt_7", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_8(value: Any): Self = StObject.set(x, "matchTokenAt_8", value.asInstanceOf[js.Any])
    
    inline def setMatchTokenAt_9(value: Any): Self = StObject.set(x, "matchTokenAt_9", value.asInstanceOf[js.Any])
    
    inline def setMatch_BackgroundLine(value: Any): Self = StObject.set(x, "match_BackgroundLine", value.asInstanceOf[js.Any])
    
    inline def setMatch_Comment(value: Any): Self = StObject.set(x, "match_Comment", value.asInstanceOf[js.Any])
    
    inline def setMatch_DocStringSeparator(value: Any): Self = StObject.set(x, "match_DocStringSeparator", value.asInstanceOf[js.Any])
    
    inline def setMatch_EOF(value: Any): Self = StObject.set(x, "match_EOF", value.asInstanceOf[js.Any])
    
    inline def setMatch_Empty(value: Any): Self = StObject.set(x, "match_Empty", value.asInstanceOf[js.Any])
    
    inline def setMatch_ExamplesLine(value: Any): Self = StObject.set(x, "match_ExamplesLine", value.asInstanceOf[js.Any])
    
    inline def setMatch_FeatureLine(value: Any): Self = StObject.set(x, "match_FeatureLine", value.asInstanceOf[js.Any])
    
    inline def setMatch_Language(value: Any): Self = StObject.set(x, "match_Language", value.asInstanceOf[js.Any])
    
    inline def setMatch_Other(value: Any): Self = StObject.set(x, "match_Other", value.asInstanceOf[js.Any])
    
    inline def setMatch_RuleLine(value: Any): Self = StObject.set(x, "match_RuleLine", value.asInstanceOf[js.Any])
    
    inline def setMatch_ScenarioLine(value: Any): Self = StObject.set(x, "match_ScenarioLine", value.asInstanceOf[js.Any])
    
    inline def setMatch_StepLine(value: Any): Self = StObject.set(x, "match_StepLine", value.asInstanceOf[js.Any])
    
    inline def setMatch_TableRow(value: Any): Self = StObject.set(x, "match_TableRow", value.asInstanceOf[js.Any])
    
    inline def setMatch_TagLine(value: Any): Self = StObject.set(x, "match_TagLine", value.asInstanceOf[js.Any])
    
    inline def setParse(value: String => GherkinDocument): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setReadToken(value: Any): Self = StObject.set(x, "readToken", value.asInstanceOf[js.Any])
    
    inline def setStartRule(value: Any): Self = StObject.set(x, "startRule", value.asInstanceOf[js.Any])
    
    inline def setStopAtFirstError(value: Boolean): Self = StObject.set(x, "stopAtFirstError", value.asInstanceOf[js.Any])
    
    inline def setTokenMatcher(value: Any): Self = StObject.set(x, "tokenMatcher", value.asInstanceOf[js.Any])
  }
}
