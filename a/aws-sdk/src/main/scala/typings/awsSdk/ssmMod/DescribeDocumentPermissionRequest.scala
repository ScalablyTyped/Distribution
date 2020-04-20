package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentPermissionRequest extends js.Object {
  /**
    * The name of the document for which you are the owner.
    */
  var Name: DocumentName = js.native
  /**
    * The permission type for the document. The permission type can be Share.
    */
  var PermissionType: DocumentPermissionType = js.native
}

object DescribeDocumentPermissionRequest {
  @scala.inline
  def apply(Name: DocumentName, PermissionType: DocumentPermissionType): DescribeDocumentPermissionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionType = PermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentPermissionRequest]
  }
}

