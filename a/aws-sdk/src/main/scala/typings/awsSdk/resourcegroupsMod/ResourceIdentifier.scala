package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdentifier extends js.Object {
  /**
    * The ARN of a resource.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceArn] = js.native
  /**
    * The resource type of a resource, such as AWS::EC2::Instance.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceType] = js.native
}

object ResourceIdentifier {
  @scala.inline
  def apply(): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifier]
  }
  @scala.inline
  implicit class ResourceIdentifierOps[Self <: ResourceIdentifier] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

