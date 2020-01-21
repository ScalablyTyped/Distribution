package typings.awsSdkBuildTypes.treeModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typings.awsSdkTypes.awsSdkTypesStrings.structure
import typings.awsSdkTypes.protocolMod.Structure
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
    `type`: structure,
    exception: js.UndefOr[Boolean] = js.undefined,
    exceptionCode: String = null,
    exceptionType: String = null,
    payload: String = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    topLevel: input | output = null
  ): TreeModelStructure = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(exception)) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    if (exceptionCode != null) __obj.updateDynamic("exceptionCode")(exceptionCode.asInstanceOf[js.Any])
    if (exceptionType != null) __obj.updateDynamic("exceptionType")(exceptionType.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (topLevel != null) __obj.updateDynamic("topLevel")(topLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelStructure]
  }
}

