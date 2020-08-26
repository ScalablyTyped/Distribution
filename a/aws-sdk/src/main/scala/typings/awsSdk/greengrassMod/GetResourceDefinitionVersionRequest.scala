package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string = js.native
  /**
    * The ID of the resource definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListResourceDefinitionVersions'' requests. If the version is the last one that was associated with a resource definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var ResourceDefinitionVersionId: string = js.native
}

object GetResourceDefinitionVersionRequest {
  @scala.inline
  def apply(ResourceDefinitionId: string, ResourceDefinitionVersionId: string): GetResourceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any], ResourceDefinitionVersionId = ResourceDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceDefinitionVersionRequest]
  }
  @scala.inline
  implicit class GetResourceDefinitionVersionRequestOps[Self <: GetResourceDefinitionVersionRequest] (val x: Self) extends AnyVal {
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
    def setResourceDefinitionVersionId(value: string): Self = this.set("ResourceDefinitionVersionId", value.asInstanceOf[js.Any])
  }
  
}

