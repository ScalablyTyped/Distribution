package typings.blueprintjsIcons

import typings.blueprintjsIcons.blueprintjsIconsStrings.DollarLeftcurlybracketDelimiterRightcurlybracketDollarLeftcurlybracketLowercaseLessthansignStringPartGreaterthansignRightcurlybracket
import typings.blueprintjsIcons.sourceUtilitiesMod.UpperCaseCharacters
import typings.blueprintjsIcons.sourceUtilitiesMod.WordSeparators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delimiterCaseMod {
  
  type DelimiterCase[Value, Delimiter /* <: String */] = Value | (StringArrayToDelimiterCase[
    SplitIncludingDelimiters[Value, WordSeparators | UpperCaseCharacters], 
    WordSeparators, 
    UpperCaseCharacters, 
    Delimiter
  ])
  
  type SplitIncludingDelimiters[Source /* <: String */, Delimiter /* <: String */] = js.Array[Any | Source]
  
  /**
  Takes the result of a splitted string literal and recursively concatenates it together into the desired casing.
  It receives `UsedWordSeparators` and `UsedUpperCaseCharacters` as input to ensure it's fully encapsulated.
  @see SplitIncludingDelimiters
  */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsIcons.blueprintjsIconsStrings._empty
    - typings.blueprintjsIcons.blueprintjsIconsStrings.`DollarLeftcurlybracketStringPartToDelimiterCaseLessthansignFirstPartComma UsedWordSeparatorsComma UsedUpperCaseCharactersComma DelimiterGreaterthansignRightcurlybracketDollarLeftcurlybracketStringArrayToDelimiterCaseLessthansignRemainingPartsComma UsedWordSeparatorsComma UsedUpperCaseCharactersComma DelimiterGreaterthansignRightcurlybracket`
  */
  trait StringArrayToDelimiterCase[Parts /* <: js.Array[Any] */, UsedWordSeparators /* <: String */, UsedUpperCaseCharacters /* <: String */, Delimiter /* <: String */] extends StObject
  
  /**
  Format a specific part of the splitted string literal that `StringArrayToDelimiterCase<>` fuses together, ensuring desired casing.
  @see StringArrayToDelimiterCase
  */
  type StringPartToDelimiterCase[StringPart /* <: String */, UsedWordSeparators /* <: String */, UsedUpperCaseCharacters /* <: String */, Delimiter /* <: String */] = StringPart | DollarLeftcurlybracketDelimiterRightcurlybracketDollarLeftcurlybracketLowercaseLessthansignStringPartGreaterthansignRightcurlybracket | Delimiter
}
