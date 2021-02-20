package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILayerMouseEventArgs extends StObject {
  
  /** 
  		* @deprecated use target
  		* The IPrimitive shape (pushpin, polyline, polygon) that the event occurred on. 
  		*/
  var primitive: IPrimitive = js.native
}
object ILayerMouseEventArgs {
  
  @scala.inline
  def apply(primitive: IPrimitive): ILayerMouseEventArgs = {
    val __obj = js.Dynamic.literal(primitive = primitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayerMouseEventArgs]
  }
  
  @scala.inline
  implicit class ILayerMouseEventArgsMutableBuilder[Self <: ILayerMouseEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimitive(value: IPrimitive): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
  }
}
