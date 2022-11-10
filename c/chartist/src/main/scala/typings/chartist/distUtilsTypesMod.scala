package typings.chartist

import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Record<K, unknown> ? T : T extends std.Partial<std.Record<K, unknown>> ? T & {[ key in K ]: T[K]} : never
    }}}
    */
  type FilterByKey[T, K /* <: String */] = T
  
  type RequiredKeys[T, K /* <: /* keyof T */ String */, V /* <: /* keyof T */ String */] = T & (Required[Pick[T, K | V]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in V ]: std.Required<T[V]>} */ js.Any)
}
