package typings.atAwsDashSdkTypes.buildProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var flattened: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[MemberLocation] = js.undefined
  var locationName: js.UndefOr[java.lang.String] = js.undefined
  var queryName: js.UndefOr[java.lang.String] = js.undefined
  var resultWrapper: js.UndefOr[java.lang.String] = js.undefined
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
  var shape: SerializationModel
  var streaming: js.UndefOr[scala.Boolean] = js.undefined
  var xmlAttribute: js.UndefOr[scala.Boolean] = js.undefined
  var xmlNamespace: js.UndefOr[XmlNamespace] = js.undefined
}

object Member {
  @scala.inline
  def apply(
    shape: SerializationModel,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    location: MemberLocation = null,
    locationName: java.lang.String = null,
    queryName: java.lang.String = null,
    resultWrapper: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    streaming: js.UndefOr[scala.Boolean] = js.undefined,
    xmlAttribute: js.UndefOr[scala.Boolean] = js.undefined,
    xmlNamespace: XmlNamespace = null
  ): Member = {
    val __obj = js.Dynamic.literal(shape = shape)
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened)
    if (location != null) __obj.updateDynamic("location")(location)
    if (locationName != null) __obj.updateDynamic("locationName")(locationName)
    if (queryName != null) __obj.updateDynamic("queryName")(queryName)
    if (resultWrapper != null) __obj.updateDynamic("resultWrapper")(resultWrapper)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming)
    if (!js.isUndefined(xmlAttribute)) __obj.updateDynamic("xmlAttribute")(xmlAttribute)
    if (xmlNamespace != null) __obj.updateDynamic("xmlNamespace")(xmlNamespace)
    __obj.asInstanceOf[Member]
  }
}

