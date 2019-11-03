package typings.azureDashArmDashResource.libLinkModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLinkFilter extends js.Object {
  /**
    * The ID of the target resource.
    */
  var targetId: String
}

object ResourceLinkFilter {
  @scala.inline
  def apply(targetId: String): ResourceLinkFilter = {
    val __obj = js.Dynamic.literal(targetId = targetId)
  
    __obj.asInstanceOf[ResourceLinkFilter]
  }
}

