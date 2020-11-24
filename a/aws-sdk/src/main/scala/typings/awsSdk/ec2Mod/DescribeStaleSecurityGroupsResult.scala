package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStaleSecurityGroupsResult extends js.Object {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the stale security groups.
    */
  var StaleSecurityGroupSet: js.UndefOr[typings.awsSdk.ec2Mod.StaleSecurityGroupSet] = js.native
}
object DescribeStaleSecurityGroupsResult {
  
  @scala.inline
  def apply(): DescribeStaleSecurityGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStaleSecurityGroupsResult]
  }
  
  @scala.inline
  implicit class DescribeStaleSecurityGroupsResultOps[Self <: DescribeStaleSecurityGroupsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStaleSecurityGroupSetVarargs(value: StaleSecurityGroup*): Self = this.set("StaleSecurityGroupSet", js.Array(value :_*))
    
    @scala.inline
    def setStaleSecurityGroupSet(value: StaleSecurityGroupSet): Self = this.set("StaleSecurityGroupSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaleSecurityGroupSet: Self = this.set("StaleSecurityGroupSet", js.undefined)
  }
}
