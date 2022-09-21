package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chevrotainTypes.anon.Payload
import typings.chevrotainTypes.mod.^
import typings.std.Record
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EMPTY_ALT(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("EMPTY_ALT")().asInstanceOf[js.Function0[Unit]]
inline def EMPTY_ALT[T](value: T): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("EMPTY_ALT")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]

inline def EOF: TokenType = ^.asInstanceOf[js.Dynamic].selectDynamic("EOF").asInstanceOf[TokenType]

inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

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

inline def defaultLexerErrorProvider: ILexerErrorMessageProvider = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultLexerErrorProvider").asInstanceOf[ILexerErrorMessageProvider]

inline def defaultParserErrorProvider: IParserErrorMessageProvider = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultParserErrorProvider").asInstanceOf[IParserErrorMessageProvider]

inline def generateCstDts(productions: Record[String, Rule]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCstDts")(productions.asInstanceOf[js.Any]).asInstanceOf[String]
inline def generateCstDts(productions: Record[String, Rule], options: GenerateDtsOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCstDts")(productions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def isRecognitionException(error: js.Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRecognitionException")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def serializeGrammar(topRules: js.Array[Rule]): js.Array[ISerializedGast] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeGrammar")(topRules.asInstanceOf[js.Any]).asInstanceOf[js.Array[ISerializedGast]]

inline def serializeProduction(node: IProduction): ISerializedGast = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeProduction")(node.asInstanceOf[js.Any]).asInstanceOf[ISerializedGast]

inline def tokenLabel(tokType: TokenType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenLabel")(tokType.asInstanceOf[js.Any]).asInstanceOf[String]

inline def tokenMatcher(token: IToken, tokType: TokenType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenMatcher")(token.asInstanceOf[js.Any], tokType.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def tokenName(tokType: TokenType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenName")(tokType.asInstanceOf[js.Any]).asInstanceOf[String]

type CstChildrenDictionary = StringDictionary[js.Array[CstElement]]

type CustomPatternMatcherFunc = js.Function4[
/* text */ String, 
/* offset */ Double, 
/* tokens */ js.Array[IToken], 
/* groups */ StringDictionary[js.Array[IToken]], 
CustomPatternMatcherReturn | RegExpExecArray | Null]

type CustomPatternMatcherReturn = js.Array[String] & Payload

type GrammarAction[OUT] = js.Function0[OUT]

type IOrAltWithGate[T] = IOrAlt[T]

type MultiModesDefinition = StringDictionary[js.Array[TokenType]]

type ParserMethod[ARGS /* <: js.Array[Any] */, R] = js.Function1[/* args */ ARGS, R]

type TokenPattern = js.RegExp | String | CustomPatternMatcherFunc | ICustomPattern

type TokenTypeDictionary = StringDictionary[TokenType]

type TokenVocabulary = TokenTypeDictionary | js.Array[TokenType] | IMultiModeLexerDefinition
