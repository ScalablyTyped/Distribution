package typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod

import typings.atAwsDashSdkTypes.buildProtocolMod.Member
import typings.atAwsDashSdkTypes.buildProtocolMod.MemberLocation
import typings.atAwsDashSdkTypes.buildProtocolMod.XmlNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @aws-sdk/build-types.@aws-sdk/build-types/build/TreeModel.Documented ]:? @aws-sdk/build-types.@aws-sdk/build-types/build/TreeModel.Documented[P]} */ trait TreeModelMember extends Member {
  @JSName("shape")
  var shape_TreeModelMember: TreeModelShape
}

object TreeModelMember {
  @scala.inline
  def apply(
    shape: TreeModelShape,
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
    __obj.asInstanceOf[TreeModelMember]
  }
}

