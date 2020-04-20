package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAttributesFromFindingsRequest extends js.Object {
  /**
    * The array of attribute keys that you want to remove from specified findings.
    */
  var attributeKeys: UserAttributeKeyList = js.native
  /**
    * The ARNs that specify the findings that you want to remove attributes from.
    */
  var findingArns: AddRemoveAttributesFindingArnList = js.native
}

object RemoveAttributesFromFindingsRequest {
  @scala.inline
  def apply(attributeKeys: UserAttributeKeyList, findingArns: AddRemoveAttributesFindingArnList): RemoveAttributesFromFindingsRequest = {
    val __obj = js.Dynamic.literal(attributeKeys = attributeKeys.asInstanceOf[js.Any], findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesFromFindingsRequest]
  }
}

