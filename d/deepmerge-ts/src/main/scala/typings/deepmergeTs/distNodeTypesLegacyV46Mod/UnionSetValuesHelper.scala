package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tail-recursive helper type for UnionSetValues.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Ts extends [infer Head, ...infer Rest] ? Head extends / * Inlined std.Readonly<std.ReadonlySet<infer V1>> * /
{readonly entries (): std.IterableIterator<[infer V1, infer V1]>,  readonly size :number, readonly keys (): std.IterableIterator<infer V1>, readonly forEach (callbackfn : (value : infer V1, value2 : infer V1, set : std.ReadonlySet<infer V1>): void): void, readonly has (value : infer V1): boolean, readonly values (): std.IterableIterator<infer V1>} ? Rest extends std.ReadonlyArray<unknown> ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.UnionSetValuesHelper<Rest, Acc | V1> : Acc | V1 : never : Acc
  }}}
  */
@js.native
trait UnionSetValuesHelper[Ts /* <: js.Array[Any] */, Acc] extends StObject
