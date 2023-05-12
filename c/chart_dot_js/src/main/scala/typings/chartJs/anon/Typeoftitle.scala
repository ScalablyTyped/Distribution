package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoftitle extends StObject {
  
  def color_1(ctx: Any): Any
  
  val display_1: Boolean
  
  val position_1: String
  
  val text: String
}
object Typeoftitle {
  
  inline def apply(color_1: Any => Any, display_1: Boolean, position_1: String, text: String): Typeoftitle = {
    val __obj = js.Dynamic.literal(color_1 = js.Any.fromFunction1(color_1), display_1 = display_1.asInstanceOf[js.Any], position_1 = position_1.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeoftitle] (val x: Self) extends AnyVal {
    
    inline def setColor_1(value: Any => Any): Self = StObject.set(x, "color_1", js.Any.fromFunction1(value))
    
    inline def setDisplay_1(value: Boolean): Self = StObject.set(x, "display_1", value.asInstanceOf[js.Any])
    
    inline def setPosition_1(value: String): Self = StObject.set(x, "position_1", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
