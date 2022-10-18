package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tail-recursive helper type for FilterOutNever.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends [] ? Acc : T extends [infer Head, ...infer Rest] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsNever<Head> extends true ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.FilterOutNeverHelper<Rest, Acc> : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.FilterOutNeverHelper<Rest, [...Acc, Head]> : T
  }}}
  */
@js.native
trait FilterOutNeverHelper[T /* <: js.Array[Any] */, Acc /* <: js.Array[Any] */] extends StObject
