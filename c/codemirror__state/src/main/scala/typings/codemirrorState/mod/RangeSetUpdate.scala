package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSetUpdate[T /* <: RangeValue */] extends StObject {
  
  /**
    An array of ranges to add. If given, this should be sorted by
    `from` position and `startSide` unless
    [`sort`](https://codemirror.net/6/docs/ref/#state.RangeSet.update^updateSpec.sort) is given as
    `true`.
    */
  var add: js.UndefOr[js.Array[Range[T]]] = js.undefined
  
  /**
    Filter the ranges already in the set. Only those for which this
    function returns `true` are kept.
    */
  var filter: js.UndefOr[js.Function3[/* from */ Double, /* to */ Double, /* value */ T, Boolean]] = js.undefined
  
  /**
    Can be used to limit the range on which the filter is
    applied. Filtering only a small range, as opposed to the entire
    set, can make updates cheaper.
    */
  var filterFrom: js.UndefOr[Double] = js.undefined
  
  /**
    The end position to apply the filter to.
    */
  var filterTo: js.UndefOr[Double] = js.undefined
  
  /**
    Indicates whether the library should sort the ranges in `add`.
    Defaults to `false`.
    */
  var sort: js.UndefOr[Boolean] = js.undefined
}
object RangeSetUpdate {
  
  inline def apply[T /* <: RangeValue */](): RangeSetUpdate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSetUpdate[T]]
  }
  
  extension [Self <: RangeSetUpdate[?], T /* <: RangeValue */](x: Self & RangeSetUpdate[T]) {
    
    inline def setAdd(value: js.Array[Range[T]]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAddVarargs(value: Range[T]*): Self = StObject.set(x, "add", js.Array(value*))
    
    inline def setFilter(value: (/* from */ Double, /* to */ Double, /* value */ T) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
    
    inline def setFilterFrom(value: Double): Self = StObject.set(x, "filterFrom", value.asInstanceOf[js.Any])
    
    inline def setFilterFromUndefined: Self = StObject.set(x, "filterFrom", js.undefined)
    
    inline def setFilterTo(value: Double): Self = StObject.set(x, "filterTo", value.asInstanceOf[js.Any])
    
    inline def setFilterToUndefined: Self = StObject.set(x, "filterTo", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
