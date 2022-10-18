package typings.codemirrorState.mod

import typings.codemirrorState.codemirrorStateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
A range set stores a collection of [ranges](https://codemirror.net/6/docs/ref/#state.Range) in a
way that makes them efficient to [map](https://codemirror.net/6/docs/ref/#state.RangeSet.map) and
[update](https://codemirror.net/6/docs/ref/#state.RangeSet.update). This is an immutable data
structure.
*/
@js.native
trait RangeSet[T /* <: RangeValue */] extends StObject {
  
  /**
    Iterate over the ranges that touch the region `from` to `to`,
    calling `f` for each. There is no guarantee that the ranges will
    be reported in any specific order. When the callback returns
    `false`, iteration stops.
    */
  @JSName("between")
  def between_false(
    from: Double,
    to: Double,
    f: js.Function3[/* from */ Double, /* to */ Double, /* value */ T, Unit | `false`]
  ): Unit = js.native
  
  /**
    Iterate over the ranges in this set, in order, including all
    ranges that end at or after `from`.
    */
  def iter(): RangeCursor[T] = js.native
  def iter(from: Double): RangeCursor[T] = js.native
  
  /**
    Map this range set through a set of changes, return the new set.
    */
  def map(changes: ChangeDesc): RangeSet[T] = js.native
  
  /**
    The number of ranges in the set.
    */
  def size: Double = js.native
  
  /**
    Update the range set, optionally adding new ranges or filtering
    out existing ones.
    
    (Note: The type parameter is just there as a kludge to work
    around TypeScript variance issues that prevented `RangeSet<X>`
    from being a subtype of `RangeSet<Y>` when `X` is a subtype of
    `Y`.)
    */
  def update[U /* <: T */](updateSpec: RangeSetUpdate[U]): RangeSet[T] = js.native
}
