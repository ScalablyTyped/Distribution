package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dragging extends StObject {
  
  @JSName("$dragging")
  var $dragging: Boolean
  
  @JSName("$height")
  var $height: Double
  
  @JSName("$width")
  var $width: Double
}
object Dragging {
  
  inline def apply($dragging: Boolean, $height: Double, $width: Double): Dragging = {
    val __obj = js.Dynamic.literal($dragging = $dragging.asInstanceOf[js.Any], $height = $height.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dragging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dragging] (val x: Self) extends AnyVal {
    
    inline def set$dragging(value: Boolean): Self = StObject.set(x, "$dragging", value.asInstanceOf[js.Any])
    
    inline def set$height(value: Double): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
    
    inline def set$width(value: Double): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
  }
}
