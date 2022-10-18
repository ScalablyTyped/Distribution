package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Round extends StObject {
  
  @JSName("$color")
  var $color: String
  
  @JSName("$round")
  var $round: Boolean
  
  @JSName("$size")
  var $size: Double
}
object Round {
  
  inline def apply($color: String, $round: Boolean, $size: Double): Round = {
    val __obj = js.Dynamic.literal($color = $color.asInstanceOf[js.Any], $round = $round.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Round]
  }
  
  extension [Self <: Round](x: Self) {
    
    inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$round(value: Boolean): Self = StObject.set(x, "$round", value.asInstanceOf[js.Any])
    
    inline def set$size(value: Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
