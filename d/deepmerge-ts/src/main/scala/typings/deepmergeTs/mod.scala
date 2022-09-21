package typings.deepmergeTs

import typings.deepmergeTs.anon.PartialDeepMergeOptionsFu
import typings.deepmergeTs.anon.ReadonlyReadonlyMapanyany
import typings.deepmergeTs.anon.ReadonlyReadonlySetany
import typings.deepmergeTs.deepmergeTsBooleans.`false`
import typings.std.Map
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deepmerge-ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Deeply merge objects.
    *
    * @param objects - The objects to merge.
    */
  inline def deepmerge(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")().asInstanceOf[Unit]
  inline def deepmerge(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  inline def deepmerge[T0](arg0: T0): T0 = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(arg0.asInstanceOf[js.Any]).asInstanceOf[T0]
  inline def deepmerge[T0, T1](arg0: T0, arg1: T1): T0 & T1 = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[T0 & T1]
  inline def deepmerge[T0, T1, T2](arg0: T0, arg1: T1, arg2: T2): T0 & T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[T0 & T1 & T2]
  inline def deepmerge[T0, T1, T2, T3](arg0: T0, arg1: T1, arg2: T2, arg3: T3): T0 & T1 & T2 & T3 = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[T0 & T1 & T2 & T3]
  inline def deepmerge[T0, T1, T2, T3, T4](arg0: T0, arg1: T1, arg2: T2, arg3: T3, arg4: T4): T0 & T1 & T2 & T3 & T4 = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[T0 & T1 & T2 & T3 & T4]
  inline def deepmerge[T0, T1, T2, T3, T4, T5](arg0: T0, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): T0 & T1 & T2 & T3 & T4 & T5 = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[T0 & T1 & T2 & T3 & T4 & T5]
  inline def deepmerge[T0, T1, T2, T3, T4, T5, T6](arg0: T0, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6): T0 & T1 & T2 & T3 & T4 & T5 & T6 = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any], arg6.asInstanceOf[js.Any])).asInstanceOf[T0 & T1 & T2 & T3 & T4 & T5 & T6]
  inline def deepmerge[T0, T1, T2, T3, T4, T5, T6, T7](arg0: T0, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7): T0 & T1 & T2 & T3 & T4 & T5 & T6 & T7 = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any], arg6.asInstanceOf[js.Any], arg7.asInstanceOf[js.Any])).asInstanceOf[T0 & T1 & T2 & T3 & T4 & T5 & T6 & T7]
  inline def deepmerge[T0, T1, T2, T3, T4, T5, T6, T7, T8](arg0: T0, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8): T0 & T1 & T2 & T3 & T4 & T5 & T6 & T7 & T8 = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any], arg6.asInstanceOf[js.Any], arg7.asInstanceOf[js.Any], arg8.asInstanceOf[js.Any])).asInstanceOf[T0 & T1 & T2 & T3 & T4 & T5 & T6 & T7 & T8]
  inline def deepmerge[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](arg0: T0, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9): T0 & T1 & T2 & T3 & T4 & T5 & T6 & T7 & T8 & T9 = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any], arg6.asInstanceOf[js.Any], arg7.asInstanceOf[js.Any], arg8.asInstanceOf[js.Any], arg9.asInstanceOf[js.Any])).asInstanceOf[T0 & T1 & T2 & T3 & T4 & T5 & T6 & T7 & T8 & T9]
  
  /**
    * Deeply merge two or more objects using the given options and meta data.
    *
    * @param options - The options on how to customize the merge function.
    * @param rootMetaData - The meta data passed to the root items' being merged.
    */
  inline def deepmergeCustom(options: PartialDeepMergeOptionsFu): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmergeCustom")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  inline def deepmergeCustom(options: PartialDeepMergeOptionsFu, rootMetaData: Any): js.Function1[/* repeated */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmergeCustom")(options.asInstanceOf[js.Any], rootMetaData.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  /**
    * The utils provided to the merge functions.
    */
  /* Inlined std.Readonly<{  mergeFunctions :deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctions,   defaultMergeFunctions :deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctionsDefaults,   metaDataUpdater :deepmerge-ts.deepmerge-ts.MetaDataUpdater, deepmerge <Ts extends std.ReadonlyArray<any>>(values : Ts): any}> */
  trait DeepMergeMergeFunctionUtils extends StObject {
    
    def deepmerge[Ts /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type Ts is not an array type */ values: Ts
    ): Any
    
    val defaultMergeFunctions: DeepMergeMergeFunctionsDefaults
    
    val mergeFunctions: DeepMergeMergeFunctions
    
    def metaDataUpdater(previousMeta: Any, metaMeta: Any): Any
  }
  object DeepMergeMergeFunctionUtils {
    
    inline def apply(
      deepmerge: Any => Any,
      defaultMergeFunctions: DeepMergeMergeFunctionsDefaults,
      mergeFunctions: DeepMergeMergeFunctions,
      metaDataUpdater: (Any, Any) => Any
    ): DeepMergeMergeFunctionUtils = {
      val __obj = js.Dynamic.literal(deepmerge = js.Any.fromFunction1(deepmerge), defaultMergeFunctions = defaultMergeFunctions.asInstanceOf[js.Any], mergeFunctions = mergeFunctions.asInstanceOf[js.Any], metaDataUpdater = js.Any.fromFunction2(metaDataUpdater))
      __obj.asInstanceOf[DeepMergeMergeFunctionUtils]
    }
    
    extension [Self <: DeepMergeMergeFunctionUtils](x: Self) {
      
      inline def setDeepmerge(value: Any => Any): Self = StObject.set(x, "deepmerge", js.Any.fromFunction1(value))
      
      inline def setDefaultMergeFunctions(value: DeepMergeMergeFunctionsDefaults): Self = StObject.set(x, "defaultMergeFunctions", value.asInstanceOf[js.Any])
      
      inline def setMergeFunctions(value: DeepMergeMergeFunctions): Self = StObject.set(x, "mergeFunctions", value.asInstanceOf[js.Any])
      
      inline def setMetaDataUpdater(value: (Any, Any) => Any): Self = StObject.set(x, "metaDataUpdater", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * All the merge functions that deepmerge uses.
    */
  /* Inlined std.Readonly<{mergeRecords <Ts extends std.ReadonlyArray<std.Readonly<std.Record<keyof any, any>>>, U extends deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctionUtils>(records : Ts, utils : U, meta : any): any, mergeArrays <Ts extends std.ReadonlyArray<std.ReadonlyArray<any>>, U extends deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctionUtils>(records : Ts, utils : U, meta : any): any, mergeMaps <Ts extends std.ReadonlyArray<std.Readonly<std.ReadonlyMap<any, any>>>, U extends deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctionUtils>(records : Ts, utils : U, meta : any): any, mergeSets <Ts extends std.ReadonlyArray<std.Readonly<std.ReadonlySet<any>>>, U extends deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctionUtils>(records : Ts, utils : U, meta : any): any, mergeOthers <Ts extends std.ReadonlyArray<any>, U extends deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctionUtils>(records : Ts, utils : U, meta : any): any}> */
  trait DeepMergeMergeFunctions extends StObject {
    
    def mergeArrays[Ts /* <: js.Array[js.Array[Any]] */, U /* <: DeepMergeMergeFunctionUtils */](records: Ts, utils: U, meta: Any): Any
    
    def mergeMaps[Ts /* <: js.Array[ReadonlyReadonlyMapanyany] */, U /* <: DeepMergeMergeFunctionUtils */](records: Ts, utils: U, meta: Any): Any
    
    def mergeOthers[Ts /* <: js.Array[Any] */, U /* <: DeepMergeMergeFunctionUtils */](records: Ts, utils: U, meta: Any): Any
    
    def mergeRecords[Ts /* <: js.Array[Record[/* keyof any */ String, Any]] */, U /* <: DeepMergeMergeFunctionUtils */](records: Ts, utils: U, meta: Any): Any
    
    def mergeSets[Ts /* <: js.Array[ReadonlyReadonlySetany] */, U /* <: DeepMergeMergeFunctionUtils */](records: Ts, utils: U, meta: Any): Any
  }
  object DeepMergeMergeFunctions {
    
    inline def apply(
      mergeArrays: (Any, Any, Any) => Any,
      mergeMaps: (Any, Any, Any) => Any,
      mergeOthers: (Any, Any, Any) => Any,
      mergeRecords: (Any, Any, Any) => Any,
      mergeSets: (Any, Any, Any) => Any
    ): DeepMergeMergeFunctions = {
      val __obj = js.Dynamic.literal(mergeArrays = js.Any.fromFunction3(mergeArrays), mergeMaps = js.Any.fromFunction3(mergeMaps), mergeOthers = js.Any.fromFunction3(mergeOthers), mergeRecords = js.Any.fromFunction3(mergeRecords), mergeSets = js.Any.fromFunction3(mergeSets))
      __obj.asInstanceOf[DeepMergeMergeFunctions]
    }
    
    extension [Self <: DeepMergeMergeFunctions](x: Self) {
      
      inline def setMergeArrays(value: (Any, Any, Any) => Any): Self = StObject.set(x, "mergeArrays", js.Any.fromFunction3(value))
      
      inline def setMergeMaps(value: (Any, Any, Any) => Any): Self = StObject.set(x, "mergeMaps", js.Any.fromFunction3(value))
      
      inline def setMergeOthers(value: (Any, Any, Any) => Any): Self = StObject.set(x, "mergeOthers", js.Any.fromFunction3(value))
      
      inline def setMergeRecords(value: (Any, Any, Any) => Any): Self = StObject.set(x, "mergeRecords", js.Any.fromFunction3(value))
      
      inline def setMergeSets(value: (Any, Any, Any) => Any): Self = StObject.set(x, "mergeSets", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * The default merge functions.
    */
  /* Inlined std.Readonly<{mergeMaps (values : std.Array<std.Record<keyof any, any>>): any, mergeSets (values : std.Array<std.Array<any>>): any, mergeArrays (values : std.Array<std.Set<any>>): any, mergeRecords (values : std.Array<std.Map<any, any>>, utils : deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctionUtils, meta : any): any, mergeOthers (values : std.Array<any>): any}> */
  trait DeepMergeMergeFunctionsDefaults extends StObject {
    
    def mergeArrays(values: js.Array[Set[Any]]): Any
    
    def mergeMaps(values: js.Array[Record[/* keyof any */ String, Any]]): Any
    
    def mergeOthers(values: js.Array[Any]): Any
    
    def mergeRecords(values: js.Array[Map[Any, Any]], utils: DeepMergeMergeFunctionUtils, meta: Any): Any
    
    def mergeSets(values: js.Array[js.Array[Any]]): Any
  }
  object DeepMergeMergeFunctionsDefaults {
    
    inline def apply(
      mergeArrays: js.Array[Set[Any]] => Any,
      mergeMaps: js.Array[Record[/* keyof any */ String, Any]] => Any,
      mergeOthers: js.Array[Any] => Any,
      mergeRecords: (js.Array[Map[Any, Any]], DeepMergeMergeFunctionUtils, Any) => Any,
      mergeSets: js.Array[js.Array[Any]] => Any
    ): DeepMergeMergeFunctionsDefaults = {
      val __obj = js.Dynamic.literal(mergeArrays = js.Any.fromFunction1(mergeArrays), mergeMaps = js.Any.fromFunction1(mergeMaps), mergeOthers = js.Any.fromFunction1(mergeOthers), mergeRecords = js.Any.fromFunction3(mergeRecords), mergeSets = js.Any.fromFunction1(mergeSets))
      __obj.asInstanceOf[DeepMergeMergeFunctionsDefaults]
    }
    
    extension [Self <: DeepMergeMergeFunctionsDefaults](x: Self) {
      
      inline def setMergeArrays(value: js.Array[Set[Any]] => Any): Self = StObject.set(x, "mergeArrays", js.Any.fromFunction1(value))
      
      inline def setMergeMaps(value: js.Array[Record[/* keyof any */ String, Any]] => Any): Self = StObject.set(x, "mergeMaps", js.Any.fromFunction1(value))
      
      inline def setMergeOthers(value: js.Array[Any] => Any): Self = StObject.set(x, "mergeOthers", js.Any.fromFunction1(value))
      
      inline def setMergeRecords(value: (js.Array[Map[Any, Any]], DeepMergeMergeFunctionUtils, Any) => Any): Self = StObject.set(x, "mergeRecords", js.Any.fromFunction3(value))
      
      inline def setMergeSets(value: js.Array[js.Array[Any]] => Any): Self = StObject.set(x, "mergeSets", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * All the options the user can pass to customize deepmerge.
    */
  /* Inlined std.Readonly<{  mergeRecords :deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctions['mergeRecords'] | false,   mergeArrays :deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctions['mergeArrays'] | false,   mergeMaps :deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctions['mergeMaps'] | false,   mergeSets :deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctions['mergeSets'] | false,   mergeOthers :deepmerge-ts.deepmerge-ts.DeepMergeMergeFunctions['mergeOthers'],   metaDataUpdater :deepmerge-ts.deepmerge-ts.MetaDataUpdater}> */
  trait DeepMergeOptionsFull extends StObject {
    
    val mergeArrays: (js.Function3[
        /* records */ js.Array[js.Array[Any]], 
        /* utils */ DeepMergeMergeFunctionUtils, 
        /* meta */ Any, 
        Any
      ]) | `false`
    
    val mergeMaps: (js.Function3[
        /* records */ js.Array[ReadonlyReadonlyMapanyany], 
        /* utils */ DeepMergeMergeFunctionUtils, 
        /* meta */ Any, 
        Any
      ]) | `false`
    
    def mergeOthers[Ts /* <: js.Array[Any] */, U /* <: DeepMergeMergeFunctionUtils */](records: Ts, utils: U, meta: Any): Any
    
    val mergeRecords: (js.Function3[
        /* records */ js.Array[Record[/* keyof any */ String, Any]], 
        /* utils */ DeepMergeMergeFunctionUtils, 
        /* meta */ Any, 
        Any
      ]) | `false`
    
    val mergeSets: (js.Function3[
        /* records */ js.Array[ReadonlyReadonlySetany], 
        /* utils */ DeepMergeMergeFunctionUtils, 
        /* meta */ Any, 
        Any
      ]) | `false`
    
    def metaDataUpdater(previousMeta: Any, metaMeta: Any): Any
  }
  object DeepMergeOptionsFull {
    
    inline def apply(
      mergeArrays: (js.Function3[
          /* records */ js.Array[js.Array[Any]], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`,
      mergeMaps: (js.Function3[
          /* records */ js.Array[ReadonlyReadonlyMapanyany], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`,
      mergeOthers: (Any, Any, Any) => Any,
      mergeRecords: (js.Function3[
          /* records */ js.Array[Record[/* keyof any */ String, Any]], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`,
      mergeSets: (js.Function3[
          /* records */ js.Array[ReadonlyReadonlySetany], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`,
      metaDataUpdater: (Any, Any) => Any
    ): DeepMergeOptionsFull = {
      val __obj = js.Dynamic.literal(mergeArrays = mergeArrays.asInstanceOf[js.Any], mergeMaps = mergeMaps.asInstanceOf[js.Any], mergeOthers = js.Any.fromFunction3(mergeOthers), mergeRecords = mergeRecords.asInstanceOf[js.Any], mergeSets = mergeSets.asInstanceOf[js.Any], metaDataUpdater = js.Any.fromFunction2(metaDataUpdater))
      __obj.asInstanceOf[DeepMergeOptionsFull]
    }
    
    extension [Self <: DeepMergeOptionsFull](x: Self) {
      
      inline def setMergeArrays(
        value: (js.Function3[
              /* records */ js.Array[js.Array[Any]], 
              /* utils */ DeepMergeMergeFunctionUtils, 
              /* meta */ Any, 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeArrays", value.asInstanceOf[js.Any])
      
      inline def setMergeArraysFunction3(
        value: (/* records */ js.Array[js.Array[Any]], /* utils */ DeepMergeMergeFunctionUtils, /* meta */ Any) => Any
      ): Self = StObject.set(x, "mergeArrays", js.Any.fromFunction3(value))
      
      inline def setMergeMaps(
        value: (js.Function3[
              /* records */ js.Array[ReadonlyReadonlyMapanyany], 
              /* utils */ DeepMergeMergeFunctionUtils, 
              /* meta */ Any, 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeMaps", value.asInstanceOf[js.Any])
      
      inline def setMergeMapsFunction3(
        value: (/* records */ js.Array[ReadonlyReadonlyMapanyany], /* utils */ DeepMergeMergeFunctionUtils, /* meta */ Any) => Any
      ): Self = StObject.set(x, "mergeMaps", js.Any.fromFunction3(value))
      
      inline def setMergeOthers(value: (Any, Any, Any) => Any): Self = StObject.set(x, "mergeOthers", js.Any.fromFunction3(value))
      
      inline def setMergeRecords(
        value: (js.Function3[
              /* records */ js.Array[Record[/* keyof any */ String, Any]], 
              /* utils */ DeepMergeMergeFunctionUtils, 
              /* meta */ Any, 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeRecords", value.asInstanceOf[js.Any])
      
      inline def setMergeRecordsFunction3(
        value: (/* records */ js.Array[Record[/* keyof any */ String, Any]], /* utils */ DeepMergeMergeFunctionUtils, /* meta */ Any) => Any
      ): Self = StObject.set(x, "mergeRecords", js.Any.fromFunction3(value))
      
      inline def setMergeSets(
        value: (js.Function3[
              /* records */ js.Array[ReadonlyReadonlySetany], 
              /* utils */ DeepMergeMergeFunctionUtils, 
              /* meta */ Any, 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeSets", value.asInstanceOf[js.Any])
      
      inline def setMergeSetsFunction3(
        value: (/* records */ js.Array[ReadonlyReadonlySetany], /* utils */ DeepMergeMergeFunctionUtils, /* meta */ Any) => Any
      ): Self = StObject.set(x, "mergeSets", js.Any.fromFunction3(value))
      
      inline def setMetaDataUpdater(value: (Any, Any) => Any): Self = StObject.set(x, "metaDataUpdater", js.Any.fromFunction2(value))
    }
  }
  
  type MetaDataUpdater = js.Function2[/* previousMeta */ Any, /* metaMeta */ Any, Any]
}
