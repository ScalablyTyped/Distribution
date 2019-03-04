package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimatedFrameEventArgs extends js.Object {
  /** The animated tile layer that the frame belongs to. **/
  var animatedTileLayer: AnimatedTileLayer
  /** The index of the frame being loaded. **/
  var index: scala.Double
}

object IAnimatedFrameEventArgs {
  @scala.inline
  def apply(animatedTileLayer: AnimatedTileLayer, index: scala.Double): IAnimatedFrameEventArgs = {
    val __obj = js.Dynamic.literal(animatedTileLayer = animatedTileLayer, index = index)
  
    __obj.asInstanceOf[IAnimatedFrameEventArgs]
  }
}

