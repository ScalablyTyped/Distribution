package typings.canvasjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAxisYOptions
  extends StObject
     with ChartAxisXOptions {
  
  /**
    * When includeZero is set to true, axisY sets the range in such a way that Zero is a part of it. It is set to true by default.
    * But, whenever y values are very big and difference among dataPoints are hard to judge,
    * setting includeZero to false makes axisY to set a range that makes the differences prominently visible.
    * Default: true
    * Example: true, false
    */
  var includeZero: js.UndefOr[Boolean] = js.undefined
}
object ChartAxisYOptions {
  
  @scala.inline
  def apply(): ChartAxisYOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisYOptions]
  }
  
  @scala.inline
  implicit class ChartAxisYOptionsMutableBuilder[Self <: ChartAxisYOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeZero(value: Boolean): Self = StObject.set(x, "includeZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeZeroUndefined: Self = StObject.set(x, "includeZero", js.undefined)
  }
}
