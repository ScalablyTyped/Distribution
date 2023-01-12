package typings.deepmergeTs

import typings.deepmergeTs.deepmergeTsBooleans.`false`
import typings.deepmergeTs.distNodeTypesLegacyV46Mod.DeepMergeMergeFunctionURIs
import typings.deepmergeTs.mod.DeepMergeMergeFunctionUtils
import typings.deepmergeTs.mod.MetaDataUpdater
import typings.std.FlatArray
import typings.std.IterableIterator
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionsURIs> */
  trait PartialDeepMergeMergeFunc extends StObject {
    
    var DeepMergeArraysURI: js.UndefOr[DeepMergeMergeFunctionURIs] = js.undefined
    
    var DeepMergeMapsURI: js.UndefOr[DeepMergeMergeFunctionURIs] = js.undefined
    
    var DeepMergeOthersURI: js.UndefOr[DeepMergeMergeFunctionURIs] = js.undefined
    
    var DeepMergeRecordsURI: js.UndefOr[DeepMergeMergeFunctionURIs] = js.undefined
    
    var DeepMergeSetsURI: js.UndefOr[DeepMergeMergeFunctionURIs] = js.undefined
  }
  object PartialDeepMergeMergeFunc {
    
    inline def apply(): PartialDeepMergeMergeFunc = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDeepMergeMergeFunc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialDeepMergeMergeFunc] (val x: Self) extends AnyVal {
      
      inline def setDeepMergeArraysURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeArraysURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeArraysURIUndefined: Self = StObject.set(x, "DeepMergeArraysURI", js.undefined)
      
      inline def setDeepMergeMapsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeMapsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeMapsURIUndefined: Self = StObject.set(x, "DeepMergeMapsURI", js.undefined)
      
      inline def setDeepMergeOthersURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeOthersURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeOthersURIUndefined: Self = StObject.set(x, "DeepMergeOthersURI", js.undefined)
      
      inline def setDeepMergeRecordsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeRecordsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeRecordsURIUndefined: Self = StObject.set(x, "DeepMergeRecordsURI", js.undefined)
      
      inline def setDeepMergeSetsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeSetsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeSetsURIUndefined: Self = StObject.set(x, "DeepMergeSetsURI", js.undefined)
    }
  }
  
  /* Inlined std.Partial<deepmerge-ts.deepmerge-ts.DeepMergeOptionsFull> */
  trait PartialDeepMergeOptionsFu extends StObject {
    
    var mergeArrays: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[js.Array[Any]], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`
      ] = js.undefined
    
    var mergeMaps: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[ReadonlyReadonlyMapanyany], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`
      ] = js.undefined
    
    var mergeOthers: js.UndefOr[
        js.Function3[
          /* records */ js.Array[Any], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]
      ] = js.undefined
    
    var mergeRecords: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[Record[/* keyof any */ String, Any]], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`
      ] = js.undefined
    
    var mergeSets: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[ReadonlyReadonlySetany], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`
      ] = js.undefined
    
    var metaDataUpdater: js.UndefOr[MetaDataUpdater] = js.undefined
  }
  object PartialDeepMergeOptionsFu {
    
    inline def apply(): PartialDeepMergeOptionsFu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDeepMergeOptionsFu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialDeepMergeOptionsFu] (val x: Self) extends AnyVal {
      
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
      
      inline def setMergeArraysUndefined: Self = StObject.set(x, "mergeArrays", js.undefined)
      
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
      
      inline def setMergeMapsUndefined: Self = StObject.set(x, "mergeMaps", js.undefined)
      
      inline def setMergeOthers(
        value: (/* records */ js.Array[Any], /* utils */ DeepMergeMergeFunctionUtils, /* meta */ Any) => Any
      ): Self = StObject.set(x, "mergeOthers", js.Any.fromFunction3(value))
      
      inline def setMergeOthersUndefined: Self = StObject.set(x, "mergeOthers", js.undefined)
      
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
      
      inline def setMergeRecordsUndefined: Self = StObject.set(x, "mergeRecords", js.undefined)
      
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
      
      inline def setMergeSetsUndefined: Self = StObject.set(x, "mergeSets", js.undefined)
      
      inline def setMetaDataUpdater(value: (/* previousMeta */ Any, /* metaMeta */ Any) => Any): Self = StObject.set(x, "metaDataUpdater", js.Any.fromFunction2(value))
      
      inline def setMetaDataUpdaterUndefined: Self = StObject.set(x, "metaDataUpdater", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.ReadonlyArray<unknown>> */
  trait ReadonlyReadonlyArrayunkn extends StObject {
    
    def at(index: Double): js.UndefOr[Any]
    
    def concat(items: js.Array[Any]*): js.Array[Any]
    
    def entries(): IterableIterator[js.Tuple2[Double, Any]]
    
    def every[S /* <: Any */](
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean]
    ): /* is std.Array<S> */ Boolean
    
    def filter[S /* <: Any */](
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean]
    ): js.Array[S]
    
    def find[S /* <: Any */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Any, 
          /* index */ Double, 
          /* obj */ js.Array[Any], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S]
    
    def findIndex(predicate: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any]): Double
    
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]]
    
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Any, 
          /* index */ Double, 
          /* array */ js.Array[Any], 
          U | js.Array[U]
        ]
    ): js.Array[U]
    
    def forEach(callbackfn: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]): Unit
    
    def includes(searchElement: Any): Boolean
    
    def indexOf(searchElement: Any): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(searchElement: Any): Double
    
    val length: Double
    
    def map[U](callbackfn: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], U]): js.Array[U]
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ]
    ): Any
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ]
    ): Any
    
    def slice(): js.Array[Any]
    
    def some(predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any]): Boolean
    
    def values(): IterableIterator[Any]
  }
  object ReadonlyReadonlyArrayunkn {
    
    inline def apply(
      at: Double => js.UndefOr[Any],
      concat: /* repeated */ js.Array[Any] => js.Array[Any],
      entries: () => IterableIterator[js.Tuple2[Double, Any]],
      every: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean] => /* is std.Array<S> */ Boolean,
      filter: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean] => js.Array[Any],
      find: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Any, 
          /* index */ Double, 
          /* obj */ js.Array[Any], 
          /* is S */ Boolean
        ] => js.UndefOr[Any],
      findIndex: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any] => Double,
      flat: () => js.Array[FlatArray[Any, Any]],
      flatMap: js.ThisFunction3[Any, /* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any | js.Array[Any]] => js.Array[Any],
      forEach: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit] => Unit,
      includes: Any => Boolean,
      indexOf: Any => Double,
      join: () => String,
      keys: () => IterableIterator[Double],
      lastIndexOf: Any => Double,
      length: Double,
      map: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => js.Array[Any],
      reduce: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ] => Any,
      reduceRight: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ] => Any,
      slice: () => js.Array[Any],
      some: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => Boolean,
      values: () => IterableIterator[Any]
    ): ReadonlyReadonlyArrayunkn = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), concat = js.Any.fromFunction1(concat), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = js.Any.fromFunction0(flat), flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlyReadonlyArrayunkn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyReadonlyArrayunkn] (val x: Self) extends AnyVal {
      
      inline def setAt(value: Double => js.UndefOr[Any]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setConcat(value: /* repeated */ js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[Double, Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setEvery(
        value: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean] => /* is std.Array<S> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean] => js.Array[Any]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* value */ Any, 
              /* index */ Double, 
              /* obj */ js.Array[Any], 
              /* is S */ Boolean
            ] => js.UndefOr[Any]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(value: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any] => Double): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFlat(value: () => js.Array[FlatArray[Any, Any]]): Self = StObject.set(x, "flat", js.Any.fromFunction0(value))
      
      inline def setFlatMap(
        value: js.ThisFunction3[Any, /* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any | js.Array[Any]] => js.Array[Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setIncludes(value: Any => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: Any => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      inline def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setLastIndexOf(value: Any => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => js.Array[Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setReduce(
        value: js.Function4[
              /* previousValue */ Any, 
              /* currentValue */ Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[Any], 
              Any
            ] => Any
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: js.Function4[
              /* previousValue */ Any, 
              /* currentValue */ Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[Any], 
              Any
            ] => Any
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setSlice(value: () => js.Array[Any]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      inline def setSome(
        value: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setValues(value: () => IterableIterator[Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.ReadonlyMap<any, any>> */
  trait ReadonlyReadonlyMapanyany extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[Any, Any]]
    
    def forEach(callbackfn: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit]): Unit
    
    def get(key: Any): js.UndefOr[Any]
    
    def has(key: Any): Boolean
    
    def keys(): IterableIterator[Any]
    
    val size: Double
    
    def values(): IterableIterator[Any]
  }
  object ReadonlyReadonlyMapanyany {
    
    inline def apply(
      entries: () => IterableIterator[js.Tuple2[Any, Any]],
      forEach: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit] => Unit,
      get: Any => js.UndefOr[Any],
      has: Any => Boolean,
      keys: () => IterableIterator[Any],
      size: Double,
      values: () => IterableIterator[Any]
    ): ReadonlyReadonlyMapanyany = {
      val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlyReadonlyMapanyany]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyReadonlyMapanyany] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[Any, Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setForEach(value: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setGet(value: Any => js.UndefOr[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: () => IterableIterator[Any]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: () => IterableIterator[Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.ReadonlyMap<unknown, unknown>> */
  trait ReadonlyReadonlyMapunknow extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[Any, Any]]
    
    def forEach(callbackfn: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit]): Unit
    
    def get(key: Any): js.UndefOr[Any]
    
    def has(key: Any): Boolean
    
    def keys(): IterableIterator[Any]
    
    val size: Double
    
    def values(): IterableIterator[Any]
  }
  object ReadonlyReadonlyMapunknow {
    
    inline def apply(
      entries: () => IterableIterator[js.Tuple2[Any, Any]],
      forEach: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit] => Unit,
      get: Any => js.UndefOr[Any],
      has: Any => Boolean,
      keys: () => IterableIterator[Any],
      size: Double,
      values: () => IterableIterator[Any]
    ): ReadonlyReadonlyMapunknow = {
      val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlyReadonlyMapunknow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyReadonlyMapunknow] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[Any, Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setForEach(value: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setGet(value: Any => js.UndefOr[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: () => IterableIterator[Any]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: () => IterableIterator[Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.ReadonlySet<any>> */
  trait ReadonlyReadonlySetany extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[Any, Any]]
    
    def forEach(callbackfn: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit]): Unit
    
    def has(value: Any): Boolean
    
    def keys(): IterableIterator[Any]
    
    val size: Double
    
    def values(): IterableIterator[Any]
  }
  object ReadonlyReadonlySetany {
    
    inline def apply(
      entries: () => IterableIterator[js.Tuple2[Any, Any]],
      forEach: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit] => Unit,
      has: Any => Boolean,
      keys: () => IterableIterator[Any],
      size: Double,
      values: () => IterableIterator[Any]
    ): ReadonlyReadonlySetany = {
      val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlyReadonlySetany]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyReadonlySetany] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[Any, Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setForEach(value: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: () => IterableIterator[Any]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: () => IterableIterator[Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.ReadonlySet<unknown>> */
  trait ReadonlyReadonlySetunknow extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[Any, Any]]
    
    def forEach(callbackfn: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit]): Unit
    
    def has(value: Any): Boolean
    
    def keys(): IterableIterator[Any]
    
    val size: Double
    
    def values(): IterableIterator[Any]
  }
  object ReadonlyReadonlySetunknow {
    
    inline def apply(
      entries: () => IterableIterator[js.Tuple2[Any, Any]],
      forEach: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit] => Unit,
      has: Any => Boolean,
      keys: () => IterableIterator[Any],
      size: Double,
      values: () => IterableIterator[Any]
    ): ReadonlyReadonlySetunknow = {
      val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlyReadonlySetunknow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyReadonlySetunknow] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[Any, Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setForEach(value: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: () => IterableIterator[Any]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: () => IterableIterator[Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<{  defaultMerge :symbol,   skip :symbol}> */
  trait ReadonlydefaultMergesymbo extends StObject {
    
    val defaultMerge: js.Symbol
    
    val skip: js.Symbol
  }
  object ReadonlydefaultMergesymbo {
    
    inline def apply(defaultMerge: js.Symbol, skip: js.Symbol): ReadonlydefaultMergesymbo = {
      val __obj = js.Dynamic.literal(defaultMerge = defaultMerge.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlydefaultMergesymbo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlydefaultMergesymbo] (val x: Self) extends AnyVal {
      
      inline def setDefaultMerge(value: js.Symbol): Self = StObject.set(x, "defaultMerge", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: js.Symbol): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
}
