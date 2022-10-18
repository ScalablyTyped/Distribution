package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tail-recursive helper type for UnionMapKeys.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Ts extends [infer Head, ...infer Rest] ? Head extends / * Inlined std.Readonly<std.ReadonlyMap<infer K1, unknown>> * /
{readonly entries (): std.IterableIterator<[infer K1, unknown]>,  readonly size :number, readonly keys (): std.IterableIterator<infer K1>, readonly forEach (callbackfn : (value : unknown, key : infer K1, map : std.ReadonlyMap<infer K1, unknown>): void): void, readonly has (key : infer K1): boolean, readonly values (): std.IterableIterator<unknown>, readonly get (key : infer K1): unknown | undefined} ? Rest extends [] ? Acc | K1 : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.UnionMapKeysHelper<Rest, Acc | K1> : never : Acc
  }}}
  */
@js.native
trait UnionMapKeysHelper[Ts /* <: js.Array[Any] */, Acc] extends StObject
