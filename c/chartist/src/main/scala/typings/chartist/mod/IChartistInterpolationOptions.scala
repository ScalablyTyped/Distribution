package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartistInterpolationOptions extends StObject {
  
  var fillHoles: js.UndefOr[Boolean] = js.undefined
}
object IChartistInterpolationOptions {
  
  @scala.inline
  def apply(): IChartistInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistInterpolationOptions]
  }
  
  @scala.inline
  implicit class IChartistInterpolationOptionsMutableBuilder[Self <: IChartistInterpolationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillHoles(value: Boolean): Self = StObject.set(x, "fillHoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillHolesUndefined: Self = StObject.set(x, "fillHoles", js.undefined)
  }
}
