package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryArgProfile extends js.Object {
  
  /**
    * ID of profile to use for field-level encryption query argument-profile mapping
    */
  var ProfileId: String = js.native
  
  /**
    * Query argument for field-level encryption query argument-profile mapping.
    */
  var QueryArg: String = js.native
}
object QueryArgProfile {
  
  @scala.inline
  def apply(ProfileId: String, QueryArg: String): QueryArgProfile = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any], QueryArg = QueryArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArgProfile]
  }
  
  @scala.inline
  implicit class QueryArgProfileOps[Self <: QueryArgProfile] (val x: Self) extends AnyVal {
    
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
    def setProfileId(value: String): Self = this.set("ProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryArg(value: String): Self = this.set("QueryArg", value.asInstanceOf[js.Any])
  }
}
