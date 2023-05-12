package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflabels extends StObject {
  
  val boxWidth: Double
  
  def color(ctx: Any): Any
  
  def generateLabels(chart: Any): Any
  
  val padding: Double
}
object Typeoflabels {
  
  inline def apply(boxWidth: Double, color: Any => Any, generateLabels: Any => Any, padding: Double): Typeoflabels = {
    val __obj = js.Dynamic.literal(boxWidth = boxWidth.asInstanceOf[js.Any], color = js.Any.fromFunction1(color), generateLabels = js.Any.fromFunction1(generateLabels), padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoflabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeoflabels] (val x: Self) extends AnyVal {
    
    inline def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Any => Any): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
    
    inline def setGenerateLabels(value: Any => Any): Self = StObject.set(x, "generateLabels", js.Any.fromFunction1(value))
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
