package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Round extends StObject {
  
  @JSName("$background")
  var $background: String
  
  @JSName("$round")
  var $round: Boolean
  
  @JSName("$size")
  var $size: Double
}
object Round {
  
  inline def apply($background: String, $round: Boolean, $size: Double): Round = {
    val __obj = js.Dynamic.literal($background = $background.asInstanceOf[js.Any], $round = $round.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Round]
  }
  
  extension [Self <: Round](x: Self) {
    
    inline def set$background(value: String): Self = StObject.set(x, "$background", value.asInstanceOf[js.Any])
    
    inline def set$round(value: Boolean): Self = StObject.set(x, "$round", value.asInstanceOf[js.Any])
    
    inline def set$size(value: Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
