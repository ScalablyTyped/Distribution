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
  * The options the user can pass to customize deepmerge.
  */
/* Inlined std.Partial<deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeOptionsFull<M, MM & deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeBuiltInMetaData>> */
trait DeepMergeOptions[M, MM /* <: Record[PropertyKey, Any] */] extends StObject {
  
  var enableImplicitDefaultMerging: js.UndefOr[Boolean] = js.undefined
  
  var mergeArrays: js.UndefOr[
    (js.Function3[
      /* records */ js.Array[js.Array[Any]], 
      /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
      /* meta */ js.UndefOr[M], 
      Any
    ]) | `false`
  ] = js.undefined
  
  var mergeMaps: js.UndefOr[
    (js.Function3[
      /* records */ js.Array[ReadonlyReadonlyMapunknow], 
      /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
      /* meta */ js.UndefOr[M], 
      Any
    ]) | `false`
  ] = js.undefined
  
  var mergeOthers: js.UndefOr[
    js.Function3[
      /* records */ js.Array[Any], 
      /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
      /* meta */ js.UndefOr[M], 
      Any
    ]
  ] = js.undefined
  
  var mergeRecords: js.UndefOr[
    (js.Function3[
      /* records */ js.Array[Record[PropertyKey, Any]], 
      /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
      /* meta */ js.UndefOr[M], 
      Any
    ]) | `false`
  ] = js.undefined
  
  var mergeSets: js.UndefOr[
    (js.Function3[
      /* records */ js.Array[ReadonlyReadonlySetunknow], 
      /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
      /* meta */ js.UndefOr[M], 
      Any
    ]) | `false`
  ] = js.undefined
  
  var metaDataUpdater: js.UndefOr[MetaDataUpdater[M, MM & DeepMergeBuiltInMetaData]] = js.undefined
}
object DeepMergeOptions {
  
  inline def apply[M, MM /* <: Record[PropertyKey, Any] */](): DeepMergeOptions[M, MM] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepMergeOptions[M, MM]]
  }
  
  extension [Self <: DeepMergeOptions[?, ?], M, MM /* <: Record[PropertyKey, Any] */](x: Self & (DeepMergeOptions[M, MM])) {
    
    inline def setEnableImplicitDefaultMerging(value: Boolean): Self = StObject.set(x, "enableImplicitDefaultMerging", value.asInstanceOf[js.Any])
    
    inline def setEnableImplicitDefaultMergingUndefined: Self = StObject.set(x, "enableImplicitDefaultMerging", js.undefined)
    
    inline def setMergeArrays(
      value: (js.Function3[
          /* records */ js.Array[js.Array[Any]], 
          /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
          /* meta */ js.UndefOr[M], 
          Any
        ]) | `false`
    ): Self = StObject.set(x, "mergeArrays", value.asInstanceOf[js.Any])
    
    inline def setMergeArraysFunction3(
      value: (/* records */ js.Array[js.Array[Any]], /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], /* meta */ js.UndefOr[M]) => Any
    ): Self = StObject.set(x, "mergeArrays", js.Any.fromFunction3(value))
    
    inline def setMergeArraysUndefined: Self = StObject.set(x, "mergeArrays", js.undefined)
    
    inline def setMergeMaps(
      value: (js.Function3[
          /* records */ js.Array[ReadonlyReadonlyMapunknow], 
          /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
          /* meta */ js.UndefOr[M], 
          Any
        ]) | `false`
    ): Self = StObject.set(x, "mergeMaps", value.asInstanceOf[js.Any])
    
    inline def setMergeMapsFunction3(
      value: (/* records */ js.Array[ReadonlyReadonlyMapunknow], /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], /* meta */ js.UndefOr[M]) => Any
    ): Self = StObject.set(x, "mergeMaps", js.Any.fromFunction3(value))
    
    inline def setMergeMapsUndefined: Self = StObject.set(x, "mergeMaps", js.undefined)
    
    inline def setMergeOthers(
      value: (/* records */ js.Array[Any], /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], /* meta */ js.UndefOr[M]) => Any
    ): Self = StObject.set(x, "mergeOthers", js.Any.fromFunction3(value))
    
    inline def setMergeOthersUndefined: Self = StObject.set(x, "mergeOthers", js.undefined)
    
    inline def setMergeRecords(
      value: (js.Function3[
          /* records */ js.Array[Record[PropertyKey, Any]], 
          /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
          /* meta */ js.UndefOr[M], 
          Any
        ]) | `false`
    ): Self = StObject.set(x, "mergeRecords", value.asInstanceOf[js.Any])
    
    inline def setMergeRecordsFunction3(
      value: (/* records */ js.Array[Record[PropertyKey, Any]], /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], /* meta */ js.UndefOr[M]) => Any
    ): Self = StObject.set(x, "mergeRecords", js.Any.fromFunction3(value))
    
    inline def setMergeRecordsUndefined: Self = StObject.set(x, "mergeRecords", js.undefined)
    
    inline def setMergeSets(
      value: (js.Function3[
          /* records */ js.Array[ReadonlyReadonlySetunknow], 
          /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
          /* meta */ js.UndefOr[M], 
          Any
        ]) | `false`
    ): Self = StObject.set(x, "mergeSets", value.asInstanceOf[js.Any])
    
    inline def setMergeSetsFunction3(
      value: (/* records */ js.Array[ReadonlyReadonlySetunknow], /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], /* meta */ js.UndefOr[M]) => Any
    ): Self = StObject.set(x, "mergeSets", js.Any.fromFunction3(value))
    
    inline def setMergeSetsUndefined: Self = StObject.set(x, "mergeSets", js.undefined)
    
    inline def setMetaDataUpdater(
      value: (/* previousMeta */ js.UndefOr[M], /* metaMeta */ Partial[MM & DeepMergeBuiltInMetaData]) => M
    ): Self = StObject.set(x, "metaDataUpdater", js.Any.fromFunction2(value))
    
    inline def setMetaDataUpdaterUndefined: Self = StObject.set(x, "metaDataUpdater", js.undefined)
  }
}
