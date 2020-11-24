package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic Functions
  * chayns
  * interfaces
  */
// chayns.getUser()
@js.native
trait GetUserConfig extends js.Object {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var fbId: js.UndefOr[String] = js.native
  
  var personId: js.UndefOr[String] = js.native
  
  var userId: js.UndefOr[Double] = js.native
}
object GetUserConfig {
  
  @scala.inline
  def apply(): GetUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserConfig]
  }
  
  @scala.inline
  implicit class GetUserConfigOps[Self <: GetUserConfig] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setFbId(value: String): Self = this.set("fbId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFbId: Self = this.set("fbId", js.undefined)
    
    @scala.inline
    def setPersonId(value: String): Self = this.set("personId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonId: Self = this.set("personId", js.undefined)
    
    @scala.inline
    def setUserId(value: Double): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
