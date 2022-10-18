package typings.baseui.anon

import typings.baseui.mapMarkerTypesMod.LabelEnhancerPosition
import typings.baseui.mapMarkerTypesMod.PinHeadSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stroked extends StObject {
  
  @JSName("$position")
  var $position: LabelEnhancerPosition
  
  @JSName("$size")
  var $size: PinHeadSize
  
  @JSName("$stroked")
  var $stroked: Boolean
}
object Stroked {
  
  inline def apply($position: LabelEnhancerPosition, $size: PinHeadSize, $stroked: Boolean): Stroked = {
    val __obj = js.Dynamic.literal($position = $position.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $stroked = $stroked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stroked]
  }
  
  extension [Self <: Stroked](x: Self) {
    
    inline def set$position(value: LabelEnhancerPosition): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
    
    inline def set$size(value: PinHeadSize): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$stroked(value: Boolean): Self = StObject.set(x, "$stroked", value.asInstanceOf[js.Any])
  }
}
