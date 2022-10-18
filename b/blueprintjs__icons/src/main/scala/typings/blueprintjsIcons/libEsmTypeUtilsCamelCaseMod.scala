package typings.blueprintjsIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTypeUtilsCamelCaseMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    K extends string ? K extends std.Uppercase<K> ? @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/camel-case.CamelCaseStringArray<@blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/utilities.Split<std.Lowercase<K>, @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/sourceUtilities.WordSeparators>> : @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/camel-case.CamelCaseStringArray<@blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/utilities.Split<K, @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/sourceUtilities.WordSeparators>> : K
    }}}
    */
  @js.native
  trait CamelCase[K] extends StObject
  
  /**
  Starts fusing the output of `Split<>`, an array literal of strings, into a camel-cased string literal.
  It's separate from `InnerCamelCaseStringArray<>` to keep a clean API outwards to the rest of the code.
  @see Split
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Parts extends [/ * template literal string: ${inferFirstPart} * / string, ...infer RemainingParts] ? std.Uncapitalize</ * template literal string: ${FirstPart}${InnerCamelCaseStringArray<RemainingParts,FirstPart>} * / string> : never
    }}}
    */
  @js.native
  trait CamelCaseStringArray[Parts /* <: js.Array[String] */] extends StObject
  
  /**
  Step by step takes the first item in an array literal, formats it and adds it to a string literal, and then recursively appends the remainder.
  Only to be used by `CamelCaseStringArray<>`.
  @see CamelCaseStringArray
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Parts extends [/ * template literal string: ${inferFirstPart} * / string, ...infer RemainingParts] ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstPart * / any extends undefined ? '' : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstPart * / any extends '' ? @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/camel-case.InnerCamelCaseStringArray<RemainingParts, PreviousPart> : / * template literal string: ${PreviousPartextends?FirstPart:Capitalize<FirstPart>}${InnerCamelCaseStringArray<RemainingParts,FirstPart>} * / string : ''
    }}}
    */
  @js.native
  trait InnerCamelCaseStringArray[Parts /* <: js.Array[Any] */, PreviousPart] extends StObject
}
