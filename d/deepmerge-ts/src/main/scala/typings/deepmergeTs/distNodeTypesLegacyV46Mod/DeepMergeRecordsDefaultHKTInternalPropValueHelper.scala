package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tail-recursive helper type for DeepMergeRecordsDefaultHKTInternalPropValue.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Ts extends [infer Head, ...infer Rest] ? Head extends std.Readonly<std.Record<std.PropertyKey, unknown>> ? Rest extends [unknown, ...std.ReadonlyArray<unknown>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsDefaultHKTInternalPropValueHelper<Rest, K, M, [...Acc, deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.ValueOfKey<Head, K>]> : [...Acc, deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.ValueOfKey<Head, K>] : never : never
  }}}
  */
@js.native
trait DeepMergeRecordsDefaultHKTInternalPropValueHelper[Ts /* <: Array[Any] */, K /* <: PropertyKey */, M, Acc /* <: js.Array[Any] */] extends StObject
