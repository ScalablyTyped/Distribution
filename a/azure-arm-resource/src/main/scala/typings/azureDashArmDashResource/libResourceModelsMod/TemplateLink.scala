package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateLink extends js.Object {
  /**
    * If included, must match the ContentVersion in the template.
    */
  var contentVersion: js.UndefOr[String] = js.undefined
  /**
    * The URI of the template to deploy.
    */
  var uri: String
}

object TemplateLink {
  @scala.inline
  def apply(uri: String, contentVersion: String = null): TemplateLink = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLink]
  }
}

