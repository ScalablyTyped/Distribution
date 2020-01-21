package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryRequest extends js.Object {
  /**
    * The name of the Directory. Should be unique per account, per region.
    */
  var Name: DirectoryName = js.native
  /**
    * The Amazon Resource Name (ARN) of the published schema that will be copied into the data Directory. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object CreateDirectoryRequest {
  @scala.inline
  def apply(Name: DirectoryName, SchemaArn: Arn): CreateDirectoryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateDirectoryRequest]
  }
}

