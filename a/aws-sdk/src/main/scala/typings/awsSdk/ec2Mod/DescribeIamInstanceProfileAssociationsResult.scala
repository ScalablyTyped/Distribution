package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIamInstanceProfileAssociationsResult extends js.Object {
  /**
    * Information about the IAM instance profile associations.
    */
  var IamInstanceProfileAssociations: js.UndefOr[IamInstanceProfileAssociationSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeIamInstanceProfileAssociationsResult {
  @scala.inline
  def apply(): DescribeIamInstanceProfileAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIamInstanceProfileAssociationsResult]
  }
  @scala.inline
  implicit class DescribeIamInstanceProfileAssociationsResultOps[Self <: DescribeIamInstanceProfileAssociationsResult] (val x: Self) extends AnyVal {
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
    def setIamInstanceProfileAssociationsVarargs(value: IamInstanceProfileAssociation*): Self = this.set("IamInstanceProfileAssociations", js.Array(value :_*))
    @scala.inline
    def setIamInstanceProfileAssociations(value: IamInstanceProfileAssociationSet): Self = this.set("IamInstanceProfileAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfileAssociations: Self = this.set("IamInstanceProfileAssociations", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

