package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITokenConfig extends StObject {
  
  /**
    * Categories enable polymorphism on Token Types.
    * A TokenType X with categories C1, C2, ... ,Cn can
    * be matched by the parser against any of those categories.
    * In practical terms this means that:
    * CONSUME(C1) can match a Token of type X.
    */
  var categories: js.UndefOr[TokenType | js.Array[TokenType]] = js.undefined
  
  /**
    * The group property will cause the lexer to collect
    * Tokens of this type separately from the other Tokens.
    *
    * For example this could be used to collect comments for
    * post processing.
    *
    * See: https://github.com/chevrotain/chevrotain/tree/master/examples/lexer/token_groups
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * The Label is a human readable name to be used
    * in error messages and syntax diagrams.
    *
    * For example a TokenType may be called LCurly, which is
    * short for "left curly brace". The much easier to understand
    * label could simply be "\{".
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Can a String matching this Token Type's pattern possibly contain a line terminator?
    * If true and the line_breaks property is not also true this will cause inaccuracies in the Lexer's line / column tracking.
    */
  var line_breaks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The "longer_alt" property will cause the Lexer to attempt matching against other Token Types
    * every time this Token Type has been matched.
    *
    * This feature can be useful when two or more Token Types have common prefixes which
    * cannot be resolved (only) by the ordering of the Tokens in the lexer definition.
    *
    * - Note that the `longer_alt` capability **cannot be chained**.
    * - Note that the **first** matched `longer_alt` takes precendence.
    *
    * For example see: https://github.com/chevrotain/chevrotain/tree/master/examples/lexer/keywords_vs_identifiers
    * For resolving the keywords vs Identifier ambiguity.
    */
  var longer_alt: js.UndefOr[TokenType | js.Array[TokenType]] = js.undefined
  
  var name: String
  
  /**
    * This defines what sequence of characters would be matched
    * To this TokenType when Lexing.
    *
    * For Custom Patterns see: http://chevrotain.io/docs/guide/custom_token_patterns.html
    */
  var pattern: js.UndefOr[TokenPattern] = js.undefined
  
  /**
    * If "pop_mode" is true the Lexer will pop the last mode of the modes stack and
    * continue lexing using the new mode at the top of the stack.
    *
    * See: https://github.com/chevrotain/chevrotain/tree/master/examples/lexer/multi_mode_lexer
    */
  var pop_mode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A name of a Lexer mode to "enter" once this Token Type has been matched.
    * Lexer modes can be used to support different sets of possible Tokens Types
    *
    * Lexer Modes work as a stack of Lexers, so "entering" a mode means pushing it to the top of the stack.
    *
    * See: https://github.com/chevrotain/chevrotain/tree/master/examples/lexer/multi_mode_lexer
    */
  var push_mode: js.UndefOr[String] = js.undefined
  
  /**
    * Possible starting characters or charCodes of the pattern.
    * These will be used to optimize the Lexer's performance.
    *
    * These are normally **automatically** computed, however the option to explicitly
    * specify those can enable optimizations even when the automatic analysis fails.
    *
    * e.g:
    *   * strings hints should be one character long.
    *    ```
    *      { start_chars_hint: ["a", "b"] }
    *    ```
    *
    *   * number hints are the result of running ".charCodeAt(0)" on the strings.
    *    ```
    *      { start_chars_hint: [97, 98] }
    *    ```
    *
    *   * For unicode characters outside the BMP use the first of their surrogate pairs.
    *     for example: The '💩' character is represented by surrogate pairs: '\\uD83D\\uDCA9'
    *       and D83D is 55357 in decimal.
    *    * Note that "💩".charCodeAt(0) === 55357
    */
  var start_chars_hint: js.UndefOr[js.Array[String | Double]] = js.undefined
}
object ITokenConfig {
  
  inline def apply(name: String): ITokenConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITokenConfig] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: TokenType | js.Array[TokenType]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: TokenType*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine_breaks(value: Boolean): Self = StObject.set(x, "line_breaks", value.asInstanceOf[js.Any])
    
    inline def setLine_breaksUndefined: Self = StObject.set(x, "line_breaks", js.undefined)
    
    inline def setLonger_alt(value: TokenType | js.Array[TokenType]): Self = StObject.set(x, "longer_alt", value.asInstanceOf[js.Any])
    
    inline def setLonger_altUndefined: Self = StObject.set(x, "longer_alt", js.undefined)
    
    inline def setLonger_altVarargs(value: TokenType*): Self = StObject.set(x, "longer_alt", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: TokenPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternFunction4(
      value: (/* text */ String, /* offset */ Double, /* tokens */ js.Array[IToken], /* groups */ StringDictionary[js.Array[IToken]]) => CustomPatternMatcherReturn | RegExpExecArray | Null
    ): Self = StObject.set(x, "pattern", js.Any.fromFunction4(value))
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPop_mode(value: Boolean): Self = StObject.set(x, "pop_mode", value.asInstanceOf[js.Any])
    
    inline def setPop_modeUndefined: Self = StObject.set(x, "pop_mode", js.undefined)
    
    inline def setPush_mode(value: String): Self = StObject.set(x, "push_mode", value.asInstanceOf[js.Any])
    
    inline def setPush_modeUndefined: Self = StObject.set(x, "push_mode", js.undefined)
    
    inline def setStart_chars_hint(value: js.Array[String | Double]): Self = StObject.set(x, "start_chars_hint", value.asInstanceOf[js.Any])
    
    inline def setStart_chars_hintUndefined: Self = StObject.set(x, "start_chars_hint", js.undefined)
    
    inline def setStart_chars_hintVarargs(value: (String | Double)*): Self = StObject.set(x, "start_chars_hint", js.Array(value*))
  }
}
