package typings.immutableHHD54iTc

import org.scalablytyped.runtime.StringDictionary
import typings.immutableHHD54iTc.Immutable.Iterable
import typings.immutableHHD54iTc.Immutable.Iterable.Indexed
import typings.immutableHHD54iTc.Immutable.Iterable.Keyed
import typings.immutableHHD54iTc.Immutable.Iterable.Set
import typings.immutableHHD54iTc.Immutable.Iterator
import typings.immutableHHD54iTc.Immutable.Record.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Immutable {
    
    @JSGlobal("Immutable")
    @js.native
    val ^ : js.Any = js.native
    
    object Iterable {
      
      inline def apply[T](array: js.Array[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
      inline def apply[T](iterable: /*ES6Iterable<T>*/ js.Object): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
      inline def apply[T](iterator: Iterator[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
      inline def apply[V](obj: StringDictionary[V]): Keyed[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Keyed[String, V]]
      inline def apply[V](value: V): Indexed[V] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Indexed[V]]
      inline def apply[K, V](iterable: typings.immutableHHD54iTc.Immutable.Iterable[K, V]): typings.immutableHHD54iTc.Immutable.Iterable[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable[K, V]]
      
      @JSGlobal("Immutable.Iterable")
      @js.native
      val ^ : js.Any = js.native
      
      inline def Indexed[T](array: js.Array[T]): typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T]]
      inline def Indexed[T](iterable: /*Iterable<T>*/ js.Object): typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T]]
      inline def Indexed[T](iterator: Iterator[T]): typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T]]
      inline def Indexed[T](iter: typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T]): typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T]]
      inline def Indexed[T](iter: Set[T]): typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T]]
      inline def Indexed[K, V](iter: Keyed[K, V]): typings.immutableHHD54iTc.Immutable.Iterable.Indexed[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Indexed[/*[K,V]*/ Any]]
      
      inline def Keyed[V](obj: StringDictionary[V]): typings.immutableHHD54iTc.Immutable.Iterable.Keyed[String, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Keyed[String, V]]
      inline def Keyed[K, V](array: js.Array[/*[K,V]*/ Any]): typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V]]
      inline def Keyed[K, V](iterable: /*Iterable<[K,V]>*/ js.Object): typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V]]
      inline def Keyed[K, V](iterator: Iterator[/*[K,V]*/ Any]): typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V]]
      inline def Keyed[K, V](iter: typings.immutableHHD54iTc.Immutable.Iterable[Any, /*[K,V]*/ Any]): typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V]]
      inline def Keyed[K, V](iter: typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V]): typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V]]
      
      inline def Set[T](array: js.Array[T]): typings.immutableHHD54iTc.Immutable.Iterable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Set[T]]
      inline def Set[T](iterable: /*Iterable<T>*/ js.Object): typings.immutableHHD54iTc.Immutable.Iterable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Set[T]]
      inline def Set[T](iterator: Iterator[T]): typings.immutableHHD54iTc.Immutable.Iterable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Set[T]]
      inline def Set[T](iter: Indexed[T]): typings.immutableHHD54iTc.Immutable.Iterable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Set[T]]
      inline def Set[T](iter: typings.immutableHHD54iTc.Immutable.Iterable.Set[T]): typings.immutableHHD54iTc.Immutable.Iterable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Set[T]]
      inline def Set[K, V](iter: Keyed[K, V]): typings.immutableHHD54iTc.Immutable.Iterable.Set[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Iterable.Set[/*[K,V]*/ Any]]
      
      /**
        * True if `maybeAssociative` is either a keyed or indexed Iterable.
        */
      inline def isAssociative(maybeAssociative: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssociative")(maybeAssociative.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * True if `maybeIndexed` is a Iterable.Indexed, or any of its subclasses.
        */
      inline def isIndexed(maybeIndexed: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(maybeIndexed.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * True if `maybeIterable` is an Iterable, or any of its subclasses.
        */
      inline def isIterable(maybeIterable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(maybeIterable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * True if `maybeKeyed` is an Iterable.Keyed, or any of its subclasses.
        */
      inline def isKeyed(maybeKeyed: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyed")(maybeKeyed.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * True if `maybeOrdered` is an Iterable where iteration order is well
        * defined. True for Iterable.Indexed as well as OrderedMap and OrderedSet.
        */
      inline def isOrdered(maybeOrdered: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrdered")(maybeOrdered.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    object List {
      
      inline def apply[T](): typings.immutableHHD54iTc.Immutable.List[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.immutableHHD54iTc.Immutable.List[T]]
      inline def apply[T](array: js.Array[T]): typings.immutableHHD54iTc.Immutable.List[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.List[T]]
      inline def apply[T](iterable: /*Iterable<T>*/ js.Object): typings.immutableHHD54iTc.Immutable.List[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.List[T]]
      inline def apply[T](iterator: Iterator[T]): typings.immutableHHD54iTc.Immutable.List[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.List[T]]
      inline def apply[T](iter: Indexed[T]): typings.immutableHHD54iTc.Immutable.List[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.List[T]]
      inline def apply[T](iter: Set[T]): typings.immutableHHD54iTc.Immutable.List[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.List[T]]
      inline def apply[K, V](iter: Keyed[K, V]): typings.immutableHHD54iTc.Immutable.List[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.List[/*[K,V]*/ Any]]
      
      @JSGlobal("Immutable.List")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * True if the provided value is a List
        */
      inline def isList(maybeList: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isList")(maybeList.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Creates a new List containing `values`.
        */
      inline def of[T](values: T*): typings.immutableHHD54iTc.Immutable.List[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.immutableHHD54iTc.Immutable.List[T]]
    }
    
    object Map {
      
      inline def apply[V](obj: StringDictionary[V]): typings.immutableHHD54iTc.Immutable.Map[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Map[String, V]]
      inline def apply[K, V](): typings.immutableHHD54iTc.Immutable.Map[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.immutableHHD54iTc.Immutable.Map[K, V]]
      inline def apply[K, V](array: js.Array[/*[K,V]*/ js.Array[Any]]): typings.immutableHHD54iTc.Immutable.Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Map[K, V]]
      inline def apply[K, V](iterable: /*Iterable<[K,V]>*/ js.Object): typings.immutableHHD54iTc.Immutable.Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Map[K, V]]
      inline def apply[K, V](iterator: Iterator[/*[K,V]*/ js.Array[Any]]): typings.immutableHHD54iTc.Immutable.Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Map[K, V]]
      inline def apply[K, V](iter: Iterable[Any, /*[K,V]*/ js.Array[Any]]): typings.immutableHHD54iTc.Immutable.Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Map[K, V]]
      inline def apply[K, V](iter: Keyed[K, V]): typings.immutableHHD54iTc.Immutable.Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Map[K, V]]
      
      @JSGlobal("Immutable.Map")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * True if the provided value is a Map
        */
      inline def isMap(maybeMap: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(maybeMap.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    object OrderedMap {
      
      inline def apply[V](obj: StringDictionary[V]): typings.immutableHHD54iTc.Immutable.OrderedMap[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedMap[String, V]]
      inline def apply[K, V](): typings.immutableHHD54iTc.Immutable.OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedMap[K, V]]
      inline def apply[K, V](array: js.Array[/*[K,V]*/ js.Array[Any]]): typings.immutableHHD54iTc.Immutable.OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedMap[K, V]]
      inline def apply[K, V](iterable: /*Iterable<[K,V]>*/ js.Object): typings.immutableHHD54iTc.Immutable.OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedMap[K, V]]
      inline def apply[K, V](iterator: Iterator[/*[K,V]*/ js.Array[Any]]): typings.immutableHHD54iTc.Immutable.OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedMap[K, V]]
      inline def apply[K, V](iter: Iterable[Any, /*[K,V]*/ js.Array[Any]]): typings.immutableHHD54iTc.Immutable.OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedMap[K, V]]
      inline def apply[K, V](iter: Keyed[K, V]): typings.immutableHHD54iTc.Immutable.OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedMap[K, V]]
      
      @JSGlobal("Immutable.OrderedMap")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * True if the provided value is an OrderedMap.
        */
      inline def isOrderedMap(maybeOrderedMap: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrderedMap")(maybeOrderedMap.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    object OrderedSet {
      
      inline def apply[T](): typings.immutableHHD54iTc.Immutable.OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedSet[T]]
      inline def apply[T](array: js.Array[T]): typings.immutableHHD54iTc.Immutable.OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedSet[T]]
      inline def apply[T](iterable: /*Iterable<T>*/ js.Object): typings.immutableHHD54iTc.Immutable.OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedSet[T]]
      inline def apply[T](iterator: Iterator[T]): typings.immutableHHD54iTc.Immutable.OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedSet[T]]
      inline def apply[T](iter: Indexed[T]): typings.immutableHHD54iTc.Immutable.OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedSet[T]]
      inline def apply[T](iter: Set[T]): typings.immutableHHD54iTc.Immutable.OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedSet[T]]
      inline def apply[K, V](iter: Keyed[K, V]): typings.immutableHHD54iTc.Immutable.OrderedSet[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedSet[/*[K,V]*/ Any]]
      
      @JSGlobal("Immutable.OrderedSet")
      @js.native
      val ^ : js.Any = js.native
      
      inline def fromKeys(obj: StringDictionary[Any]): typings.immutableHHD54iTc.Immutable.OrderedSet[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedSet[String]]
      /**
        * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
        * the keys from this Iterable or JavaScript Object.
        */
      inline def fromKeys[T](iter: Iterable[T, Any]): typings.immutableHHD54iTc.Immutable.OrderedSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedSet[T]]
      
      /**
        * True if the provided value is an OrderedSet.
        */
      inline def isOrderedSet(maybeOrderedSet: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrderedSet")(maybeOrderedSet.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Creates a new OrderedSet containing `values`.
        */
      inline def of[T](values: T*): typings.immutableHHD54iTc.Immutable.OrderedSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.immutableHHD54iTc.Immutable.OrderedSet[T]]
    }
    
    inline def Range(): typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("Range")().asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double]]
    inline def Range(start: Double): typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double]]
    inline def Range(start: Double, end: Double): typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double]]
    inline def Range(start: Double, end: Double, step: Double): typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double]]
    inline def Range(start: Double, end: Unit, step: Double): typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double]]
    inline def Range(start: Unit, end: Double): typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double]]
    inline def Range(start: Unit, end: Double, step: Double): typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double]]
    inline def Range(start: Unit, end: Unit, step: Double): typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[Double]]
    
    inline def Record(defaultValues: StringDictionary[Any]): Class = ^.asInstanceOf[js.Dynamic].applyDynamic("Record")(defaultValues.asInstanceOf[js.Any]).asInstanceOf[Class]
    inline def Record(defaultValues: StringDictionary[Any], name: String): Class = (^.asInstanceOf[js.Dynamic].applyDynamic("Record")(defaultValues.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Class]
    
    inline def Repeat[T](value: T): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Repeat")(value.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
    inline def Repeat[T](value: T, times: Double): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Repeat")(value.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
    
    object Seq {
      
      inline def apply[T](array: js.Array[T]): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
      inline def apply[T](iterable: /*ES6Iterable<T>*/ js.Object): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
      inline def apply[T](iterator: Iterator[T]): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
      inline def apply[V](obj: StringDictionary[V]): typings.immutableHHD54iTc.Immutable.Seq.Keyed[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Keyed[String, V]]
      inline def apply[K, V](): typings.immutableHHD54iTc.Immutable.Seq[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq[K, V]]
      inline def apply[K, V](iterable: Iterable[K, V]): typings.immutableHHD54iTc.Immutable.Seq[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq[K, V]]
      inline def apply[K, V](seq: typings.immutableHHD54iTc.Immutable.Seq[K, V]): typings.immutableHHD54iTc.Immutable.Seq[K, V] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq[K, V]]
      
      @JSGlobal("Immutable.Seq")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * `Seq` which represents an ordered indexed list of values.
        */
      object Indexed {
        
        inline def apply[T](): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
        inline def apply[T](array: js.Array[T]): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
        inline def apply[T](iterable: /*Iterable<T>*/ js.Object): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
        inline def apply[T](iterator: Iterator[T]): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
        inline def apply[T](seq: typings.immutableHHD54iTc.Immutable.Iterable.Indexed[T]): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
        inline def apply[T](seq: Set[T]): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
        inline def apply[K, V](seq: Keyed[K, V]): typings.immutableHHD54iTc.Immutable.Seq.Indexed[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[/*[K,V]*/ Any]]
        
        @JSGlobal("Immutable.Seq.Indexed")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Provides an Seq.Indexed of the values provided.
          */
        inline def of[T](values: T*): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
      }
      
      inline def Keyed[V](obj: StringDictionary[V]): typings.immutableHHD54iTc.Immutable.Seq.Keyed[String, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Keyed[String, V]]
      inline def Keyed[K, V](): typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")().asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V]]
      inline def Keyed[K, V](array: js.Array[/*[K,V]*/ Any]): typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V]]
      inline def Keyed[K, V](iterable: /*Iterable<[K,V]>*/ js.Object): typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V]]
      inline def Keyed[K, V](iterator: Iterator[/*[K,V]*/ Any]): typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V]]
      inline def Keyed[K, V](seq: Iterable[Any, /*[K,V]*/ Any]): typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(seq.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V]]
      inline def Keyed[K, V](seq: typings.immutableHHD54iTc.Immutable.Iterable.Keyed[K, V]): typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(seq.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Keyed[K, V]]
      
      object Set {
        
        inline def apply[T](): typings.immutableHHD54iTc.Immutable.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Set[T]]
        inline def apply[T](array: js.Array[T]): typings.immutableHHD54iTc.Immutable.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Set[T]]
        inline def apply[T](iterable: /*Iterable<T>*/ js.Object): typings.immutableHHD54iTc.Immutable.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Set[T]]
        inline def apply[T](iterator: Iterator[T]): typings.immutableHHD54iTc.Immutable.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Set[T]]
        inline def apply[T](seq: Indexed[T]): typings.immutableHHD54iTc.Immutable.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Set[T]]
        inline def apply[T](seq: typings.immutableHHD54iTc.Immutable.Iterable.Set[T]): typings.immutableHHD54iTc.Immutable.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Set[T]]
        inline def apply[K, V](seq: Keyed[K, V]): typings.immutableHHD54iTc.Immutable.Seq.Set[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Set[/*[K,V]*/ Any]]
        
        @JSGlobal("Immutable.Seq.Set")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Returns a Seq.Set of the provided values
          */
        inline def of[T](values: T*): typings.immutableHHD54iTc.Immutable.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Set[T]]
      }
      
      /**
        * True if `maybeSeq` is a Seq, it is not backed by a concrete
        * structure such as Map, List, or Set.
        */
      inline def isSeq(maybeSeq: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSeq")(maybeSeq.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns a Seq of the values provided. Alias for `Seq.Indexed.of()`.
        */
      inline def of[T](values: T*): typings.immutableHHD54iTc.Immutable.Seq.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[typings.immutableHHD54iTc.Immutable.Seq.Indexed[T]]
    }
    
    object Set {
      
      inline def apply[T](): typings.immutableHHD54iTc.Immutable.Set[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.immutableHHD54iTc.Immutable.Set[T]]
      inline def apply[T](array: js.Array[T]): typings.immutableHHD54iTc.Immutable.Set[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Set[T]]
      inline def apply[T](iterable: /*Iterable<T>*/ js.Object): typings.immutableHHD54iTc.Immutable.Set[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Set[T]]
      inline def apply[T](iterator: Iterator[T]): typings.immutableHHD54iTc.Immutable.Set[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Set[T]]
      inline def apply[T](iter: Indexed[T]): typings.immutableHHD54iTc.Immutable.Set[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Set[T]]
      inline def apply[T](iter: typings.immutableHHD54iTc.Immutable.Iterable.Set[T]): typings.immutableHHD54iTc.Immutable.Set[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Set[T]]
      inline def apply[K, V](iter: Keyed[K, V]): typings.immutableHHD54iTc.Immutable.Set[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Set[/*[K,V]*/ Any]]
      
      @JSGlobal("Immutable.Set")
      @js.native
      val ^ : js.Any = js.native
      
      inline def fromKeys(obj: StringDictionary[Any]): typings.immutableHHD54iTc.Immutable.Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Set[String]]
      /**
        * `Set.fromKeys()` creates a new immutable Set containing the keys from
        * this Iterable or JavaScript Object.
        */
      inline def fromKeys[T](iter: Iterable[T, Any]): typings.immutableHHD54iTc.Immutable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Set[T]]
      
      /**
        * True if the provided value is a Set
        */
      inline def isSet(maybeSet: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(maybeSet.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Creates a new Set containing `values`.
        */
      inline def of[T](values: T*): typings.immutableHHD54iTc.Immutable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.immutableHHD54iTc.Immutable.Set[T]]
    }
    
    object Stack {
      
      inline def apply[T](): typings.immutableHHD54iTc.Immutable.Stack[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.immutableHHD54iTc.Immutable.Stack[T]]
      inline def apply[T](array: js.Array[T]): typings.immutableHHD54iTc.Immutable.Stack[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Stack[T]]
      inline def apply[T](iterable: /*Iterable<T>*/ js.Object): typings.immutableHHD54iTc.Immutable.Stack[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Stack[T]]
      inline def apply[T](iterator: Iterator[T]): typings.immutableHHD54iTc.Immutable.Stack[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Stack[T]]
      inline def apply[T](iter: Indexed[T]): typings.immutableHHD54iTc.Immutable.Stack[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Stack[T]]
      inline def apply[T](iter: Set[T]): typings.immutableHHD54iTc.Immutable.Stack[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Stack[T]]
      inline def apply[K, V](iter: Keyed[K, V]): typings.immutableHHD54iTc.Immutable.Stack[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.immutableHHD54iTc.Immutable.Stack[/*[K,V]*/ Any]]
      
      @JSGlobal("Immutable.Stack")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * True if the provided value is a Stack
        */
      inline def isStack(maybeStack: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStack")(maybeStack.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Creates a new Stack containing `values`.
        */
      inline def of[T](values: T*): typings.immutableHHD54iTc.Immutable.Stack[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.immutableHHD54iTc.Immutable.Stack[T]]
    }
    
    inline def fromJS(json: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJS")(json.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def fromJS(json: Any, reviver: js.Function2[/* k */ Any, /* v */ Iterable[Any, Any], Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJS")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def is(first: Any, second: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
