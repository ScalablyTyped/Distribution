package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisGridOptions extends StObject {
  
  /**
    * Show additional grid lines along x axis.
    * If x axis is `category` axis, value can be category name. If x axis is `timeseries` axis, value can be date string, `Date` object and unixtime integer.
    */
  var lines: js.UndefOr[js.Array[GridLineOptions]] = js.native
  
  /**
    * Show grids along an axis.
    */
  var show: js.UndefOr[Boolean] = js.native
  
  /** Not used. */
  var `type`: js.UndefOr[String] = js.native
}
object AxisGridOptions {
  
  @scala.inline
  def apply(): AxisGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisGridOptions]
  }
  
  @scala.inline
  implicit class AxisGridOptionsMutableBuilder[Self <: AxisGridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLines(value: js.Array[GridLineOptions]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setLinesVarargs(value: GridLineOptions*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
