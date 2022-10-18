package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns whether or not all the given types are arrays.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Ts extends [infer T1] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsArray<T1> : Ts extends [infer Head, ...infer Rest] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsArray<Head> extends true ? Rest extends [unknown, ...std.ReadonlyArray<unknown>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsArray<Rest> : false : false : false
  }}}
  */
@js.native
trait EveryIsArray[Ts /* <: js.Array[Any] */] extends StObject
