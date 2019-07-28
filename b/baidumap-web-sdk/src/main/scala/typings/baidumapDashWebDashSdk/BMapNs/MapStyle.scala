package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStyle extends js.Object {
  var features: js.Array[_]
  var style: String
}

object MapStyle {
  @scala.inline
  def apply(features: js.Array[_], style: String): MapStyle = {
    val __obj = js.Dynamic.literal(features = features, style = style)
  
    __obj.asInstanceOf[MapStyle]
  }
}

