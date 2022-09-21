package typings.blueprintjsIcons

import typings.blueprintjsIcons.blueprintjsIconsStrings.`DollarLeftcurlybracketFirstPartRightcurlybracketDollarLeftcurlybracketInnerCamelCaseStringArrayLessthansignRemainingPartsComma FirstPartGreaterthansignRightcurlybracket`
import typings.blueprintjsIcons.sourceUtilitiesMod.WordSeparators
import typings.blueprintjsIcons.utilitiesMod.Split
import typings.std.Lowercase
import typings.std.Uncapitalize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camelCaseMod {
  
  type CamelCase[K] = K | (CamelCaseStringArray[Split[K | Lowercase[K], WordSeparators]])
  
  /**
  Starts fusing the output of `Split<>`, an array literal of strings, into a camel-cased string literal.
  It's separate from `InnerCamelCaseStringArray<>` to keep a clean API outwards to the rest of the code.
  @see Split
  */
  type CamelCaseStringArray[Parts /* <: js.Array[String] */] = Uncapitalize[
    `DollarLeftcurlybracketFirstPartRightcurlybracketDollarLeftcurlybracketInnerCamelCaseStringArrayLessthansignRemainingPartsComma FirstPartGreaterthansignRightcurlybracket`
  ]
  
  /**
  Step by step takes the first item in an array literal, formats it and adds it to a string literal, and then recursively appends the remainder.
  Only to be used by `CamelCaseStringArray<>`.
  @see CamelCaseStringArray
  */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsIcons.blueprintjsIconsStrings._empty
    - typings.blueprintjsIcons.blueprintjsIconsStrings.`DollarLeftcurlybracketPreviousPart extends QuotationmarkQuotationmark Questionmark FirstPart Colon CapitalizeLessthansignFirstPartGreaterthansignRightcurlybracketDollarLeftcurlybracketInnerCamelCaseStringArrayLessthansignRemainingPartsComma FirstPartGreaterthansignRightcurlybracket`
  */
  trait InnerCamelCaseStringArray[Parts /* <: js.Array[Any] */, PreviousPart] extends StObject
}
