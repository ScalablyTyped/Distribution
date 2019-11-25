package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayerMouseEventArgs extends js.Object {
  /** 
  		* @deprecated use target
  		* The IPrimitive shape (pushpin, polyline, polygon) that the event occurred on. 
  		*/
  var primitive: IPrimitive
}

object ILayerMouseEventArgs {
  @scala.inline
  def apply(primitive: IPrimitive): ILayerMouseEventArgs = {
    val __obj = js.Dynamic.literal(primitive = primitive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILayerMouseEventArgs]
  }
}

