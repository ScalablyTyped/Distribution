package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScalingPoliciesOutput extends js.Object {
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A collection of objects containing the scaling policies matching the request.
    */
  var ScalingPolicies: js.UndefOr[ScalingPolicyList] = js.native
}
object DescribeScalingPoliciesOutput {
  
  @scala.inline
  def apply(): DescribeScalingPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPoliciesOutput]
  }
  
  @scala.inline
  implicit class DescribeScalingPoliciesOutputOps[Self <: DescribeScalingPoliciesOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setScalingPoliciesVarargs(value: ScalingPolicy*): Self = this.set("ScalingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setScalingPolicies(value: ScalingPolicyList): Self = this.set("ScalingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingPolicies: Self = this.set("ScalingPolicies", js.undefined)
  }
}
