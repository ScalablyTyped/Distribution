package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRepositoryAssociationResponse extends js.Object {
  /**
    * Information about the repository association.
    */
  var RepositoryAssociation: js.UndefOr[typings.awsSdk.codegurureviewerMod.RepositoryAssociation] = js.native
}

object DescribeRepositoryAssociationResponse {
  @scala.inline
  def apply(): DescribeRepositoryAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRepositoryAssociationResponse]
  }
  @scala.inline
  implicit class DescribeRepositoryAssociationResponseOps[Self <: DescribeRepositoryAssociationResponse] (val x: Self) extends AnyVal {
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
    def setRepositoryAssociation(value: RepositoryAssociation): Self = this.set("RepositoryAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryAssociation: Self = this.set("RepositoryAssociation", js.undefined)
  }
  
}

