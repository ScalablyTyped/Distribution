package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastMessagesDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/BroadcastMessages.d.ts", "BroadcastMessages")
  @js.native
  open class BroadcastMessages () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(): js.Promise[js.Object] = js.native
    def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(broadcastMessageId: Double): js.Promise[js.Object] = js.native
    def edit(broadcastMessageId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(broadcastMessageId: Double): js.Promise[js.Object] = js.native
    
    def show(broadcastMessageId: Double): js.Promise[GetResponse] = js.native
    def show(broadcastMessageId: Double, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
