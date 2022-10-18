package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Any prop that has a default prop becomes optional, but its type is unchanged
// Undeclared default props are augmented into the resulting allowable attributes
// If declared props have indexed properties, ignore default props entirely as keyof gets widened
// Wrap in an outer-level conditional type to allow distribution over props that are unions
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  P extends any ? string extends keyof P ? P : std.Pick<P, std.Exclude<keyof P, keyof D>> & std.Partial<std.Pick<P, std.Extract<keyof P, keyof D>>> & std.Partial<std.Pick<D, std.Exclude<keyof D, keyof P>>> : never
  }}}
  */
@js.native
trait Defaultize[P, D] extends StObject
