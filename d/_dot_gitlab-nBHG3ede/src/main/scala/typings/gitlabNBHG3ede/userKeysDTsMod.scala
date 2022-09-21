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

object userKeysDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/UserKeys.d.ts", "UserKeys")
  @js.native
  open class UserKeys () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberundefinedPagi): js.Promise[GetResponse] = js.native
    
    def create(title: Any, key: Any): js.Promise[js.Object] = js.native
    def create(title: Any, key: Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def remove(keyId: Any): js.Promise[js.Object] = js.native
    def remove(keyId: Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def show(keyId: Any): js.Promise[GetResponse] = js.native
    def show(keyId: Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
