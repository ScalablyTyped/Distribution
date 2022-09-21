package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.userIdnumberundefinedBase
import typings.gitlabNBHG3ede.anon.userIdnumberundefinedPagi
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userEmailsDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/UserEmails.d.ts", "UserEmails")
  @js.native
  open class UserEmails () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def add(email: Any): js.Promise[js.Object] = js.native
    def add(email: Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberundefinedPagi): js.Promise[GetResponse] = js.native
    
    def remove(emailId: Any): js.Promise[js.Object] = js.native
    def remove(emailId: Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def show(emailId: Any): js.Promise[GetResponse] = js.native
    def show(emailId: Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
