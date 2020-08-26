package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachTypedLinkRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the directory where you want to detach the typed link.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Used to accept a typed link specifier as input.
    */
  var TypedLinkSpecifier: typings.awsSdk.clouddirectoryMod.TypedLinkSpecifier = js.native
}

object DetachTypedLinkRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, TypedLinkSpecifier: TypedLinkSpecifier): DetachTypedLinkRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachTypedLinkRequest]
  }
  @scala.inline
  implicit class DetachTypedLinkRequestOps[Self <: DetachTypedLinkRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = this.set("TypedLinkSpecifier", value.asInstanceOf[js.Any])
  }
  
}

