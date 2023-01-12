package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Methods used when iterating over the spans created by a set of
ranges. The entire iterated range will be covered with either
`span` or `point` calls.
*/
trait SpanIterator[T /* <: RangeValue */] extends StObject {
  
  /**
    Called when going over a point decoration. The active range
    decorations that cover the point and have a higher precedence
    are provided in `active`. The open count in `openStart` counts
    the number of those ranges that started before the point and. If
    the point started before the iterated range, `openStart` will be
    `active.length + 1` to signal this.
    */
  def point(from: Double, to: Double, value: T, active: js.Array[T], openStart: Double, index: Double): Unit
  
  /**
    Called for any ranges not covered by point decorations. `active`
    holds the values that the range is marked with (and may be
    empty). `openStart` indicates how many of those ranges are open
    (continued) at the start of the span.
    */
  def span(from: Double, to: Double, active: js.Array[T], openStart: Double): Unit
}
object SpanIterator {
  
  inline def apply[T /* <: RangeValue */](
    point: (Double, Double, T, js.Array[T], Double, Double) => Unit,
    span: (Double, Double, js.Array[T], Double) => Unit
  ): SpanIterator[T] = {
    val __obj = js.Dynamic.literal(point = js.Any.fromFunction6(point), span = js.Any.fromFunction4(span))
    __obj.asInstanceOf[SpanIterator[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpanIterator[?], T /* <: RangeValue */] (val x: Self & SpanIterator[T]) extends AnyVal {
    
    inline def setPoint(value: (Double, Double, T, js.Array[T], Double, Double) => Unit): Self = StObject.set(x, "point", js.Any.fromFunction6(value))
    
    inline def setSpan(value: (Double, Double, js.Array[T], Double) => Unit): Self = StObject.set(x, "span", js.Any.fromFunction4(value))
  }
}
