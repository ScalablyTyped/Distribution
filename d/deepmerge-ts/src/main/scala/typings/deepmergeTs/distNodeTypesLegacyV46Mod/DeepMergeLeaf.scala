package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get the leaf type from many types that can't be merged.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Ts extends [] ? never : Ts extends [infer T] ? T : Ts extends [...infer Rest, infer Tail] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsNever<Tail> extends true ? Rest extends std.ReadonlyArray<unknown> ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeLeaf<Rest> : never : Tail : never
  }}}
  */
@js.native
trait DeepMergeLeaf[Ts /* <: js.Array[Any] */] extends StObject
