package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tail-recursive helper type for UnionMapValues.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Ts extends [infer Head, ...infer Rest] ? Head extends / * Inlined std.Readonly<std.ReadonlyMap<unknown, infer V1>> * /
{readonly entries (): std.IterableIterator<[unknown, infer V1]>,  readonly size :number, readonly keys (): std.IterableIterator<unknown>, readonly forEach (callbackfn : (value : infer V1, key : unknown, map : std.ReadonlyMap<unknown, infer V1>): void): void, readonly has (key : unknown): boolean, readonly values (): std.IterableIterator<infer V1>, readonly get (key : unknown): infer V1 | undefined} ? Rest extends [] ? Acc | V1 : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.UnionMapValuesHelper<Rest, Acc | V1> : never : Acc
  }}}
  */
@js.native
trait UnionMapValuesHelper[Ts /* <: js.Array[Any] */, Acc] extends StObject
