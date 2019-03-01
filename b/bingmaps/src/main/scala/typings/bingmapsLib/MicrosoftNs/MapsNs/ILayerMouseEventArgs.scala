package typings
package bingmapsLib.MicrosoftNs.MapsNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("primitive")(primitive)
    __obj.asInstanceOf[ILayerMouseEventArgs]
  }
}

