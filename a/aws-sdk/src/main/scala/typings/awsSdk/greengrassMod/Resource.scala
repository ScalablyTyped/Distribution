package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /**
    * The resource ID, used to refer to a resource in the Lambda function configuration. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''. This must be unique within a Greengrass group.
    */
  var Id: string = js.native
  /**
    * The descriptive resource name, which is displayed on the AWS IoT Greengrass console. Max length 128 characters with pattern ''[a-zA-Z0-9:_-]+''. This must be unique within a Greengrass group.
    */
  var Name: string = js.native
  /**
    * A container of data for all resource types.
    */
  var ResourceDataContainer: typings.awsSdk.greengrassMod.ResourceDataContainer = js.native
}

object Resource {
  @scala.inline
  def apply(Id: string, Name: string, ResourceDataContainer: ResourceDataContainer): Resource = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ResourceDataContainer = ResourceDataContainer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resource]
  }
}

