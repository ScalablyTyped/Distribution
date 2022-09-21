package typings.chevrotainTypes.mod

import typings.chevrotainTypes.anon.Actual
import typings.chevrotainTypes.anon.CustomUserDescription
import typings.chevrotainTypes.anon.ExpectedIterationPaths
import typings.chevrotainTypes.anon.FirstRedundant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParserErrorMessageProvider extends StObject {
  
  /**
    * An Early Exit Error happens when the parser cannot detect the first mandatory iteration of a repetition.
    * It corresponds to a failed {@link BaseParser.AT_LEAST_ONE_SEP} or {@link BaseParser.AT_LEAST_ONE_SEP} in Chevrotain DSL terms.
    *
    * @param options.expectedIterationPaths - The valid (expected) paths in the first iteration.
    *
    * @param options.actual - The actual sequence of tokens encountered.
    *
    * @param options.previous - The previous Token "instance".
    *                                This is useful if options.actual[0] is of type chevrotain.EOF and you need to know the last token parsed.
    *
    * @param options.customUserDescription - A user may provide custom error message descriptor in the {@link BaseParser.AT_LEAST_ONE_SEP} DSL method
    *                                        options parameter, this is that custom message.
    *
    * @param options.ruleName - The rule in which the error occurred.
    */
  def buildEarlyExitMessage(options: ExpectedIterationPaths): String
  
  /**
    * Mismatched Token Error happens when the parser attempted to consume a terminal and failed.
    * It corresponds to a failed {@link BaseParser.CONSUME} in Chevrotain DSL terms.
    *
    * @param options.expected - The expected Token Type.
    *
    * @param options.actual - The actual Token "instance".
    *
    * @param options.previous - The previous Token "instance".
    *                                This is useful if options.actual[0] is of type chevrotain.EOF and you need to know the last token parsed.
    *
    * @param options.ruleName - The rule in which the error occurred.
    */
  def buildMismatchTokenMessage(options: Actual): String
  
  /**
    * A No Viable Alternative Error happens when the parser cannot detect any valid alternative in an alternation.
    * It corresponds to a failed {@link BaseParser.OR} in Chevrotain DSL terms.
    *
    * @param options.expectedPathsPerAlt - First level of the array represents each alternative
    *                           The next two levels represent valid (expected) paths in each alternative.
    *
    * @param options.actual - The actual sequence of tokens encountered.
    *
    * @param options.previous - The previous Token "instance".
    *                                This is useful if options.actual[0] is of type chevrotain.EOF and you need to know the last token parsed.
    *
    * @param options.customUserDescription - A user may provide custom error message descriptor in the {@link BaseParser.AT_LEAST_ONE_SEP} DSL method
    *                                        options parameter, this is that custom message.
    *
    * @param options.ruleName - The rule in which the error occurred.
    */
  def buildNoViableAltMessage(options: CustomUserDescription): String
  
  /**
    * A Redundant Input Error happens when the parser has completed parsing but there
    * is still unprocessed input remaining.
    *
    * @param options.firstRedundant - The first unprocessed token "instance".
    *
    * @param options.ruleName - The rule in which the error occurred.
    */
  def buildNotAllInputParsedMessage(options: FirstRedundant): String
}
object IParserErrorMessageProvider {
  
  inline def apply(
    buildEarlyExitMessage: ExpectedIterationPaths => String,
    buildMismatchTokenMessage: Actual => String,
    buildNoViableAltMessage: CustomUserDescription => String,
    buildNotAllInputParsedMessage: FirstRedundant => String
  ): IParserErrorMessageProvider = {
    val __obj = js.Dynamic.literal(buildEarlyExitMessage = js.Any.fromFunction1(buildEarlyExitMessage), buildMismatchTokenMessage = js.Any.fromFunction1(buildMismatchTokenMessage), buildNoViableAltMessage = js.Any.fromFunction1(buildNoViableAltMessage), buildNotAllInputParsedMessage = js.Any.fromFunction1(buildNotAllInputParsedMessage))
    __obj.asInstanceOf[IParserErrorMessageProvider]
  }
  
  extension [Self <: IParserErrorMessageProvider](x: Self) {
    
    inline def setBuildEarlyExitMessage(value: ExpectedIterationPaths => String): Self = StObject.set(x, "buildEarlyExitMessage", js.Any.fromFunction1(value))
    
    inline def setBuildMismatchTokenMessage(value: Actual => String): Self = StObject.set(x, "buildMismatchTokenMessage", js.Any.fromFunction1(value))
    
    inline def setBuildNoViableAltMessage(value: CustomUserDescription => String): Self = StObject.set(x, "buildNoViableAltMessage", js.Any.fromFunction1(value))
    
    inline def setBuildNotAllInputParsedMessage(value: FirstRedundant => String): Self = StObject.set(x, "buildNotAllInputParsedMessage", js.Any.fromFunction1(value))
  }
}
