package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILayerMouseEventArgs extends StObject {
  
  /** 
  		* @deprecated use target
  		* The IPrimitive shape (pushpin, polyline, polygon) that the event occurred on. 
  		*/
  var primitive: IPrimitive
}
object ILayerMouseEventArgs {
  
  inline def apply(primitive: IPrimitive): ILayerMouseEventArgs = {
    val __obj = js.Dynamic.literal(primitive = primitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayerMouseEventArgs]
  }
  
  extension [Self <: ILayerMouseEventArgs](x: Self) {
    
    inline def setPrimitive(value: IPrimitive): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
  }
}
