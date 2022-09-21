package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userImpersonationTokensDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/UserImpersonationTokens.d.ts", "UserImpersonationTokens")
  @js.native
  open class UserImpersonationTokens () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def add(userId: Double, name: String, scopes: ImpersonationTokenScope, expiresAt: String): js.Promise[js.Object] = js.native
    def add(userId: Double, name: String, scopes: ImpersonationTokenScope, expiresAt: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def all(userId: Double): js.Promise[GetResponse] = js.native
    def all(userId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def revoke(userId: Double, tokenId: Double): js.Promise[js.Object] = js.native
    def revoke(userId: Double, tokenId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(userId: Double, tokenId: Double): js.Promise[GetResponse] = js.native
    def show(userId: Double, tokenId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.api
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.read_user
  */
  trait ImpersonationTokenScope extends StObject
  object ImpersonationTokenScope {
    
    inline def api: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.api = "api".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.api]
    
    inline def read_user: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.read_user = "read_user".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.read_user]
  }
}
