package typings.azureDashArmDashResource.libLinkModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLinkProperties extends js.Object {
  /**
    * Notes about the resource link.
    */
  var notes: js.UndefOr[String] = js.undefined
  /**
    * The fully qualified ID of the source resource in the link.
    */
  val sourceId: js.UndefOr[String] = js.undefined
  /**
    * The fully qualified ID of the target resource in the link.
    */
  var targetId: String
}

object ResourceLinkProperties {
  @scala.inline
  def apply(targetId: String, notes: String = null, sourceId: String = null): ResourceLinkProperties = {
    val __obj = js.Dynamic.literal(targetId = targetId)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (sourceId != null) __obj.updateDynamic("sourceId")(sourceId)
    __obj.asInstanceOf[ResourceLinkProperties]
  }
}

