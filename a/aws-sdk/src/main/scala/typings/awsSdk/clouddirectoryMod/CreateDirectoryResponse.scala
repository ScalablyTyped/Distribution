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
  @scala.inline
  implicit class CreateDirectoryResponseOps[Self <: CreateDirectoryResponse] (val x: Self) extends AnyVal {
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
    def setAppliedSchemaArn(value: Arn): Self = this.set("AppliedSchemaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryArn(value: DirectoryArn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: DirectoryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = this.set("ObjectIdentifier", value.asInstanceOf[js.Any])
  }
  
}

