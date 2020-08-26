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
  @scala.inline
  implicit class DescribeDocumentPermissionRequestOps[Self <: DescribeDocumentPermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: DocumentName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionType(value: DocumentPermissionType): Self = this.set("PermissionType", value.asInstanceOf[js.Any])
  }
  
}

