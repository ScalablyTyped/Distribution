package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filters extends StObject {
  
  def HierarchyFilter(path: String): Filter = js.native
  
  def RangedFilter(low: Double, high: Double): Filter = js.native
  
  def RangedTwoDimensionalFilter(arr: js.Array[js.Array[Double]]): Filter = js.native
  
  def TwoDimensionalFilter(filter: js.Array[Double]): Filter = js.native
}
object Filters {
  
  @scala.inline
  def apply(
    HierarchyFilter: String => Filter,
    RangedFilter: (Double, Double) => Filter,
    RangedTwoDimensionalFilter: js.Array[js.Array[Double]] => Filter,
    TwoDimensionalFilter: js.Array[Double] => Filter
  ): Filters = {
    val __obj = js.Dynamic.literal(HierarchyFilter = js.Any.fromFunction1(HierarchyFilter), RangedFilter = js.Any.fromFunction2(RangedFilter), RangedTwoDimensionalFilter = js.Any.fromFunction1(RangedTwoDimensionalFilter), TwoDimensionalFilter = js.Any.fromFunction1(TwoDimensionalFilter))
    __obj.asInstanceOf[Filters]
  }
  
  @scala.inline
  implicit class FiltersMutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHierarchyFilter(value: String => Filter): Self = StObject.set(x, "HierarchyFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRangedFilter(value: (Double, Double) => Filter): Self = StObject.set(x, "RangedFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRangedTwoDimensionalFilter(value: js.Array[js.Array[Double]] => Filter): Self = StObject.set(x, "RangedTwoDimensionalFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTwoDimensionalFilter(value: js.Array[Double] => Filter): Self = StObject.set(x, "TwoDimensionalFilter", js.Any.fromFunction1(value))
  }
}
