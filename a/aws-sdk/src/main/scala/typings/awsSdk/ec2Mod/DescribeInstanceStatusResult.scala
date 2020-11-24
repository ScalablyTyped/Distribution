package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceStatusResult extends js.Object {
  
  /**
    * Information about the status of the instances.
    */
  var InstanceStatuses: js.UndefOr[InstanceStatusList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeInstanceStatusResult {
  
  @scala.inline
  def apply(): DescribeInstanceStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceStatusResult]
  }
  
  @scala.inline
  implicit class DescribeInstanceStatusResultOps[Self <: DescribeInstanceStatusResult] (val x: Self) extends AnyVal {
    
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
    def setInstanceStatusesVarargs(value: InstanceStatus*): Self = this.set("InstanceStatuses", js.Array(value :_*))
    
    @scala.inline
    def setInstanceStatuses(value: InstanceStatusList): Self = this.set("InstanceStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceStatuses: Self = this.set("InstanceStatuses", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
