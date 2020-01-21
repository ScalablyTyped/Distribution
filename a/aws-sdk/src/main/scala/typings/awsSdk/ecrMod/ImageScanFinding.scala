package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageScanFinding extends js.Object {
  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[FindingDescription] = js.native
  /**
    * The name associated with the finding, usually a CVE number.
    */
  var name: js.UndefOr[FindingName] = js.native
  /**
    * The finding severity.
    */
  var severity: js.UndefOr[FindingSeverity] = js.native
  /**
    * A link containing additional details about the security vulnerability.
    */
  var uri: js.UndefOr[Url] = js.native
}

object ImageScanFinding {
  @scala.inline
  def apply(
    attributes: AttributeList = null,
    description: FindingDescription = null,
    name: FindingName = null,
    severity: FindingSeverity = null,
    uri: Url = null
  ): ImageScanFinding = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScanFinding]
  }
}

