package typings.awsSdkBuildTypes.treeModelMod

import typings.awsSdkTypes.protocolMod.MemberLocation
import typings.awsSdkTypes.protocolMod.XmlNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@aws-sdk/build-types.@aws-sdk/build-types/build/TreeModel.Documented> */
/* Inlined parent @aws-sdk/types.@aws-sdk/types.Member */
trait TreeModelMember extends js.Object {
  var documentation: js.UndefOr[String] = js.undefined
  var flattened: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[MemberLocation] = js.undefined
  var locationName: js.UndefOr[String] = js.undefined
  var queryName: js.UndefOr[String] = js.undefined
  var resultWrapper: js.UndefOr[String] = js.undefined
  var sensitive: js.UndefOr[Boolean] = js.undefined
  var shape: TreeModelShape
  var streaming: js.UndefOr[Boolean] = js.undefined
  var xmlAttribute: js.UndefOr[Boolean] = js.undefined
  var xmlNamespace: js.UndefOr[XmlNamespace] = js.undefined
}

object TreeModelMember {
  @scala.inline
  def apply(
    shape: TreeModelShape,
    documentation: String = null,
    flattened: js.UndefOr[Boolean] = js.undefined,
    location: MemberLocation = null,
    locationName: String = null,
    queryName: String = null,
    resultWrapper: String = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    streaming: js.UndefOr[Boolean] = js.undefined,
    xmlAttribute: js.UndefOr[Boolean] = js.undefined,
    xmlNamespace: XmlNamespace = null
  ): TreeModelMember = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationName != null) __obj.updateDynamic("locationName")(locationName.asInstanceOf[js.Any])
    if (queryName != null) __obj.updateDynamic("queryName")(queryName.asInstanceOf[js.Any])
    if (resultWrapper != null) __obj.updateDynamic("resultWrapper")(resultWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlAttribute)) __obj.updateDynamic("xmlAttribute")(xmlAttribute.asInstanceOf[js.Any])
    if (xmlNamespace != null) __obj.updateDynamic("xmlNamespace")(xmlNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelMember]
  }
}

