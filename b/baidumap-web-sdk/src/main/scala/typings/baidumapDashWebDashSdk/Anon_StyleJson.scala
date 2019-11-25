package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMap.MapStyleItem
import typings.baidumapDashWebDashSdk.BMap.MapStyleV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StyleJson extends MapStyleV2 {
  var styleJson: js.Array[MapStyleItem]
}

object Anon_StyleJson {
  @scala.inline
  def apply(styleJson: js.Array[MapStyleItem]): Anon_StyleJson = {
    val __obj = js.Dynamic.literal(styleJson = styleJson.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_StyleJson]
  }
}

