package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkTypes.protocolMod.XmlNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructureMember extends Member {
  var location: js.UndefOr[MemberLocation] = js.undefined
  var streaming: js.UndefOr[scala.Boolean] = js.undefined
  var xmlNamespace: js.UndefOr[XmlNamespace | java.lang.String] = js.undefined
}

object StructureMember {
  @scala.inline
  def apply(
    shape: java.lang.String,
    documentation: java.lang.String = null,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    location: MemberLocation = null,
    locationName: java.lang.String = null,
    streaming: js.UndefOr[scala.Boolean] = js.undefined,
    xmlAttribute: js.UndefOr[scala.Boolean] = js.undefined,
    xmlNamespace: XmlNamespace | java.lang.String = null
  ): StructureMember = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationName != null) __obj.updateDynamic("locationName")(locationName.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlAttribute)) __obj.updateDynamic("xmlAttribute")(xmlAttribute.get.asInstanceOf[js.Any])
    if (xmlNamespace != null) __obj.updateDynamic("xmlNamespace")(xmlNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMember]
  }
}

