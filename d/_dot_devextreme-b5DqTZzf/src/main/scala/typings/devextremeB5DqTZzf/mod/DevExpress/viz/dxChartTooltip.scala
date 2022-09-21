package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.edge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartTooltip
  extends StObject
     with BaseChartTooltip {
  
  /**
    * Specifies whether the tooltip must be located in the center of a series point or on its edge. Applies to bar-like and bubble series only.
    */
  var location: js.UndefOr[center | edge] = js.undefined
}
object dxChartTooltip {
  
  inline def apply(): dxChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartTooltip]
  }
  
  extension [Self <: dxChartTooltip](x: Self) {
    
    inline def setLocation(value: center | edge): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
