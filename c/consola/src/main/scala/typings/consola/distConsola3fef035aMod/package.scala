package typings.consola.distConsola3fef035aMod

import typings.consola.anon.PartialConsolaOptions
import typings.consola.distConsola3fef035aMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def h(): ConsolaInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("h")().asInstanceOf[ConsolaInstance]
inline def h(options: PartialConsolaOptions): ConsolaInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(options.asInstanceOf[js.Any]).asInstanceOf[ConsolaInstance]

/* Rewritten from type alias, can be one of: 
  - typings.consola.consolaInts.`0`
  - typings.consola.consolaInts.`1`
  - typings.consola.consolaInts.`2`
  - typings.consola.consolaInts.`3`
  - typings.consola.consolaInts.`4`
  - typings.consola.consolaInts.`5`
  - scala.Double
*/
type LogLevel = _LogLevel | Double

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends consola.consola/dist/consola-3fef035a.TextOptions ? string : T extends consola.consola/dist/consola-3fef035a.ConfirmOptions ? boolean : std.Array<string>
  }}}
  */
type inferPromptReturnType[T /* <: PromptOptions */] = String
