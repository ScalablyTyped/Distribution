package typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.input
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.output
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.structure
import typings.atAwsDashSdkTypes.buildProtocolMod.SerializationType
import typings.atAwsDashSdkTypes.buildProtocolMod.Structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeModelStructure
  extends Structure
     with Documented
     with Named {
  var exception: js.UndefOr[Boolean] = js.undefined
  @JSName("members")
  var members_TreeModelStructure: StringDictionary[TreeModelMember]
  var topLevel: js.UndefOr[input | output] = js.undefined
}

object TreeModelStructure {
  @scala.inline
  def apply(
    documentation: String,
    members: StringDictionary[TreeModelMember],
    name: String,
    required: js.Array[String],
    `type`: SerializationType,
    type_Structure: structure,
    exception: js.UndefOr[Boolean] = js.undefined,
    exceptionCode: String = null,
    exceptionType: String = null,
    payload: String = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    topLevel: input | output = null
  ): TreeModelStructure = {
    val __obj = js.Dynamic.literal(documentation = documentation, members = members, name = name, required = required)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("type")(type_Structure)
    if (!js.isUndefined(exception)) __obj.updateDynamic("exception")(exception)
    if (exceptionCode != null) __obj.updateDynamic("exceptionCode")(exceptionCode)
    if (exceptionType != null) __obj.updateDynamic("exceptionType")(exceptionType)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (topLevel != null) __obj.updateDynamic("topLevel")(topLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelStructure]
  }
}

