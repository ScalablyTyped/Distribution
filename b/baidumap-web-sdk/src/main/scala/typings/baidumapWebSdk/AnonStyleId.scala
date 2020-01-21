package typings.baidumapWebSdk

import typings.baidumapWebSdk.BMap.MapStyleV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyleId extends MapStyleV2 {
  var styleId: String
}

object AnonStyleId {
  @scala.inline
  def apply(styleId: String): AnonStyleId = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStyleId]
  }
}

