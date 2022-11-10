package typings.cassanknex.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cassanknex.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): CassanKnex = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CassanKnex]
inline def apply(options: DriverOptions): CassanKnex = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CassanKnex]

type MappedDict[B] = StringDictionary[B]

/**
  * Will return the `never` type if `T[K]` is not a member of `Type`, for all `T[K]`.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T[K] extends Type ? This : never
  }}}
  */
type TypeMatchedValue[T, K /* <: /* keyof T */ String */, Type, This] = This
