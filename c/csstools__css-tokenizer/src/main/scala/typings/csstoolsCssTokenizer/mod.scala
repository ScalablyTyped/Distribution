package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.anon.Css
import typings.csstoolsCssTokenizer.anon.EndOfFile
import typings.csstoolsCssTokenizer.anon.OnParseError
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenIdent
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@csstools/css-tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/css-tokenizer", "NumberType")
  @js.native
  object NumberType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.csstoolsCssTokenizer.distInterfacesTokenMod.NumberType & String] = js.native
    
    /* "integer" */ val Integer: typings.csstoolsCssTokenizer.distInterfacesTokenMod.NumberType.Integer & String = js.native
    
    /* "number" */ val Number: typings.csstoolsCssTokenizer.distInterfacesTokenMod.NumberType.Number & String = js.native
  }
  
  @JSImport("@csstools/css-tokenizer", "ParseError")
  @js.native
  open class ParseError protected ()
    extends typings.csstoolsCssTokenizer.distInterfacesErrorMod.ParseError {
    def this(message: String, sourceStart: Double, sourceEnd: Double, parserState: js.Array[String]) = this()
  }
  
  @JSImport("@csstools/css-tokenizer", "Reader")
  @js.native
  open class Reader protected ()
    extends typings.csstoolsCssTokenizer.distReaderMod.Reader {
    def this(source: String) = this()
  }
  
  @JSImport("@csstools/css-tokenizer", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType & java.lang.String] = js.native
    
    /* "at-keyword-token" */ val AtKeyword: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.AtKeyword & java.lang.String = js.native
    
    /* "bad-string-token" */ val BadString: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.BadString & java.lang.String = js.native
    
    /* "bad-url-token" */ val BadURL: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.BadURL & java.lang.String = js.native
    
    /* "CDC-token" */ val CDC: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CDC & java.lang.String = js.native
    
    /* "CDO-token" */ val CDO: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CDO & java.lang.String = js.native
    
    /* "}-token" */ val CloseCurly: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CloseCurly & java.lang.String = js.native
    
    /* ")-token" */ val CloseParen: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CloseParen & java.lang.String = js.native
    
    /* "]-token" */ val CloseSquare: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CloseSquare & java.lang.String = js.native
    
    /* "colon-token" */ val Colon: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Colon & java.lang.String = js.native
    
    /* "comma-token" */ val Comma: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Comma & java.lang.String = js.native
    
    /* "comment" */ val Comment: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Comment & java.lang.String = js.native
    
    /* "delim-token" */ val Delim: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Delim & java.lang.String = js.native
    
    /* "dimension-token" */ val Dimension: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Dimension & java.lang.String = js.native
    
    /* "EOF-token" */ val EOF: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.EOF & java.lang.String = js.native
    
    /* "function-token" */ val Function: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Function & java.lang.String = js.native
    
    /* "hash-token" */ val Hash: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Hash & java.lang.String = js.native
    
    /* "ident-token" */ val Ident: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Ident & java.lang.String = js.native
    
    /* "number-token" */ val Number: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Number & java.lang.String = js.native
    
    /* "{-token" */ val OpenCurly: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.OpenCurly & java.lang.String = js.native
    
    /* "(-token" */ val OpenParen: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.OpenParen & java.lang.String = js.native
    
    /* "[-token" */ val OpenSquare: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.OpenSquare & java.lang.String = js.native
    
    /* "percentage-token" */ val Percentage: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Percentage & java.lang.String = js.native
    
    /* "semicolon-token" */ val Semicolon: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Semicolon & java.lang.String = js.native
    
    /* "string-token" */ val String: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.String & java.lang.String = js.native
    
    /* "url-token" */ val URL: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.URL & java.lang.String = js.native
    
    /* "whitespace-token" */ val Whitespace: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Whitespace & java.lang.String = js.native
  }
  
  inline def cloneTokens(tokens: js.Array[CSSToken]): js.Array[CSSToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSToken]]
  
  inline def isToken(x: Any): /* is @csstools/css-tokenizer.@csstools/css-tokenizer/dist/interfaces/token.CSSToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToken")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-tokenizer.@csstools/css-tokenizer/dist/interfaces/token.CSSToken */ Boolean]
  
  inline def mirrorVariant(token: CSSToken): CSSToken | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("mirrorVariant")(token.asInstanceOf[js.Any]).asInstanceOf[CSSToken | Null]
  
  inline def mirrorVariantType(`type`: TokenType): TokenType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("mirrorVariantType")(`type`.asInstanceOf[js.Any]).asInstanceOf[TokenType | Null]
  
  inline def mutateIdent(ident: TokenIdent, newValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mutateIdent")(ident.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stringify(tokens: CSSToken*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(tokens.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def tokenize(input: Css): js.Array[CSSToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSToken]]
  inline def tokenize(input: Css, options: OnParseError): js.Array[CSSToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[CSSToken]]
  
  inline def tokenizer(input: Css): EndOfFile = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any]).asInstanceOf[EndOfFile]
  inline def tokenizer(input: Css, options: OnParseError): EndOfFile = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndOfFile]
}
