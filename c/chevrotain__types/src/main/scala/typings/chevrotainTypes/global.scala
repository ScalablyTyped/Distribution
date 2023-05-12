package typings.chevrotainTypes

import typings.chevrotainTypes.anon.Definition
import typings.chevrotainTypes.anon.DefinitionIdx
import typings.chevrotainTypes.anon.Idx
import typings.chevrotainTypes.anon.IgnoreAmbiguities
import typings.chevrotainTypes.anon.Label
import typings.chevrotainTypes.anon.MaxLookahead
import typings.chevrotainTypes.anon.Name
import typings.chevrotainTypes.anon.Separator
import typings.chevrotainTypes.mod.GenerateDtsOptions
import typings.chevrotainTypes.mod.ICreateSyntaxDiagramsConfig
import typings.chevrotainTypes.mod.ILLkLookaheadStrategyConstructor
import typings.chevrotainTypes.mod.ILexerConfig
import typings.chevrotainTypes.mod.ILexerErrorMessageProvider
import typings.chevrotainTypes.mod.IMultiModeLexerDefinition
import typings.chevrotainTypes.mod.IParserErrorMessageProvider
import typings.chevrotainTypes.mod.IProduction
import typings.chevrotainTypes.mod.ISerializedGast
import typings.chevrotainTypes.mod.IToken
import typings.chevrotainTypes.mod.ITokenConfig
import typings.chevrotainTypes.mod.LookaheadSequence
import typings.chevrotainTypes.mod.TokenType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object chevrotain {
    
    @JSGlobal("chevrotain")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chevrotain.Alternation")
    @js.native
    open class Alternation protected ()
      extends typings.chevrotainTypes.mod.Alternation {
      def this(options: DefinitionIdx) = this()
    }
    
    @JSGlobal("chevrotain.Alternative")
    @js.native
    open class Alternative protected ()
      extends typings.chevrotainTypes.mod.Alternative {
      def this(options: IgnoreAmbiguities) = this()
    }
    
    @JSGlobal("chevrotain.CstParser")
    @js.native
    open class CstParser ()
      extends typings.chevrotainTypes.mod.CstParser
    
    inline def EMPTY_ALT(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("EMPTY_ALT")().asInstanceOf[js.Function0[Unit]]
    inline def EMPTY_ALT[T](value: T): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("EMPTY_ALT")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]
    
    @JSGlobal("chevrotain.EOF")
    @js.native
    val EOF: TokenType = js.native
    
    @JSGlobal("chevrotain.EarlyExitException")
    @js.native
    open class EarlyExitException protected ()
      extends typings.chevrotainTypes.mod.EarlyExitException {
      def this(message: String, token: IToken, previousToken: IToken) = this()
    }
    
    @JSGlobal("chevrotain.EmbeddedActionsParser")
    @js.native
    open class EmbeddedActionsParser ()
      extends typings.chevrotainTypes.mod.EmbeddedActionsParser
    
    /* note: abstract class */ @JSGlobal("chevrotain.GAstVisitor")
    @js.native
    open class GAstVisitor ()
      extends typings.chevrotainTypes.mod.GAstVisitor
    
    @JSGlobal("chevrotain.LLkLookaheadStrategy")
    @js.native
    val LLkLookaheadStrategy: ILLkLookaheadStrategyConstructor = js.native
    
    @JSGlobal("chevrotain.Lexer")
    @js.native
    open class Lexer protected ()
      extends typings.chevrotainTypes.mod.Lexer {
      /**
        * @param lexerDefinition -
        *  Structure composed of Tokens Types this lexer will identify.
        *
        *  In the simple case the structure is an array of TokenTypes.
        *  In the case of {@link IMultiModeLexerDefinition} the structure is an object with two properties:
        *    1. a "modes" property where each value is an array of TokenTypes.
        *    2. a "defaultMode" property specifying the initial lexer mode.
        *
        *  for example:
        *
        *  ```
        *    {
        *        modes : {
        *          modeX : [Token1, Token2],
        *          modeY : [Token3, Token4]
        *        },
        *
        *        defaultMode : "modeY"
        *    }
        *  ```
        *
        *  A lexer with {@link MultiModesDefinition} is simply multiple Lexers where only one Lexer(mode) can be active at the same time.
        *  This is useful for lexing languages where there are different lexing rules depending on context.
        *
        *  The current lexing mode is selected via a "mode stack".
        *  The last (peek) value in the stack will be the current mode of the lexer.
        *  Defining entering and exiting lexer modes is done using the "push_mode" and "pop_mode" properties
        *  of the {@link ITokenConfig} config properties.
        *
        *  - The Lexer will match the **first** pattern that matches, Therefor the order of Token Types is significant.
        *    For example when one pattern may match a prefix of another pattern.
        *
        *    Note that there are situations in which we may wish to order the longer pattern after the shorter one.
        *    For example: [keywords vs Identifiers](https://github.com/chevrotain/chevrotain/tree/master/examples/lexer/keywords_vs_identifiers).
        */
      def this(lexerDefinition: js.Array[TokenType]) = this()
      def this(lexerDefinition: IMultiModeLexerDefinition) = this()
      def this(lexerDefinition: js.Array[TokenType], config: ILexerConfig) = this()
      def this(lexerDefinition: IMultiModeLexerDefinition, config: ILexerConfig) = this()
    }
    /* static members */
    object Lexer {
      
      @JSGlobal("chevrotain.Lexer")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * A Constant to mark "abstract" TokenTypes that are used
        * purely as token categories.
        * See: {@link ITokenConfig.categories}
        */
      @JSGlobal("chevrotain.Lexer.NA")
      @js.native
      def NA: js.RegExp = js.native
      inline def NA_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NA")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chevrotain.Lexer.SKIPPED")
      @js.native
      def SKIPPED: String = js.native
      inline def SKIPPED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIPPED")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("chevrotain.LexerDefinitionErrorType")
    @js.native
    object LexerDefinitionErrorType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.chevrotainTypes.mod.LexerDefinitionErrorType & Double] = js.native
      
      /* 16 */ val CUSTOM_LINE_BREAK: typings.chevrotainTypes.mod.LexerDefinitionErrorType.CUSTOM_LINE_BREAK & Double = js.native
      
      /* 4 */ val DUPLICATE_PATTERNS_FOUND: typings.chevrotainTypes.mod.LexerDefinitionErrorType.DUPLICATE_PATTERNS_FOUND & Double = js.native
      
      /* 12 */ val EMPTY_MATCH_PATTERN: typings.chevrotainTypes.mod.LexerDefinitionErrorType.EMPTY_MATCH_PATTERN & Double = js.native
      
      /* 2 */ val EOI_ANCHOR_FOUND: typings.chevrotainTypes.mod.LexerDefinitionErrorType.EOI_ANCHOR_FOUND & Double = js.native
      
      /* 15 */ val IDENTIFY_TERMINATOR: typings.chevrotainTypes.mod.LexerDefinitionErrorType.IDENTIFY_TERMINATOR & Double = js.native
      
      /* 5 */ val INVALID_GROUP_TYPE_FOUND: typings.chevrotainTypes.mod.LexerDefinitionErrorType.INVALID_GROUP_TYPE_FOUND & Double = js.native
      
      /* 1 */ val INVALID_PATTERN: typings.chevrotainTypes.mod.LexerDefinitionErrorType.INVALID_PATTERN & Double = js.native
      
      /* 10 */ val LEXER_DEFINITION_CANNOT_CONTAIN_UNDEFINED: typings.chevrotainTypes.mod.LexerDefinitionErrorType.LEXER_DEFINITION_CANNOT_CONTAIN_UNDEFINED & Double = js.native
      
      /* 0 */ val MISSING_PATTERN: typings.chevrotainTypes.mod.LexerDefinitionErrorType.MISSING_PATTERN & Double = js.native
      
      /* 9 */ val MULTI_MODE_LEXER_DEFAULT_MODE_VALUE_DOES_NOT_EXIST: typings.chevrotainTypes.mod.LexerDefinitionErrorType.MULTI_MODE_LEXER_DEFAULT_MODE_VALUE_DOES_NOT_EXIST & Double = js.native
      
      /* 17 */ val MULTI_MODE_LEXER_LONGER_ALT_NOT_IN_CURRENT_MODE: typings.chevrotainTypes.mod.LexerDefinitionErrorType.MULTI_MODE_LEXER_LONGER_ALT_NOT_IN_CURRENT_MODE & Double = js.native
      
      /* 7 */ val MULTI_MODE_LEXER_WITHOUT_DEFAULT_MODE: typings.chevrotainTypes.mod.LexerDefinitionErrorType.MULTI_MODE_LEXER_WITHOUT_DEFAULT_MODE & Double = js.native
      
      /* 8 */ val MULTI_MODE_LEXER_WITHOUT_MODES_PROPERTY: typings.chevrotainTypes.mod.LexerDefinitionErrorType.MULTI_MODE_LEXER_WITHOUT_MODES_PROPERTY & Double = js.native
      
      /* 13 */ val NO_LINE_BREAKS_FLAGS: typings.chevrotainTypes.mod.LexerDefinitionErrorType.NO_LINE_BREAKS_FLAGS & Double = js.native
      
      /* 6 */ val PUSH_MODE_DOES_NOT_EXIST: typings.chevrotainTypes.mod.LexerDefinitionErrorType.PUSH_MODE_DOES_NOT_EXIST & Double = js.native
      
      /* 11 */ val SOI_ANCHOR_FOUND: typings.chevrotainTypes.mod.LexerDefinitionErrorType.SOI_ANCHOR_FOUND & Double = js.native
      
      /* 14 */ val UNREACHABLE_PATTERN: typings.chevrotainTypes.mod.LexerDefinitionErrorType.UNREACHABLE_PATTERN & Double = js.native
      
      /* 3 */ val UNSUPPORTED_FLAGS_FOUND: typings.chevrotainTypes.mod.LexerDefinitionErrorType.UNSUPPORTED_FLAGS_FOUND & Double = js.native
    }
    
    @JSGlobal("chevrotain.MismatchedTokenException")
    @js.native
    open class MismatchedTokenException protected ()
      extends typings.chevrotainTypes.mod.MismatchedTokenException {
      def this(message: String, token: IToken, previousToken: IToken) = this()
    }
    
    @JSGlobal("chevrotain.NoViableAltException")
    @js.native
    open class NoViableAltException protected ()
      extends typings.chevrotainTypes.mod.NoViableAltException {
      def this(message: String, token: IToken, previousToken: IToken) = this()
    }
    
    @JSGlobal("chevrotain.NonTerminal")
    @js.native
    open class NonTerminal protected ()
      extends typings.chevrotainTypes.mod.NonTerminal {
      def this(options: Idx) = this()
    }
    
    @JSGlobal("chevrotain.NotAllInputParsedException")
    @js.native
    open class NotAllInputParsedException protected ()
      extends typings.chevrotainTypes.mod.NotAllInputParsedException {
      def this(message: String, token: IToken) = this()
    }
    
    @JSGlobal("chevrotain.Option")
    @js.native
    open class Option protected ()
      extends typings.chevrotainTypes.mod.Option {
      def this(options: Name) = this()
    }
    
    @JSGlobal("chevrotain.Repetition")
    @js.native
    open class Repetition protected ()
      extends typings.chevrotainTypes.mod.Repetition {
      def this(options: Name) = this()
    }
    
    @JSGlobal("chevrotain.RepetitionMandatory")
    @js.native
    open class RepetitionMandatory protected ()
      extends typings.chevrotainTypes.mod.RepetitionMandatory {
      def this(options: Name) = this()
    }
    
    @JSGlobal("chevrotain.RepetitionMandatoryWithSeparator")
    @js.native
    open class RepetitionMandatoryWithSeparator protected ()
      extends typings.chevrotainTypes.mod.RepetitionMandatoryWithSeparator {
      def this(options: Separator) = this()
    }
    
    @JSGlobal("chevrotain.RepetitionWithSeparator")
    @js.native
    open class RepetitionWithSeparator protected ()
      extends typings.chevrotainTypes.mod.RepetitionWithSeparator {
      def this(options: Separator) = this()
    }
    
    @JSGlobal("chevrotain.Rule")
    @js.native
    open class Rule protected ()
      extends typings.chevrotainTypes.mod.Rule {
      def this(options: Definition) = this()
    }
    
    @JSGlobal("chevrotain.Terminal")
    @js.native
    open class Terminal protected ()
      extends typings.chevrotainTypes.mod.Terminal {
      def this(options: Label) = this()
    }
    
    @JSGlobal("chevrotain.VERSION")
    @js.native
    val VERSION: String = js.native
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    inline def createSyntaxDiagramsCode(grammar: js.Array[ISerializedGast]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createSyntaxDiagramsCode")(grammar.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def createSyntaxDiagramsCode(grammar: js.Array[ISerializedGast], config: ICreateSyntaxDiagramsConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createSyntaxDiagramsCode")(grammar.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def createToken(config: ITokenConfig): TokenType = ^.asInstanceOf[js.Dynamic].applyDynamic("createToken")(config.asInstanceOf[js.Any]).asInstanceOf[TokenType]
    
    inline def createTokenInstance(
      tokType: TokenType,
      image: String,
      startOffset: Double,
      endOffset: Double,
      startLine: Double,
      endLine: Double,
      startColumn: Double,
      endColumn: Double
    ): IToken = (^.asInstanceOf[js.Dynamic].applyDynamic("createTokenInstance")(tokType.asInstanceOf[js.Any], image.asInstanceOf[js.Any], startOffset.asInstanceOf[js.Any], endOffset.asInstanceOf[js.Any], startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startColumn.asInstanceOf[js.Any], endColumn.asInstanceOf[js.Any])).asInstanceOf[IToken]
    
    @JSGlobal("chevrotain.defaultLexerErrorProvider")
    @js.native
    val defaultLexerErrorProvider: ILexerErrorMessageProvider = js.native
    
    @JSGlobal("chevrotain.defaultParserErrorProvider")
    @js.native
    val defaultParserErrorProvider: IParserErrorMessageProvider = js.native
    
    inline def generateCstDts(productions: Record[String, typings.chevrotainTypes.mod.Rule]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCstDts")(productions.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def generateCstDts(productions: Record[String, typings.chevrotainTypes.mod.Rule], options: GenerateDtsOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCstDts")(productions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getLookaheadPaths(options: MaxLookahead): js.Array[LookaheadSequence] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLookaheadPaths")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[LookaheadSequence]]
    
    inline def isRecognitionException(error: js.Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRecognitionException")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def serializeGrammar(topRules: js.Array[typings.chevrotainTypes.mod.Rule]): js.Array[ISerializedGast] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeGrammar")(topRules.asInstanceOf[js.Any]).asInstanceOf[js.Array[ISerializedGast]]
    
    inline def serializeProduction(node: IProduction): ISerializedGast = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeProduction")(node.asInstanceOf[js.Any]).asInstanceOf[ISerializedGast]
    
    inline def tokenLabel(tokType: TokenType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenLabel")(tokType.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def tokenMatcher(token: IToken, tokType: TokenType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenMatcher")(token.asInstanceOf[js.Any], tokType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def tokenName(tokType: TokenType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenName")(tokType.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
