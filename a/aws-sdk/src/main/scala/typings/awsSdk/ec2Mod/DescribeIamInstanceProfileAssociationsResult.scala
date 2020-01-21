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
  def apply(
    IamInstanceProfileAssociations: IamInstanceProfileAssociationSet = null,
    NextToken: NextToken = null
  ): DescribeIamInstanceProfileAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (IamInstanceProfileAssociations != null) __obj.updateDynamic("IamInstanceProfileAssociations")(IamInstanceProfileAssociations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIamInstanceProfileAssociationsResult]
  }
}

