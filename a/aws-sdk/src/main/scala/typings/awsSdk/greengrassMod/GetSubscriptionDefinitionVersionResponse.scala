package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubscriptionDefinitionVersionResponse extends js.Object {
  /**
    * The ARN of the subscription definition version.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the subscription definition version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.native
  /**
    * Information about the subscription definition version.
    */
  var Definition: js.UndefOr[SubscriptionDefinitionVersion] = js.native
  /**
    * The ID of the subscription definition version.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The version of the subscription definition version.
    */
  var Version: js.UndefOr[string] = js.native
}

object GetSubscriptionDefinitionVersionResponse {
  @scala.inline
  def apply(): GetSubscriptionDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSubscriptionDefinitionVersionResponse]
  }
  @scala.inline
  implicit class GetSubscriptionDefinitionVersionResponseOps[Self <: GetSubscriptionDefinitionVersionResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: string): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    @scala.inline
    def setDefinition(value: SubscriptionDefinitionVersion): Self = this.set("Definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("Definition", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVersion(value: string): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

