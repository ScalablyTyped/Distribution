package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import typings.deepmergeTs.anon.ReadonlyReadonlyMapunknow
import typings.deepmergeTs.anon.ReadonlyReadonlySetunknow
import typings.deepmergeTs.deepmergeTsBooleans.`false`
import typings.std.Partial
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All the options the user can pass to customize deepmerge.
  */
/* Inlined std.Readonly<{  mergeRecords :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>['mergeRecords'] | false,   mergeArrays :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>['mergeArrays'] | false,   mergeMaps :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>['mergeMaps'] | false,   mergeSets :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>['mergeSets'] | false,   mergeOthers :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>['mergeOthers'],   metaDataUpdater :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.MetaDataUpdater<M, MM>,   enableImplicitDefaultMerging :boolean}> */
@js.native
trait DeepMergeOptionsFull[M, MM /* <: DeepMergeBuiltInMetaData */] extends StObject {
  
  val enableImplicitDefaultMerging: Boolean = js.native
  
  val mergeArrays: (js.Function3[
    /* records */ js.Array[js.Array[Any]], 
    /* utils */ DeepMergeMergeFunctionUtils[M, MM], 
    /* meta */ js.UndefOr[M], 
    Any
  ]) | `false` = js.native
  
  val mergeMaps: (js.Function3[
    /* records */ js.Array[ReadonlyReadonlyMapunknow], 
    /* utils */ DeepMergeMergeFunctionUtils[M, MM], 
    /* meta */ js.UndefOr[M], 
    Any
  ]) | `false` = js.native
  
  def mergeOthers[Ts /* <: js.Array[Any] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
  def mergeOthers[Ts /* <: js.Array[Any] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
  
  val mergeRecords: (js.Function3[
    /* records */ js.Array[Record[PropertyKey, Any]], 
    /* utils */ DeepMergeMergeFunctionUtils[M, MM], 
    /* meta */ js.UndefOr[M], 
    Any
  ]) | `false` = js.native
  
  val mergeSets: (js.Function3[
    /* records */ js.Array[ReadonlyReadonlySetunknow], 
    /* utils */ DeepMergeMergeFunctionUtils[M, MM], 
    /* meta */ js.UndefOr[M], 
    Any
  ]) | `false` = js.native
  
  def metaDataUpdater(previousMeta: M, metaMeta: Partial[MM]): M = js.native
  def metaDataUpdater(previousMeta: Unit, metaMeta: Partial[MM]): M = js.native
}
