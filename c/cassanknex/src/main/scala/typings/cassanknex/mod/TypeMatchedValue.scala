package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Will return the `never` type if `T[K]` is not a member of `Type`, for all `T[K]`.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T[K] extends Type ? This : never
  }}}
  */
@js.native
trait TypeMatchedValue[T, K /* <: /* keyof T */ String */, Type, This] extends StObject
