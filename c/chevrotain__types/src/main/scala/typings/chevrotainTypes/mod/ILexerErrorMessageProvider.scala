package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILexerErrorMessageProvider extends StObject {
  
  /**
    * Unable To Pop Lexer Mode Error happens when lexer tries to pop the last remaining mode from the mode stack
    * so that there is no longer any active lexer mode
    * This error only relevant for multi-mode lexers
    *
    * @param token - The Token that requested pop mode.
    */
  def buildUnableToPopLexerModeMessage(token: IToken): String = js.native
  
  /**
    * An Unexpected Character Error occurs when the lexer is unable to match a range of one or more
    * characters in the input text against any of the Token Types in it's Lexer definition
    *
    * @param fullText - Full original input text.
    *
    * @param startOffset - Offset in input text where error starts.
    *
    * @param length - Error length.
    *
    * @param line - Line number where the error occurred. (optional)
    *                    Will not be provided when lexer is not defined to track lines/columns
    *
    * @param column - Column number where the error occurred. (optional)
    *                    Will not be provided when lexer is not defined to track lines/columns
    */
  def buildUnexpectedCharactersMessage(fullText: String, startOffset: Double, length: Double): String = js.native
  def buildUnexpectedCharactersMessage(fullText: String, startOffset: Double, length: Double, line: Double): String = js.native
  def buildUnexpectedCharactersMessage(fullText: String, startOffset: Double, length: Double, line: Double, column: Double): String = js.native
  def buildUnexpectedCharactersMessage(fullText: String, startOffset: Double, length: Double, line: Unit, column: Double): String = js.native
}
