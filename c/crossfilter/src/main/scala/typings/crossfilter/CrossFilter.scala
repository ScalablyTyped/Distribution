package typings.crossfilter

import typings.crossfilter.anon.By
import typings.crossfilter.anon.Call
import typings.crossfilter.anon.CallArrayLoHi
import typings.crossfilter.anon.CallBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CrossFilter {
  
  type Bisection[T, U] = js.Function4[/* array */ js.Array[T], /* value */ U, /* lo */ Double, /* hi */ Double, Double]
  
  @js.native
  trait Bisector[T, U] extends Bisection[T, U] {
    
    def left(array: js.Array[T], value: U, lo: Double, hi: Double): Double = js.native
    @JSName("left")
    var left_Original: Bisection[T, U] = js.native
    
    def right(array: js.Array[T], value: U, lo: Double, hi: Double): Double = js.native
    @JSName("right")
    var right_Original: Bisection[T, U] = js.native
  }
  
  @js.native
  trait CrossFilter[T] extends StObject {
    
    def GroupAll(): typings.crossfilter.CrossFilter.GroupAll[T, T] = js.native
    
    def add(records: js.Array[T]): typings.crossfilter.CrossFilter.CrossFilter[T] = js.native
    
    def dimension[TDimension](value: js.Function1[/* data */ T, TDimension]): Dimension[T, TDimension] = js.native
    
    def groupAll[TValue](): GroupAll[T, TValue] = js.native
    
    def remove(): typings.crossfilter.CrossFilter.CrossFilter[T] = js.native
    
    def size(): Double = js.native
  }
  object CrossFilter {
    
    @scala.inline
    def apply[T](
      GroupAll: () => GroupAll[T, T],
      add: js.Array[T] => typings.crossfilter.CrossFilter.CrossFilter[T],
      dimension: js.Function1[/* data */ T, js.Any] => Dimension[T, js.Any],
      groupAll: () => GroupAll[T, js.Any],
      remove: () => typings.crossfilter.CrossFilter.CrossFilter[T],
      size: () => Double
    ): typings.crossfilter.CrossFilter.CrossFilter[T] = {
      val __obj = js.Dynamic.literal(GroupAll = js.Any.fromFunction0(GroupAll), add = js.Any.fromFunction1(add), dimension = js.Any.fromFunction1(dimension), groupAll = js.Any.fromFunction0(groupAll), remove = js.Any.fromFunction0(remove), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[typings.crossfilter.CrossFilter.CrossFilter[T]]
    }
    
    @scala.inline
    implicit class CrossFilterMutableBuilder[Self <: typings.crossfilter.CrossFilter.CrossFilter[_], T] (val x: Self with typings.crossfilter.CrossFilter.CrossFilter[T]) extends AnyVal {
      
      @scala.inline
      def setAdd(value: js.Array[T] => typings.crossfilter.CrossFilter.CrossFilter[T]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDimension(value: js.Function1[/* data */ T, js.Any] => Dimension[T, js.Any]): Self = StObject.set(x, "dimension", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupAll(value: () => GroupAll[T, T]): Self = StObject.set(x, "GroupAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: () => typings.crossfilter.CrossFilter.CrossFilter[T]): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CrossFilterStatic extends StObject {
    
    def apply[T](data: js.Array[T]): typings.crossfilter.CrossFilter.CrossFilter[T] = js.native
    
    def bisect[T](array: js.Array[T], value: T, lo: Double, hi: Double): Double = js.native
    @JSName("bisect")
    var bisect_Original: Call = js.native
    
    def heap[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
    @JSName("heap")
    var heap_Original: By = js.native
    
    def heapselect[T](array: js.Array[T], lo: Double, hi: Double, k: Double): js.Array[T] = js.native
    @JSName("heapselect")
    var heapselect_Original: CallBy = js.native
    
    def insertionsort[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
    @JSName("insertionsort")
    var insertionsort_Original: CallArrayLoHi = js.native
    
    def permute[T](array: js.Array[T], index: js.Array[Double]): js.Array[T] = js.native
    
    def quicksort[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
    @JSName("quicksort")
    var quicksort_Original: CallArrayLoHi = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait Dimension[T, TDimension] extends StObject {
    
    def bottom(k: Double): js.Array[T] = js.native
    
    def dispose(): Unit = js.native
    
    def filter(value: TDimension): Dimension[T, TDimension] = js.native
    def filter(value: js.Array[TDimension]): Dimension[T, TDimension] = js.native
    def filter(value: Selector[TDimension]): Dimension[T, TDimension] = js.native
    
    def filterAll(): Dimension[T, TDimension] = js.native
    
    def filterExact(value: TDimension): Dimension[T, TDimension] = js.native
    
    def filterFunction(value: Selector[TDimension]): Dimension[T, TDimension] = js.native
    
    def filterRange(value: js.Array[TDimension]): Dimension[T, TDimension] = js.native
    
    def group(): Group[T, TDimension, TDimension] = js.native
    def group[TGroup](groupValue: js.Function1[/* data */ TDimension, TGroup]): Group[T, TDimension, TGroup] = js.native
    
    def groupAll(): GroupAll[T, T] = js.native
    @JSName("groupAll")
    def groupAll_TValue[TValue](): GroupAll[T, TValue] = js.native
    
    def top(k: Double): js.Array[T] = js.native
  }
  
  @js.native
  trait Group[T, TKey, TValue] extends StObject {
    
    def all(): js.Array[Grouping[TKey, TValue]] = js.native
    
    def dispose(): Group[T, TKey, TValue] = js.native
    
    def order(): Group[T, TKey, TValue] = js.native
    def order(value: Selector[TValue]): Group[T, TKey, TValue] = js.native
    
    def orderNatural(): Group[T, TKey, TValue] = js.native
    
    def reduce[TGroup](
      add: js.Function2[/* p */ TGroup, /* v */ T, TGroup],
      remove: js.Function2[/* p */ TGroup, /* v */ T, TGroup],
      initial: js.Function0[TGroup]
    ): Group[T, TKey, TGroup] = js.native
    
    def reduceCount(): Group[T, TKey, Double] = js.native
    
    def reduceSum[TGroup](value: js.Function1[/* data */ T, TGroup]): Group[T, TKey, TGroup] = js.native
    
    def size(): Double = js.native
    
    def top(k: Double): js.Array[Grouping[TKey, TValue]] = js.native
  }
  
  @js.native
  trait GroupAll[T, TValue] extends StObject {
    
    def dispose(): GroupAll[T, TValue] = js.native
    
    def reduce[TValue](
      add: js.Function2[/* p */ TValue, /* v */ T, TValue],
      remove: js.Function2[/* p */ TValue, /* v */ T, TValue],
      initial: js.Function0[TValue]
    ): GroupAll[T, TValue] = js.native
    
    def reduceCount(): GroupAll[T, TValue] = js.native
    
    def reduceSum(value: Selector[T]): GroupAll[T, TValue] = js.native
    
    def value(): TValue = js.native
  }
  object GroupAll {
    
    @scala.inline
    def apply[T, TValue](
      dispose: () => GroupAll[T, TValue],
      reduce: (js.Function2[js.Any, /* v */ T, js.Any], js.Function2[js.Any, /* v */ T, js.Any], js.Function0[js.Any]) => GroupAll[T, js.Any],
      reduceCount: () => GroupAll[T, TValue],
      reduceSum: Selector[T] => GroupAll[T, TValue],
      value: () => TValue
    ): GroupAll[T, TValue] = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), reduce = js.Any.fromFunction3(reduce), reduceCount = js.Any.fromFunction0(reduceCount), reduceSum = js.Any.fromFunction1(reduceSum), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[GroupAll[T, TValue]]
    }
    
    @scala.inline
    implicit class GroupAllMutableBuilder[Self <: GroupAll[_, _], T, TValue] (val x: Self with (GroupAll[T, TValue])) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => GroupAll[T, TValue]): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReduce(
        value: (js.Function2[js.Any, /* v */ T, js.Any], js.Function2[js.Any, /* v */ T, js.Any], js.Function0[js.Any]) => GroupAll[T, js.Any]
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReduceCount(value: () => GroupAll[T, TValue]): Self = StObject.set(x, "reduceCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReduceSum(value: Selector[T] => GroupAll[T, TValue]): Self = StObject.set(x, "reduceSum", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: () => TValue): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Grouping[TKey, TValue] extends StObject {
    
    var key: TKey = js.native
    
    var value: TValue = js.native
  }
  object Grouping {
    
    @scala.inline
    def apply[TKey, TValue](key: TKey, value: TValue): Grouping[TKey, TValue] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grouping[TKey, TValue]]
    }
    
    @scala.inline
    implicit class GroupingMutableBuilder[Self <: Grouping[_, _], TKey, TValue] (val x: Self with (Grouping[TKey, TValue])) extends AnyVal {
      
      @scala.inline
      def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Heap[T] extends StObject {
    
    def apply(array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
    
    def sort(array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  }
  
  type HeapSelect[T] = js.Function4[/* array */ js.Array[T], /* lo */ Double, /* hi */ Double, /* k */ Double, js.Array[T]]
  
  type Selector[T] = js.Function1[/* value */ T, js.Any]
  
  type Sort[T] = js.Function3[/* array */ js.Array[T], /* lo */ Double, /* hi */ Double, js.Array[T]]
}
