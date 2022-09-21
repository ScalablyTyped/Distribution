package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.todoIdnumberundefinedSudo
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object todosDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Todos.d.ts", "Todos")
  @js.native
  open class Todos () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, mergerequestId: Double): js.Promise[js.Object] = js.native
    def create(projectId: String, mergerequestId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: Double, mergerequestId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, mergerequestId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def done(hasTodoIdOptions: todoIdnumberundefinedSudo): js.Promise[js.Object] = js.native
  }
}
