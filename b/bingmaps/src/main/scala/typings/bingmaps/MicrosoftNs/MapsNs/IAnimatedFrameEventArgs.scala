package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimatedFrameEventArgs extends js.Object {
  /** The animated tile layer that the frame belongs to. **/
  var animatedTileLayer: AnimatedTileLayer
  /** The index of the frame being loaded. **/
  var index: Double
}

object IAnimatedFrameEventArgs {
  @scala.inline
  def apply(animatedTileLayer: AnimatedTileLayer, index: Double): IAnimatedFrameEventArgs = {
    val __obj = js.Dynamic.literal(animatedTileLayer = animatedTileLayer, index = index)
  
    __obj.asInstanceOf[IAnimatedFrameEventArgs]
  }
}

