package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackResourceDriftsOutput extends js.Object {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call DescribeStackResourceDrifts again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * Drift information for the resources that have been checked for drift in the specified stack. This includes actual and expected configuration values for resources where AWS CloudFormation detects drift. For a given stack, there will be one StackResourceDrift for each stack resource that has been checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not currently support drift detection are not checked, and so not included. For a list of resources that support drift detection, see Resources that Support Drift Detection.
    */
  var StackResourceDrifts: typings.awsSdk.cloudformationMod.StackResourceDrifts = js.native
}
object DescribeStackResourceDriftsOutput {
  
  @scala.inline
  def apply(StackResourceDrifts: StackResourceDrifts): DescribeStackResourceDriftsOutput = {
    val __obj = js.Dynamic.literal(StackResourceDrifts = StackResourceDrifts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourceDriftsOutput]
  }
  
  @scala.inline
  implicit class DescribeStackResourceDriftsOutputOps[Self <: DescribeStackResourceDriftsOutput] (val x: Self) extends AnyVal {
    
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
    def setStackResourceDriftsVarargs(value: StackResourceDrift*): Self = this.set("StackResourceDrifts", js.Array(value :_*))
    
    @scala.inline
    def setStackResourceDrifts(value: StackResourceDrifts): Self = this.set("StackResourceDrifts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
