package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns whether or not all the given types are records.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Ts extends [infer Head, ...infer Rest] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsRecord<Head> extends true ? Rest extends std.ReadonlyArray<unknown> ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsRecord<Rest> : true : false : true
  }}}
  */
@js.native
trait EveryIsRecord[Ts /* <: js.Array[Any] */] extends StObject
