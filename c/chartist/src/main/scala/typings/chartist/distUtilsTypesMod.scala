package typings.chartist

import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Record<K, unknown> ? T : T extends std.Partial<std.Record<K, unknown>> ? T & {[ key in K ]: T[K]} : never
    }}}
    */
  @js.native
  trait FilterByKey[T, K /* <: String */] extends StObject
  
  type RequiredKeys[T, K /* <: /* keyof T */ String */, V /* <: /* keyof T */ String */] = T & (Required[Pick[T, K | V]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in V ]: std.Required<T[V]>} */ js.Any)
}
