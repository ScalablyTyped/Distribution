package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateActiveVersionRequest extends js.Object {
  /**
    * The version of the message template to use as the active version of the template. Valid values are: latest, for the most recent version of the template; or, the unique identifier for any existing version of the template. If you specify an identifier, the value must match the identifier for an existing template version. To retrieve a list of versions and version identifiers for a template, use the Template Versions resource.
    */
  var Version: js.UndefOr[string] = js.native
}

object TemplateActiveVersionRequest {
  @scala.inline
  def apply(Version: string = null): TemplateActiveVersionRequest = {
    val __obj = js.Dynamic.literal()
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateActiveVersionRequest]
  }
}

