package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowHideOptions extends StObject {
  
  /** Controls whether the legend will be shown or hidden along with the data. */
  var withLegend: js.UndefOr[Boolean] = js.undefined
}
object ShowHideOptions {
  
  inline def apply(): ShowHideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowHideOptions]
  }
  
  extension [Self <: ShowHideOptions](x: Self) {
    
    inline def setWithLegend(value: Boolean): Self = StObject.set(x, "withLegend", value.asInstanceOf[js.Any])
    
    inline def setWithLegendUndefined: Self = StObject.set(x, "withLegend", js.undefined)
  }
}
