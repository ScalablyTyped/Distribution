package typings.baseui.anon

import typings.baseui.mapMarkerTypesMod.LabelEnhancerPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOffset extends StObject {
  
  @JSName("$labelOffset")
  var $labelOffset: Double
  
  @JSName("$position")
  var $position: LabelEnhancerPosition
}
object LabelOffset {
  
  inline def apply($labelOffset: Double, $position: LabelEnhancerPosition): LabelOffset = {
    val __obj = js.Dynamic.literal($labelOffset = $labelOffset.asInstanceOf[js.Any], $position = $position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOffset]
  }
  
  extension [Self <: LabelOffset](x: Self) {
    
    inline def set$labelOffset(value: Double): Self = StObject.set(x, "$labelOffset", value.asInstanceOf[js.Any])
    
    inline def set$position(value: LabelEnhancerPosition): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
  }
}
