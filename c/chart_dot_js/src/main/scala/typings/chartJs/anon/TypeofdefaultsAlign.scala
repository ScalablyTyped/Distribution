package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdefaultsAlign extends StObject {
  
  val align: String
  
  val display: Boolean
  
  val fullSize: Boolean
  
  val labels: Typeoflabels
  
  def onClick(e: Any, legendItem: Any, legend: Any): Unit
  
  val onHover: Any
  
  val onLeave: Any
  
  val position: String
  
  val reverse: Boolean
  
  val title: Typeoftitle
  
  val weight: Double
}
object TypeofdefaultsAlign {
  
  inline def apply(
    align: String,
    display: Boolean,
    fullSize: Boolean,
    labels: Typeoflabels,
    onClick: (Any, Any, Any) => Unit,
    onHover: Any,
    onLeave: Any,
    position: String,
    reverse: Boolean,
    title: Typeoftitle,
    weight: Double
  ): TypeofdefaultsAlign = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], fullSize = fullSize.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], onClick = js.Any.fromFunction3(onClick), onHover = onHover.asInstanceOf[js.Any], onLeave = onLeave.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdefaultsAlign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofdefaultsAlign] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFullSize(value: Boolean): Self = StObject.set(x, "fullSize", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: Typeoflabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
    
    inline def setOnHover(value: Any): Self = StObject.set(x, "onHover", value.asInstanceOf[js.Any])
    
    inline def setOnLeave(value: Any): Self = StObject.set(x, "onLeave", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Typeoftitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
