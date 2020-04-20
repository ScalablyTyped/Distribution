package typings.baidumapWebSdk.BMap

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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaLink]
  }
}

