package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSubnetGroupsResponse extends js.Object {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * An array of subnet groups. Each element in the array represents a single subnet group.
    */
  var SubnetGroups: js.UndefOr[SubnetGroupList] = js.native
}
object DescribeSubnetGroupsResponse {
  
  @scala.inline
  def apply(): DescribeSubnetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubnetGroupsResponse]
  }
  
  @scala.inline
  implicit class DescribeSubnetGroupsResponseOps[Self <: DescribeSubnetGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setSubnetGroupsVarargs(value: SubnetGroup*): Self = this.set("SubnetGroups", js.Array(value :_*))
    
    @scala.inline
    def setSubnetGroups(value: SubnetGroupList): Self = this.set("SubnetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetGroups: Self = this.set("SubnetGroups", js.undefined)
  }
}
