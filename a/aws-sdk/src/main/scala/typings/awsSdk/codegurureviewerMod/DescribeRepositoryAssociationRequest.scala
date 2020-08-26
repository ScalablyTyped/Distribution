package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRepositoryAssociationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the  RepositoryAssociation  object. You can retrieve this ARN by calling ListRepositories.
    */
  var AssociationArn: Arn = js.native
}

object DescribeRepositoryAssociationRequest {
  @scala.inline
  def apply(AssociationArn: Arn): DescribeRepositoryAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationArn = AssociationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRepositoryAssociationRequest]
  }
  @scala.inline
  implicit class DescribeRepositoryAssociationRequestOps[Self <: DescribeRepositoryAssociationRequest] (val x: Self) extends AnyVal {
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

