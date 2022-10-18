package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deep merge types.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsTuple<Ts> extends true ? Ts extends [] ? undefined : Ts extends [infer T1] ? T1 : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsArray<Ts> extends true ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysHKT<Ts, MF, M> : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsMap<Ts> extends true ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMapsHKT<Ts, MF, M> : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsSet<Ts> extends true ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeSetsHKT<Ts, MF, M> : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsRecord<Ts> extends true ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsHKT<Ts, MF, M> : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeOthersHKT<Ts, MF, M> : unknown
  }}}
  */
@js.native
trait DeepMergeHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] extends StObject
