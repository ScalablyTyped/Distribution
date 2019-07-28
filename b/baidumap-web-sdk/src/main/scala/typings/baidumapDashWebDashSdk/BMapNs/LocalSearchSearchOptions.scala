package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalSearchSearchOptions extends js.Object {
  var customData: js.Any
  var forceLocal: Boolean
}

object LocalSearchSearchOptions {
  @scala.inline
  def apply(customData: js.Any, forceLocal: Boolean): LocalSearchSearchOptions = {
    val __obj = js.Dynamic.literal(customData = customData, forceLocal = forceLocal)
  
    __obj.asInstanceOf[LocalSearchSearchOptions]
  }
}

