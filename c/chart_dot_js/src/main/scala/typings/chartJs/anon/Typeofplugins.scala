package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofplugins extends StObject {
  
  val Colors: BeforeLayout
  
  val Decimation: TypeofDecimation
  
  val Filler: TypeofFiller
  
  val Legend: TypeofLegend
  
  val SubTitle: TypeofSubTitle
  
  val Title: TypeofTitle_
  
  val Tooltip: TypeofTooltip
}
object Typeofplugins {
  
  inline def apply(
    Colors: BeforeLayout,
    Decimation: TypeofDecimation,
    Filler: TypeofFiller,
    Legend: TypeofLegend,
    SubTitle: TypeofSubTitle,
    Title: TypeofTitle_,
    Tooltip: TypeofTooltip
  ): Typeofplugins = {
    val __obj = js.Dynamic.literal(Colors = Colors.asInstanceOf[js.Any], Decimation = Decimation.asInstanceOf[js.Any], Filler = Filler.asInstanceOf[js.Any], Legend = Legend.asInstanceOf[js.Any], SubTitle = SubTitle.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Tooltip = Tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofplugins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofplugins] (val x: Self) extends AnyVal {
    
    inline def setColors(value: BeforeLayout): Self = StObject.set(x, "Colors", value.asInstanceOf[js.Any])
    
    inline def setDecimation(value: TypeofDecimation): Self = StObject.set(x, "Decimation", value.asInstanceOf[js.Any])
    
    inline def setFiller(value: TypeofFiller): Self = StObject.set(x, "Filler", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: TypeofLegend): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setSubTitle(value: TypeofSubTitle): Self = StObject.set(x, "SubTitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: TypeofTitle_): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: TypeofTooltip): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
  }
}
