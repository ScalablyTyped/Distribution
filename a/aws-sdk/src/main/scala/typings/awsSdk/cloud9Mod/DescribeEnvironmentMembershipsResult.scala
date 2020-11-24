package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentMembershipsResult extends js.Object {
  
  /**
    * Information about the environment members for the environment.
    */
  var memberships: js.UndefOr[EnvironmentMembersList] = js.native
  
  /**
    * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object DescribeEnvironmentMembershipsResult {
  
  @scala.inline
  def apply(): DescribeEnvironmentMembershipsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentMembershipsResult]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentMembershipsResultOps[Self <: DescribeEnvironmentMembershipsResult] (val x: Self) extends AnyVal {
    
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
    def setMembershipsVarargs(value: EnvironmentMember*): Self = this.set("memberships", js.Array(value :_*))
    
    @scala.inline
    def setMemberships(value: EnvironmentMembersList): Self = this.set("memberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberships: Self = this.set("memberships", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
