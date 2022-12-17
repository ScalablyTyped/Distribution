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
@JSImport("@codemirror/state", "RangeSet")
@js.native
/* private */ open class RangeSet[T /* <: RangeValue */] () extends StObject {
  
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
object RangeSet {
  
  @JSImport("@codemirror/state", "RangeSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Iterate over two groups of sets, calling methods on `comparator`
    to notify it of possible differences.
    */
  /* static member */
  inline def compare[T /* <: RangeValue */](
    oldSets: js.Array[RangeSet[T]],
    newSets: js.Array[RangeSet[T]],
    /**
    This indicates how the underlying data changed between these
    ranges, and is needed to synchronize the iteration. `from` and
    `to` are coordinates in the _new_ space, after these changes.
    */
  textDiff: ChangeDesc,
    comparator: RangeComparator[T]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(oldSets.asInstanceOf[js.Any], newSets.asInstanceOf[js.Any], textDiff.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare[T /* <: RangeValue */](
    oldSets: js.Array[RangeSet[T]],
    newSets: js.Array[RangeSet[T]],
    /**
    This indicates how the underlying data changed between these
    ranges, and is needed to synchronize the iteration. `from` and
    `to` are coordinates in the _new_ space, after these changes.
    */
  textDiff: ChangeDesc,
    comparator: RangeComparator[T],
    /**
    Can be used to ignore all non-point ranges, and points below
    the given size. When -1, all ranges are compared.
    */
  minPointSize: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(oldSets.asInstanceOf[js.Any], newSets.asInstanceOf[js.Any], textDiff.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any], minPointSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    The empty set of ranges.
    */
  /* static member */
  @JSImport("@codemirror/state", "RangeSet.empty")
  @js.native
  def empty: RangeSet[Any] = js.native
  inline def empty_=(x: RangeSet[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  
  /**
    Compare the contents of two groups of range sets, returning true
    if they are equivalent in the given range.
    */
  /* static member */
  inline def eq_[T /* <: RangeValue */](oldSets: js.Array[RangeSet[T]], newSets: js.Array[RangeSet[T]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(oldSets.asInstanceOf[js.Any], newSets.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_[T /* <: RangeValue */](oldSets: js.Array[RangeSet[T]], newSets: js.Array[RangeSet[T]], from: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(oldSets.asInstanceOf[js.Any], newSets.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_[T /* <: RangeValue */](oldSets: js.Array[RangeSet[T]], newSets: js.Array[RangeSet[T]], from: Double, to: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(oldSets.asInstanceOf[js.Any], newSets.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_[T /* <: RangeValue */](oldSets: js.Array[RangeSet[T]], newSets: js.Array[RangeSet[T]], from: Unit, to: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(oldSets.asInstanceOf[js.Any], newSets.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    Iterate over the ranges in a collection of sets, in order,
    starting from `from`.
    */
  /* static member */
  inline def iter[T /* <: RangeValue */](sets: js.Array[RangeSet[T]]): RangeCursor[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iter")(sets.asInstanceOf[js.Any]).asInstanceOf[RangeCursor[T]]
  inline def iter[T /* <: RangeValue */](sets: js.Array[RangeSet[T]], from: Double): RangeCursor[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("iter")(sets.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[RangeCursor[T]]
  
  /**
    Create a range set for the given range or array of ranges. By
    default, this expects the ranges to be _sorted_ (by start
    position and, if two start at the same position,
    `value.startSide`). You can pass `true` as second argument to
    cause the method to sort them.
    */
  /* static member */
  inline def of[T /* <: RangeValue */](ranges: js.Array[Range[T]]): RangeSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(ranges.asInstanceOf[js.Any]).asInstanceOf[RangeSet[T]]
  inline def of[T /* <: RangeValue */](ranges: js.Array[Range[T]], sort: Boolean): RangeSet[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(ranges.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[RangeSet[T]]
  inline def of[T /* <: RangeValue */](ranges: Range[T]): RangeSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(ranges.asInstanceOf[js.Any]).asInstanceOf[RangeSet[T]]
  inline def of[T /* <: RangeValue */](ranges: Range[T], sort: Boolean): RangeSet[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(ranges.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[RangeSet[T]]
  
  /**
    Iterate over a group of range sets at the same time, notifying
    the iterator about the ranges covering every given piece of
    content. Returns the open count (see
    [`SpanIterator.span`](https://codemirror.net/6/docs/ref/#state.SpanIterator.span)) at the end
    of the iteration.
    */
  /* static member */
  inline def spans[T /* <: RangeValue */](sets: js.Array[RangeSet[T]], from: Double, to: Double, iterator: SpanIterator[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("spans")(sets.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def spans[T /* <: RangeValue */](
    sets: js.Array[RangeSet[T]],
    from: Double,
    to: Double,
    iterator: SpanIterator[T],
    /**
    When given and greater than -1, only points of at least this
    size are taken into account.
    */
  minPointSize: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("spans")(sets.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], minPointSize.asInstanceOf[js.Any])).asInstanceOf[Double]
}
