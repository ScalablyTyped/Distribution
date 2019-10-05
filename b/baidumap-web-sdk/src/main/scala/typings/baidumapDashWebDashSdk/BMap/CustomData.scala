package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomData extends js.Object {
  var filter: String
  var geotableId: Double
  var tags: String
}

object CustomData {
  @scala.inline
  def apply(filter: String, geotableId: Double, tags: String): CustomData = {
    val __obj = js.Dynamic.literal(filter = filter, geotableId = geotableId, tags = tags)
  
    __obj.asInstanceOf[CustomData]
  }
}

