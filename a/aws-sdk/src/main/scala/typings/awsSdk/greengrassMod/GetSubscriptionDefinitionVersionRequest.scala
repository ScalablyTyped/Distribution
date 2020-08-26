package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubscriptionDefinitionVersionRequest extends js.Object {
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string = js.native
  /**
    * The ID of the subscription definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListSubscriptionDefinitionVersions'' requests. If the version is the last one that was associated with a subscription definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var SubscriptionDefinitionVersionId: string = js.native
}

object GetSubscriptionDefinitionVersionRequest {
  @scala.inline
  def apply(SubscriptionDefinitionId: string, SubscriptionDefinitionVersionId: string): GetSubscriptionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any], SubscriptionDefinitionVersionId = SubscriptionDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionDefinitionVersionRequest]
  }
  @scala.inline
  implicit class GetSubscriptionDefinitionVersionRequestOps[Self <: GetSubscriptionDefinitionVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubscriptionDefinitionId(value: string): Self = this.set("SubscriptionDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionDefinitionVersionId(value: string): Self = this.set("SubscriptionDefinitionVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

