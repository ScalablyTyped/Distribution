package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimatedFrameEventArgs extends StObject {
  
  /** The animated tile layer that the frame belongs to. **/
  var animatedTileLayer: AnimatedTileLayer
  
  /** The index of the frame being loaded. **/
  var index: Double
}
object IAnimatedFrameEventArgs {
  
  inline def apply(animatedTileLayer: AnimatedTileLayer, index: Double): IAnimatedFrameEventArgs = {
    val __obj = js.Dynamic.literal(animatedTileLayer = animatedTileLayer.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimatedFrameEventArgs]
  }
  
  extension [Self <: IAnimatedFrameEventArgs](x: Self) {
    
    inline def setAnimatedTileLayer(value: AnimatedTileLayer): Self = StObject.set(x, "animatedTileLayer", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
