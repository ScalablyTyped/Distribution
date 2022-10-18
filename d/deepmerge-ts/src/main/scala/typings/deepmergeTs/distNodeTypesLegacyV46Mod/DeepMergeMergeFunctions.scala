package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import typings.deepmergeTs.anon.ReadonlyReadonlyMapunknow
import typings.deepmergeTs.anon.ReadonlyReadonlySetunknow
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All the merge functions that deepmerge uses.
  */
/* Inlined std.Readonly<{mergeRecords <Ts extends std.ReadonlyArray<std.Readonly<std.Record<std.PropertyKey, unknown>>>, U extends deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionUtils<M, MM>>(records : Ts, utils : U, meta : M | undefined): unknown, mergeArrays <Ts extends std.ReadonlyArray<std.ReadonlyArray<unknown>>, U extends deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionUtils<M, MM>>(records : Ts, utils : U, meta : M | undefined): unknown, mergeMaps <Ts extends std.ReadonlyArray<std.Readonly<std.ReadonlyMap<unknown, unknown>>>, U extends deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionUtils<M, MM>>(records : Ts, utils : U, meta : M | undefined): unknown, mergeSets <Ts extends std.ReadonlyArray<std.Readonly<std.ReadonlySet<unknown>>>, U extends deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionUtils<M, MM>>(records : Ts, utils : U, meta : M | undefined): unknown, mergeOthers <Ts extends std.ReadonlyArray<unknown>, U extends deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionUtils<M, MM>>(records : Ts, utils : U, meta : M | undefined): unknown}> */
@js.native
trait DeepMergeMergeFunctions[M, MM /* <: DeepMergeBuiltInMetaData */] extends StObject {
  
  def mergeArrays[Ts /* <: js.Array[js.Array[Any]] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
  def mergeArrays[Ts /* <: js.Array[js.Array[Any]] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
  
  def mergeMaps[Ts /* <: js.Array[ReadonlyReadonlyMapunknow] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
  def mergeMaps[Ts /* <: js.Array[ReadonlyReadonlyMapunknow] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
  
  def mergeOthers[Ts /* <: js.Array[Any] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
  def mergeOthers[Ts /* <: js.Array[Any] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
  
  def mergeRecords[Ts /* <: js.Array[Record[PropertyKey, Any]] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
  def mergeRecords[Ts /* <: js.Array[Record[PropertyKey, Any]] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
  
  def mergeSets[Ts /* <: js.Array[ReadonlyReadonlySetunknow] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
  def mergeSets[Ts /* <: js.Array[ReadonlyReadonlySetunknow] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
}
