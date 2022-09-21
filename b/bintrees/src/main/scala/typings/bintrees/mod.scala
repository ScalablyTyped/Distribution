package typings.bintrees

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bintrees", "BinTree")
  @js.native
  open class BinTree[T] protected ()
    extends StObject
       with TreeBase[T] {
    def this(comparator: Comparator[T]) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def each(cb: Callback[T]): Unit = js.native
    
    /* CompleteClass */
    override def find(data: T): T | Null = js.native
    
    /* CompleteClass */
    override def findIter(data: T): Iterator[T] | Null = js.native
    
    def insert(item: T): Boolean = js.native
    
    /* CompleteClass */
    override def iterator(): Iterator[T] = js.native
    
    /* CompleteClass */
    override def lowerBound(item: T): Iterator[T] = js.native
    
    /* CompleteClass */
    override def max(): T | Null = js.native
    
    /* CompleteClass */
    override def min(): T | Null = js.native
    
    /* CompleteClass */
    override def reach(cb: Callback[T]): Unit = js.native
    
    def remove(item: T): Boolean = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def upperBound(item: T): Iterator[T] = js.native
  }
  
  @JSImport("bintrees", "RBTree")
  @js.native
  open class RBTree[T] protected ()
    extends StObject
       with TreeBase[T] {
    def this(comparator: Comparator[T]) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def each(cb: Callback[T]): Unit = js.native
    
    /* CompleteClass */
    override def find(data: T): T | Null = js.native
    
    /* CompleteClass */
    override def findIter(data: T): Iterator[T] | Null = js.native
    
    def insert(item: T): Boolean = js.native
    
    /* CompleteClass */
    override def iterator(): Iterator[T] = js.native
    
    /* CompleteClass */
    override def lowerBound(item: T): Iterator[T] = js.native
    
    /* CompleteClass */
    override def max(): T | Null = js.native
    
    /* CompleteClass */
    override def min(): T | Null = js.native
    
    /* CompleteClass */
    override def reach(cb: Callback[T]): Unit = js.native
    
    def remove(item: T): Boolean = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def upperBound(item: T): Iterator[T] = js.native
  }
  
  type Callback[T] = js.Function1[/* item */ T, Unit]
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  trait Iterator[T] extends StObject {
    
    def data(): T | Null
    
    def next(): T | Null
    
    def prev(): T | Null
  }
  object Iterator {
    
    inline def apply[T](data: () => T | Null, next: () => T | Null, prev: () => T | Null): Iterator[T] = {
      val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev))
      __obj.asInstanceOf[Iterator[T]]
    }
    
    extension [Self <: Iterator[?], T](x: Self & Iterator[T]) {
      
      inline def setData(value: () => T | Null): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setNext(value: () => T | Null): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setPrev(value: () => T | Null): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    }
  }
  
  trait TreeBase[T] extends StObject {
    
    def clear(): Unit
    
    def each(cb: Callback[T]): Unit
    
    def find(data: T): T | Null
    
    def findIter(data: T): Iterator[T] | Null
    
    def iterator(): Iterator[T]
    
    def lowerBound(item: T): Iterator[T]
    
    def max(): T | Null
    
    def min(): T | Null
    
    def reach(cb: Callback[T]): Unit
    
    var size: Double
    
    def upperBound(item: T): Iterator[T]
  }
  object TreeBase {
    
    inline def apply[T](
      clear: () => Unit,
      each: Callback[T] => Unit,
      find: T => T | Null,
      findIter: T => Iterator[T] | Null,
      iterator: () => Iterator[T],
      lowerBound: T => Iterator[T],
      max: () => T | Null,
      min: () => T | Null,
      reach: Callback[T] => Unit,
      size: Double,
      upperBound: T => Iterator[T]
    ): TreeBase[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), find = js.Any.fromFunction1(find), findIter = js.Any.fromFunction1(findIter), iterator = js.Any.fromFunction0(iterator), lowerBound = js.Any.fromFunction1(lowerBound), max = js.Any.fromFunction0(max), min = js.Any.fromFunction0(min), reach = js.Any.fromFunction1(reach), size = size.asInstanceOf[js.Any], upperBound = js.Any.fromFunction1(upperBound))
      __obj.asInstanceOf[TreeBase[T]]
    }
    
    extension [Self <: TreeBase[?], T](x: Self & TreeBase[T]) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setEach(value: Callback[T] => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      inline def setFind(value: T => T | Null): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIter(value: T => Iterator[T] | Null): Self = StObject.set(x, "findIter", js.Any.fromFunction1(value))
      
      inline def setIterator(value: () => Iterator[T]): Self = StObject.set(x, "iterator", js.Any.fromFunction0(value))
      
      inline def setLowerBound(value: T => Iterator[T]): Self = StObject.set(x, "lowerBound", js.Any.fromFunction1(value))
      
      inline def setMax(value: () => T | Null): Self = StObject.set(x, "max", js.Any.fromFunction0(value))
      
      inline def setMin(value: () => T | Null): Self = StObject.set(x, "min", js.Any.fromFunction0(value))
      
      inline def setReach(value: Callback[T] => Unit): Self = StObject.set(x, "reach", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUpperBound(value: T => Iterator[T]): Self = StObject.set(x, "upperBound", js.Any.fromFunction1(value))
    }
  }
}
