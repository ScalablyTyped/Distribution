package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryResponse extends js.Object {
  /**
    * The ARN of the published schema in the Directory. Once a published schema is copied into the directory, it has its own ARN, which is referred to applied schema ARN. For more information, see arns.
    */
  var AppliedSchemaArn: Arn = js.native
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: typings.awsSdk.clouddirectoryMod.DirectoryArn = js.native
  /**
    * The name of the Directory.
    */
  var Name: DirectoryName = js.native
  /**
    * The root object node of the created directory.
    */
  var ObjectIdentifier: typings.awsSdk.clouddirectoryMod.ObjectIdentifier = js.native
}

object CreateDirectoryResponse {
  @scala.inline
  def apply(
    AppliedSchemaArn: Arn,
    DirectoryArn: DirectoryArn,
    Name: DirectoryName,
    ObjectIdentifier: ObjectIdentifier
  ): CreateDirectoryResponse = {
    val __obj = js.Dynamic.literal(AppliedSchemaArn = AppliedSchemaArn.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectIdentifier = ObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryResponse]
  }
}

