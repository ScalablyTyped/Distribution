package typings.bingmaps.Microsoft.Maps

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
    val __obj = js.Dynamic.literal(animatedTileLayer = animatedTileLayer.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAnimatedFrameEventArgs]
  }
}

