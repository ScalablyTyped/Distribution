package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.anon.Type
import typings.csstoolsCssTokenizer.anon.TypeNumberType
import typings.csstoolsCssTokenizer.anon.TypeValue
import typings.csstoolsCssTokenizer.anon.Value
import typings.csstoolsCssTokenizer.anon.ValueNumber
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.AtKeyword
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.BadString
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.BadURL
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CDC
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CDO
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CloseCurly
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CloseParen
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CloseSquare
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Colon
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Comma
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Comment
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Delim
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Dimension
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.EOF
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Function
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Hash
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Ident
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Number
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.OpenCurly
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.OpenParen
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.OpenSquare
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Percentage
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Semicolon
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.URL
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Whitespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesTokenMod {
  
  @JSImport("@csstools/css-tokenizer/dist/interfaces/token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait HashType extends StObject
  @JSImport("@csstools/css-tokenizer/dist/interfaces/token", "HashType")
  @js.native
  object HashType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HashType & String] = js.native
    
    @js.native
    sealed trait ID
      extends StObject
         with HashType
    /* "id" */ val ID: typings.csstoolsCssTokenizer.distInterfacesTokenMod.HashType.ID & String = js.native
    
    @js.native
    sealed trait Unrestricted
      extends StObject
         with HashType
    /* "unrestricted" */ val Unrestricted: typings.csstoolsCssTokenizer.distInterfacesTokenMod.HashType.Unrestricted & String = js.native
  }
  
  @js.native
  sealed trait NumberType extends StObject
  @JSImport("@csstools/css-tokenizer/dist/interfaces/token", "NumberType")
  @js.native
  object NumberType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NumberType & String] = js.native
    
    @js.native
    sealed trait Integer
      extends StObject
         with NumberType
    /* "integer" */ val Integer: typings.csstoolsCssTokenizer.distInterfacesTokenMod.NumberType.Integer & String = js.native
    
    @js.native
    sealed trait Number
      extends StObject
         with NumberType
    /* "number" */ val Number: typings.csstoolsCssTokenizer.distInterfacesTokenMod.NumberType.Number & String = js.native
  }
  
  @js.native
  sealed trait TokenType extends StObject
  @JSImport("@csstools/css-tokenizer/dist/interfaces/token", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[TokenType & java.lang.String] = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-at-keyword-token */
    @js.native
    sealed trait AtKeyword
      extends StObject
         with TokenType
    /* "at-keyword-token" */ val AtKeyword: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.AtKeyword & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-bad-string-token */
    @js.native
    sealed trait BadString
      extends StObject
         with TokenType
    /* "bad-string-token" */ val BadString: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.BadString & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-bad-url-token */
    @js.native
    sealed trait BadURL
      extends StObject
         with TokenType
    /* "bad-url-token" */ val BadURL: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.BadURL & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-cdc-token */
    @js.native
    sealed trait CDC
      extends StObject
         with TokenType
    /* "CDC-token" */ val CDC: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CDC & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-cdo-token */
    @js.native
    sealed trait CDO
      extends StObject
         with TokenType
    /* "CDO-token" */ val CDO: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CDO & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#tokendef-close-curly */
    @js.native
    sealed trait CloseCurly
      extends StObject
         with TokenType
    /* "}-token" */ val CloseCurly: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CloseCurly & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#tokendef-close-paren */
    @js.native
    sealed trait CloseParen
      extends StObject
         with TokenType
    /* ")-token" */ val CloseParen: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CloseParen & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#tokendef-close-square */
    @js.native
    sealed trait CloseSquare
      extends StObject
         with TokenType
    /* "]-token" */ val CloseSquare: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.CloseSquare & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-colon-token */
    @js.native
    sealed trait Colon
      extends StObject
         with TokenType
    /* "colon-token" */ val Colon: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Colon & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-comma-token */
    @js.native
    sealed trait Comma
      extends StObject
         with TokenType
    /* "comma-token" */ val Comma: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Comma & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#comment-diagram */
    @js.native
    sealed trait Comment
      extends StObject
         with TokenType
    /* "comment" */ val Comment: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Comment & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-delim-token */
    @js.native
    sealed trait Delim
      extends StObject
         with TokenType
    /* "delim-token" */ val Delim: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Delim & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-dimension-token */
    @js.native
    sealed trait Dimension
      extends StObject
         with TokenType
    /* "dimension-token" */ val Dimension: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Dimension & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-eof-token */
    @js.native
    sealed trait EOF
      extends StObject
         with TokenType
    /* "EOF-token" */ val EOF: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.EOF & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-function-token */
    @js.native
    sealed trait Function
      extends StObject
         with TokenType
    /* "function-token" */ val Function: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Function & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-hash-token */
    @js.native
    sealed trait Hash
      extends StObject
         with TokenType
    /* "hash-token" */ val Hash: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Hash & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-ident-token */
    @js.native
    sealed trait Ident
      extends StObject
         with TokenType
    /* "ident-token" */ val Ident: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Ident & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-percentage-token */
    @js.native
    sealed trait Number
      extends StObject
         with TokenType
    /* "number-token" */ val Number: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Number & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#tokendef-open-curly */
    @js.native
    sealed trait OpenCurly
      extends StObject
         with TokenType
    /* "{-token" */ val OpenCurly: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.OpenCurly & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#tokendef-open-paren */
    @js.native
    sealed trait OpenParen
      extends StObject
         with TokenType
    /* "(-token" */ val OpenParen: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.OpenParen & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#tokendef-open-square */
    @js.native
    sealed trait OpenSquare
      extends StObject
         with TokenType
    /* "[-token" */ val OpenSquare: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.OpenSquare & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-percentage-token */
    @js.native
    sealed trait Percentage
      extends StObject
         with TokenType
    /* "percentage-token" */ val Percentage: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Percentage & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-semicolon-token */
    @js.native
    sealed trait Semicolon
      extends StObject
         with TokenType
    /* "semicolon-token" */ val Semicolon: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Semicolon & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-string-token */
    @js.native
    sealed trait String
      extends StObject
         with TokenType
    /* "string-token" */ val String: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.String & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-url-token */
    @js.native
    sealed trait URL
      extends StObject
         with TokenType
    /* "url-token" */ val URL: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.URL & java.lang.String = js.native
    
    /** https://www.w3.org/TR/2021/CRD-css-syntax-3-20211224/#typedef-whitespace-token */
    @js.native
    sealed trait Whitespace
      extends StObject
         with TokenType
    /* "whitespace-token" */ val Whitespace: typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.Whitespace & java.lang.String = js.native
  }
  
  inline def isToken(x: Any): /* is @csstools/css-tokenizer.@csstools/css-tokenizer/dist/interfaces/token.CSSToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToken")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-tokenizer.@csstools/css-tokenizer/dist/interfaces/token.CSSToken */ Boolean]
  
  inline def mirrorVariant(token: CSSToken): CSSToken | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("mirrorVariant")(token.asInstanceOf[js.Any]).asInstanceOf[CSSToken | Null]
  
  inline def mirrorVariantType(`type`: TokenType): TokenType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("mirrorVariantType")(`type`.asInstanceOf[js.Any]).asInstanceOf[TokenType | Null]
  
  type CSSToken = TokenAtKeyword | TokenBadString | TokenBadURL | TokenCDC | TokenCDO | TokenColon | TokenComma | TokenComment | TokenDelim | TokenDimension | TokenEOF | TokenFunction | TokenHash | TokenIdent | TokenNumber | TokenPercentage | TokenSemicolon | TokenString | TokenURL | TokenWhitespace | TokenOpenParen | TokenCloseParen | TokenOpenSquare | TokenCloseSquare | TokenOpenCurly | TokenCloseCurly
  
  type Token[T /* <: TokenType */, U] = js.Tuple5[
    /** The type of token */
  T, 
    /** The token representation */
  String, 
    /** Start position of representation */
  Double, 
    /** End position of representation */
  Double, 
    /** Extra data */
  U
  ]
  
  type TokenAtKeyword = Token[AtKeyword, Value]
  
  type TokenBadString = Token[BadString, Unit]
  
  type TokenBadURL = Token[BadURL, Unit]
  
  type TokenCDC = Token[CDC, Unit]
  
  type TokenCDO = Token[CDO, Unit]
  
  type TokenCloseCurly = Token[CloseCurly, Unit]
  
  type TokenCloseParen = Token[CloseParen, Unit]
  
  type TokenCloseSquare = Token[CloseSquare, Unit]
  
  type TokenColon = Token[Colon, Unit]
  
  type TokenComma = Token[Comma, Unit]
  
  type TokenComment = Token[Comment, Unit]
  
  type TokenDelim = Token[Delim, Value]
  
  type TokenDimension = Token[Dimension, Type]
  
  type TokenEOF = Token[EOF, Unit]
  
  type TokenFunction = Token[Function, Value]
  
  type TokenHash = Token[Hash, TypeValue]
  
  type TokenIdent = Token[Ident, Value]
  
  type TokenNumber = Token[Number, TypeNumberType]
  
  type TokenOpenCurly = Token[OpenCurly, Unit]
  
  type TokenOpenParen = Token[OpenParen, Unit]
  
  type TokenOpenSquare = Token[OpenSquare, Unit]
  
  type TokenPercentage = Token[Percentage, ValueNumber]
  
  type TokenSemicolon = Token[Semicolon, Unit]
  
  type TokenString = Token[typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenType.String, Value]
  
  type TokenURL = Token[URL, Value]
  
  type TokenWhitespace = Token[Whitespace, Unit]
}
