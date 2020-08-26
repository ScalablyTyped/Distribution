package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string = js.native
  /**
    * A list of resources.
    */
  var Resources: js.UndefOr[listOfResource] = js.native
}

object CreateResourceDefinitionVersionRequest {
  @scala.inline
  def apply(ResourceDefinitionId: string): CreateResourceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceDefinitionVersionRequest]
  }
  @scala.inline
  implicit class CreateResourceDefinitionVersionRequestOps[Self <: CreateResourceDefinitionVersionRequest] (val x: Self) extends AnyVal {
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
    def setResourceDefinitionId(value: string): Self = this.set("ResourceDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmznClientToken(value: string): Self = this.set("AmznClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmznClientToken: Self = this.set("AmznClientToken", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = this.set("Resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: listOfResource): Self = this.set("Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
  }
  
}

