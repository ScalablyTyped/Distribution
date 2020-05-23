package typings.awsSdkBuildTypes.treeModelMod

import typings.awsSdkTypes.protocolMod.MemberLocation
import typings.awsSdkTypes.protocolMod.XmlNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeModelOperationMember extends TreeModelMember {
  @JSName("shape")
  var shape_TreeModelOperationMember: TreeModelStructure
}

object TreeModelOperationMember {
  @scala.inline
  def apply(
    shape: TreeModelStructure,
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
  ): TreeModelOperationMember = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationName != null) __obj.updateDynamic("locationName")(locationName.asInstanceOf[js.Any])
    if (queryName != null) __obj.updateDynamic("queryName")(queryName.asInstanceOf[js.Any])
    if (resultWrapper != null) __obj.updateDynamic("resultWrapper")(resultWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlAttribute)) __obj.updateDynamic("xmlAttribute")(xmlAttribute.get.asInstanceOf[js.Any])
    if (xmlNamespace != null) __obj.updateDynamic("xmlNamespace")(xmlNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelOperationMember]
  }
}

