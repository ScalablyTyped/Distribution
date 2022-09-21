package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@chevrotain/types", "Lexer")
@js.native
open class Lexer protected () extends StObject {
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
  
  var lexerDefinitionErrors: js.Array[ILexerDefinitionError] = js.native
  
  /**
    * Will lex(Tokenize) a string.
    * Note that this can be called repeatedly on different strings as this method
    * does not modify the state of the Lexer.
    *
    * @param text - The string to lex
    * @param [initialMode] - The initial Lexer Mode to start with, by default this will be the first mode in the lexer's
    *                                 definition. If the lexer has no explicit modes it will be the implicit single 'default_mode' mode.
    */
  def tokenize(text: String): ILexingResult = js.native
  def tokenize(text: String, initialMode: String): ILexingResult = js.native
}
/* static members */
object Lexer {
  
  @JSImport("@chevrotain/types", "Lexer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A Constant to mark "abstract" TokenTypes that are used
    * purely as token categories.
    * See: {@link ITokenConfig.categories}
    */
  @JSImport("@chevrotain/types", "Lexer.NA")
  @js.native
  def NA: js.RegExp = js.native
  inline def NA_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NA")(x.asInstanceOf[js.Any])
  
  @JSImport("@chevrotain/types", "Lexer.SKIPPED")
  @js.native
  def SKIPPED: String = js.native
  inline def SKIPPED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIPPED")(x.asInstanceOf[js.Any])
}
