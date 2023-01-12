package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToken
  extends StObject
     with CstElement {
  
  /** Column of the last character of the Token. 1-indexed. See also startColumn. */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /** Line of the last character of the Token. 1-indexed. Will be the same as startLine for single-line tokens.*/
  var endLine: js.UndefOr[Double] = js.undefined
  
  /**
    * Offset of the last character of the Token. 0-indexed.
    * Note that this points at the last character, not the end of the token, so the original image would be
    * `input.substring(token.startOffset, token.endOffset + 1)`.
    */
  var endOffset: js.UndefOr[Double] = js.undefined
  
  /** The textual representation of the Token as it appeared in the text. */
  var image: String
  
  /** this marks if a Token does not really exist and has been inserted "artificially" during parsing in rule error recovery. */
  var isInsertedInRecovery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom Payload value, this is an optional feature of Custom Token Patterns
    * For additional details see the docs:
    * https://chevrotain.io/docs/guide/custom_token_patterns.html#custom-payloads
    */
  var payload: js.UndefOr[Any] = js.undefined
  
  /**
    * Column of the first character of the Token. 1-indexed.
    *
    * For token foo in the following line, startColumn will be 3 and endColumn will be 5.
    * ```
    * a foo
    * 123456
    * ```
    */
  var startColumn: js.UndefOr[Double] = js.undefined
  
  /** Line of the first character of the Token. 1-indexed. */
  var startLine: js.UndefOr[Double] = js.undefined
  
  /** Offset of the first character of the Token. 0-indexed. */
  var startOffset: Double
  
  /**
    * The actual Token Type of this Token "instance"
    * This is the same Object returned by the "createToken" API.
    * This property is very useful for debugging the Lexing and Parsing phases.
    */
  var tokenType: TokenType
  
  /** An number index representing the type of the Token use <getTokenConstructor> to get the Token Type from a token "instance"  */
  var tokenTypeIdx: Double
}
object IToken {
  
  inline def apply(image: String, startOffset: Double, tokenType: TokenType, tokenTypeIdx: Double): IToken = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any], tokenTypeIdx = tokenTypeIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IToken] (val x: Self) extends AnyVal {
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setIsInsertedInRecovery(value: Boolean): Self = StObject.set(x, "isInsertedInRecovery", value.asInstanceOf[js.Any])
    
    inline def setIsInsertedInRecoveryUndefined: Self = StObject.set(x, "isInsertedInRecovery", js.undefined)
    
    inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setTokenType(value: TokenType): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeIdx(value: Double): Self = StObject.set(x, "tokenTypeIdx", value.asInstanceOf[js.Any])
  }
}
