package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNetworkAclsResult extends js.Object {
  
  /**
    * Information about one or more network ACLs.
    */
  var NetworkAcls: js.UndefOr[NetworkAclList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeNetworkAclsResult {
  
  @scala.inline
  def apply(): DescribeNetworkAclsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkAclsResult]
  }
  
  @scala.inline
  implicit class DescribeNetworkAclsResultOps[Self <: DescribeNetworkAclsResult] (val x: Self) extends AnyVal {
    
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
    def setNetworkAclsVarargs(value: NetworkAcl*): Self = this.set("NetworkAcls", js.Array(value :_*))
    
    @scala.inline
    def setNetworkAcls(value: NetworkAclList): Self = this.set("NetworkAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkAcls: Self = this.set("NetworkAcls", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
