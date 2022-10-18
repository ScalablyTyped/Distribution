package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns whether or not all the given types are sets.
  *
  * Note: This may also return true if all are maps.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Ts extends std.Readonly<[infer T1]> ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsSet<T1> : Ts extends [infer Head, ...infer Rest] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsSet<Head> extends true ? Rest extends [unknown, ...std.ReadonlyArray<unknown>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsSet<Rest> : false : false : false
  }}}
  */
@js.native
trait EveryIsSet[Ts /* <: js.Array[Any] */] extends StObject
