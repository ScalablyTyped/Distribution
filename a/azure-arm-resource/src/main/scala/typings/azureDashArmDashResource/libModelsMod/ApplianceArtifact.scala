package typings.azureDashArmDashResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplianceArtifact extends js.Object {
  /**
    * The appliance artifact name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The the appliance artifact type. Possible values include: 'Template', 'Custom'
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The appliance artifact blob uri.
    */
  var uri: js.UndefOr[String] = js.undefined
}

object ApplianceArtifact {
  @scala.inline
  def apply(name: String = null, `type`: String = null, uri: String = null): ApplianceArtifact = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplianceArtifact]
  }
}

