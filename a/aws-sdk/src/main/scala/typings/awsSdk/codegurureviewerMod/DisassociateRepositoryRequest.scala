package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateRepositoryRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the  RepositoryAssociation  object. 
    */
  var AssociationArn: Arn = js.native
}

object DisassociateRepositoryRequest {
  @scala.inline
  def apply(AssociationArn: Arn): DisassociateRepositoryRequest = {
    val __obj = js.Dynamic.literal(AssociationArn = AssociationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRepositoryRequest]
  }
  @scala.inline
  implicit class DisassociateRepositoryRequestOps[Self <: DisassociateRepositoryRequest] (val x: Self) extends AnyVal {
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
    def setAssociationArn(value: Arn): Self = this.set("AssociationArn", value.asInstanceOf[js.Any])
  }
  
}

