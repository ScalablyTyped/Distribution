package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceCircle extends StObject {
  
  @JSName("$background")
  var $background: String
  
  @JSName("$forceCircle")
  var $forceCircle: Boolean
  
  @JSName("$gridTemplateColumns")
  var $gridTemplateColumns: String
  
  @JSName("$height")
  var $height: Double
  
  @JSName("$type")
  var $type: String
}
object ForceCircle {
  
  inline def apply(
    $background: String,
    $forceCircle: Boolean,
    $gridTemplateColumns: String,
    $height: Double,
    $type: String
  ): ForceCircle = {
    val __obj = js.Dynamic.literal($background = $background.asInstanceOf[js.Any], $forceCircle = $forceCircle.asInstanceOf[js.Any], $gridTemplateColumns = $gridTemplateColumns.asInstanceOf[js.Any], $height = $height.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceCircle]
  }
  
  extension [Self <: ForceCircle](x: Self) {
    
    inline def set$background(value: String): Self = StObject.set(x, "$background", value.asInstanceOf[js.Any])
    
    inline def set$forceCircle(value: Boolean): Self = StObject.set(x, "$forceCircle", value.asInstanceOf[js.Any])
    
    inline def set$gridTemplateColumns(value: String): Self = StObject.set(x, "$gridTemplateColumns", value.asInstanceOf[js.Any])
    
    inline def set$height(value: Double): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
    
    inline def set$type(value: String): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}
