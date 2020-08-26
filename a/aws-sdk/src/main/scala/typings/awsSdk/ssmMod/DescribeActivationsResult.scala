package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActivationsResult extends js.Object {
  /**
    * A list of activations for your AWS account.
    */
  var ActivationList: js.UndefOr[typings.awsSdk.ssmMod.ActivationList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeActivationsResult {
  @scala.inline
  def apply(): DescribeActivationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivationsResult]
  }
  @scala.inline
  implicit class DescribeActivationsResultOps[Self <: DescribeActivationsResult] (val x: Self) extends AnyVal {
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
    def setActivationListVarargs(value: Activation*): Self = this.set("ActivationList", js.Array(value :_*))
    @scala.inline
    def setActivationList(value: ActivationList): Self = this.set("ActivationList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivationList: Self = this.set("ActivationList", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

