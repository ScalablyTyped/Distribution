package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaLink extends js.Object {
  var description: String
  var heading: String
  var id: String
}

object PanoramaLink {
  @scala.inline
  def apply(description: String, heading: String, id: String): PanoramaLink = {
    val __obj = js.Dynamic.literal(description = description, heading = heading, id = id)
  
    __obj.asInstanceOf[PanoramaLink]
  }
}

