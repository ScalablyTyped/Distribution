package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserProfilesResult extends js.Object {
  
  /**
    * A Users object that describes the specified users.
    */
  var UserProfiles: js.UndefOr[typings.awsSdk.opsworksMod.UserProfiles] = js.native
}
object DescribeUserProfilesResult {
  
  @scala.inline
  def apply(): DescribeUserProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfilesResult]
  }
  
  @scala.inline
  implicit class DescribeUserProfilesResultOps[Self <: DescribeUserProfilesResult] (val x: Self) extends AnyVal {
    
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
    def setUserProfilesVarargs(value: UserProfile*): Self = this.set("UserProfiles", js.Array(value :_*))
    
    @scala.inline
    def setUserProfiles(value: UserProfiles): Self = this.set("UserProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProfiles: Self = this.set("UserProfiles", js.undefined)
  }
}
