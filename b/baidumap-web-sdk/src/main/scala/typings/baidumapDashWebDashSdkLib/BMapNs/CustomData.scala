package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomData extends js.Object {
  var filter: java.lang.String
  var geotableId: scala.Double
  var tags: java.lang.String
}

object CustomData {
  @scala.inline
  def apply(filter: java.lang.String, geotableId: scala.Double, tags: java.lang.String): CustomData = {
    val __obj = js.Dynamic.literal(filter = filter, geotableId = geotableId, tags = tags)
  
    __obj.asInstanceOf[CustomData]
  }
}

