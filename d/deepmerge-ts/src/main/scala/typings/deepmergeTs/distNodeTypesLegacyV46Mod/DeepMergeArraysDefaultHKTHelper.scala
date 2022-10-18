package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tail-recursive helper type for DeepMergeArraysDefaultHKT.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Ts extends [infer Head, ...infer Rest] ? Head extends std.ReadonlyArray<unknown> ? Rest extends [std.ReadonlyArray<unknown>, ...std.ReadonlyArray<std.ReadonlyArray<unknown>>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysDefaultHKTHelper<Rest, MF, M, [...Acc, ...Head]> : [...Acc, ...Head] : never : never
  }}}
  */
@js.native
trait DeepMergeArraysDefaultHKTHelper[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M, Acc /* <: js.Array[Any] */] extends StObject
