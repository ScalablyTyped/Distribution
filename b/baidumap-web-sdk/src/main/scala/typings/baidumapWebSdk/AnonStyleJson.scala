package typings.baidumapWebSdk

import typings.baidumapWebSdk.BMap.MapStyleItem
import typings.baidumapWebSdk.BMap.MapStyleV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyleJson extends MapStyleV2 {
  var styleJson: js.Array[MapStyleItem]
}

object AnonStyleJson {
  @scala.inline
  def apply(styleJson: js.Array[MapStyleItem]): AnonStyleJson = {
    val __obj = js.Dynamic.literal(styleJson = styleJson.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStyleJson]
  }
}

