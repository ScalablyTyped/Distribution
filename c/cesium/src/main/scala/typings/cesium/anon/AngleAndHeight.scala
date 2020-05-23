package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngleAndHeight extends js.Object {
  var angleAndHeight: EndPosition
  var distance: EndPosition
}

object AngleAndHeight {
  @scala.inline
  def apply(angleAndHeight: EndPosition, distance: EndPosition): AngleAndHeight = {
    val __obj = js.Dynamic.literal(angleAndHeight = angleAndHeight.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleAndHeight]
  }
}

