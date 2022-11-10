package typings.blueprintjsIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTypeUtilsDelimiterCaseMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Value extends string ? @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/delimiter-case.StringArrayToDelimiterCase<@blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/delimiter-case.SplitIncludingDelimiters<Value, @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/sourceUtilities.WordSeparators | @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/sourceUtilities.UpperCaseCharacters>, @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/sourceUtilities.WordSeparators, @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/sourceUtilities.UpperCaseCharacters, Delimiter> : Value
    }}}
    */
  type DelimiterCase[Value, Delimiter /* <: String */] = Value
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Source extends '' ? [] : Source extends / * template literal string: ${inferFirstPart}${Delimiter}${inferSecondPart} * / string ? Source extends / * template literal string: ${FirstPart}${inferUsedDelimiter}${SecondPart} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsedDelimiter * / any extends Delimiter ? Source extends / * template literal string: ${inferFirstPart}${UsedDelimiter}${inferSecondPart} * / string ? [...@blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/delimiter-case.SplitIncludingDelimiters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstPart * / any, Delimiter>, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsedDelimiter * / any, ...@blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/delimiter-case.SplitIncludingDelimiters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SecondPart * / any, Delimiter>] : never : never : never : [Source]
    }}}
    */
  type SplitIncludingDelimiters[Source /* <: String */, Delimiter /* <: String */] = js.Array[Any]
  
  /**
  Takes the result of a splitted string literal and recursively concatenates it together into the desired casing.
  It receives `UsedWordSeparators` and `UsedUpperCaseCharacters` as input to ensure it's fully encapsulated.
  @see SplitIncludingDelimiters
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Parts extends [/ * template literal string: ${inferFirstPart} * / string, ...infer RemainingParts] ? / * template literal string: ${StringPartToDelimiterCase<FirstPart,UsedWordSeparators,UsedUpperCaseCharacters,Delimiter>}${StringArrayToDelimiterCase<RemainingParts,UsedWordSeparators,UsedUpperCaseCharacters,Delimiter>} * / string : ''
    }}}
    */
  type StringArrayToDelimiterCase[Parts /* <: js.Array[Any] */, UsedWordSeparators /* <: String */, UsedUpperCaseCharacters /* <: String */, Delimiter /* <: String */] = /* template literal string: ${StringPartToDelimiterCase<FirstPart,UsedWordSeparators,UsedUpperCaseCharacters,Delimiter>}${StringArrayToDelimiterCase<RemainingParts,UsedWordSeparators,UsedUpperCaseCharacters,Delimiter>} */ String
  
  /**
  Format a specific part of the splitted string literal that `StringArrayToDelimiterCase<>` fuses together, ensuring desired casing.
  @see StringArrayToDelimiterCase
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    StringPart extends UsedWordSeparators ? Delimiter : StringPart extends UsedUpperCaseCharacters ? / * template literal string: ${Delimiter}${Lowercase<StringPart>} * / string : StringPart
    }}}
    */
  type StringPartToDelimiterCase[StringPart /* <: String */, UsedWordSeparators /* <: String */, UsedUpperCaseCharacters /* <: String */, Delimiter /* <: String */] = Delimiter
}
