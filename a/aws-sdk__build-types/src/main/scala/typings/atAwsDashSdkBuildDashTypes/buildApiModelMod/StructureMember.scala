package typings.atAwsDashSdkBuildDashTypes.buildApiModelMod

import typings.atAwsDashSdkTypes.buildProtocolMod.XmlNamespace
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
    val __obj = js.Dynamic.literal(shape = shape)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened)
    if (location != null) __obj.updateDynamic("location")(location)
    if (locationName != null) __obj.updateDynamic("locationName")(locationName)
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming)
    if (!js.isUndefined(xmlAttribute)) __obj.updateDynamic("xmlAttribute")(xmlAttribute)
    if (xmlNamespace != null) __obj.updateDynamic("xmlNamespace")(xmlNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMember]
  }
}

