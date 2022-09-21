package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
A range cursor is an object that moves to the next range every
time you call `next` on it. Note that, unlike ES6 iterators, these
start out pointing at the first element, so you should call `next`
only after reading the first range (if any).
*/
trait RangeCursor[T] extends StObject {
  
  /**
    The next range's start position.
    */
  var from: Double
  
  /**
    Move the iterator forward.
    */
  def next(): Unit
  
  /**
    The next end position.
    */
  var to: Double
  
  /**
    The next range's value. Holds `null` when the cursor has reached
    its end.
    */
  var value: T | Null
}
object RangeCursor {
  
  inline def apply[T](from: Double, next: () => Unit, to: Double): RangeCursor[T] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), to = to.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[RangeCursor[T]]
  }
  
  extension [Self <: RangeCursor[?], T](x: Self & RangeCursor[T]) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
