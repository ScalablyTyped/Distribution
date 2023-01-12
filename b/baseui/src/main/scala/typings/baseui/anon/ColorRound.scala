package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorRound extends StObject {
  
  @JSName("$color")
  var $color: String
  
  @JSName("$round")
  var $round: Boolean
  
  @JSName("$size")
  var $size: Double
}
object ColorRound {
  
  inline def apply($color: String, $round: Boolean, $size: Double): ColorRound = {
    val __obj = js.Dynamic.literal($color = $color.asInstanceOf[js.Any], $round = $round.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorRound]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorRound] (val x: Self) extends AnyVal {
    
    inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$round(value: Boolean): Self = StObject.set(x, "$round", value.asInstanceOf[js.Any])
    
    inline def set$size(value: Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
