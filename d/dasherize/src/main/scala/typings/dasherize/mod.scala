package typings.dasherize

import typings.dasherize.dasherizeStrings._empty
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](data: T): DasherizeReturnType[T] = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[DasherizeReturnType[T]]
  
  @JSImport("dasherize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends '' ? '' : / * template literal string: ${T}- * / string
    }}}
    */
  type AddHyphenSuffixIfNotTheEmptyString[T /* <: String */] = _empty
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TStringToParse extends / * template literal string: ${inferF}${inferR} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify F * / any extends std.Lowercase</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify F * / any> ? dasherize.dasherize.DashCase</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any, / * template literal string: ${TAlreadyParsedString}${F} * / string> : dasherize.dasherize.DashCase<dasherize.dasherize.LowerCasedFirstWord</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any>, / * template literal string: ${AddHyphenSuffixIfNotTheEmptyString<TAlreadyParsedString>}${Lowercase<F>} * / string> : TAlreadyParsedString
    }}}
    */
  type DashCase[TStringToParse /* <: String */, TAlreadyParsedString /* <: String */] = TAlreadyParsedString
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends string ? dasherize.dasherize.DashCase<T, string> : T extends std.Record<string, unknown> ? dasherize.dasherize.ParseObjToDashCase<T> : T extends std.Array<infer TArrayData> ? std.Array<dasherize.dasherize.DasherizeReturnType<TArrayData>> : T
    }}}
    */
  type DasherizeReturnType[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends / * template literal string: ${inferF}${inferR} * / string ? / * template literal string: ${FextendsLowercase<F>?${F}${R}:${Lowercase<F>}${LowerCasedFirstWord<R>}} * / string : ''
    }}}
    */
  type LowerCasedFirstWord[T /* <: String */] = /* template literal string: ${FextendsLowercase<F>?${F}${R}:${Lowercase<F>}${LowerCasedFirstWord<R>}} */ String
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in keyof TObj as dasherize.dasherize.DashCase<Key & string, ''> ]: dasherize.dasherize.DasherizeReturnType<TObj[Key]>}
    }}}
    */
  @js.native
  trait ParseObjToDashCase[TObj /* <: Record[String, Any] */] extends StObject
}
