package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeParameterGroupsResponse extends js.Object {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * An array of parameter groups. Each element in the array represents one parameter group.
    */
  var ParameterGroups: js.UndefOr[ParameterGroupList] = js.native
}
object DescribeParameterGroupsResponse {
  
  @scala.inline
  def apply(): DescribeParameterGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParameterGroupsResponse]
  }
  
  @scala.inline
  implicit class DescribeParameterGroupsResponseOps[Self <: DescribeParameterGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setParameterGroupsVarargs(value: ParameterGroup*): Self = this.set("ParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setParameterGroups(value: ParameterGroupList): Self = this.set("ParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroups: Self = this.set("ParameterGroups", js.undefined)
  }
}
