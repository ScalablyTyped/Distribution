package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object epicsDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Epics.d.ts", "Epics")
  @js.native
  open class Epics () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(groupId: String): js.Promise[GetResponse] = js.native
    def all(groupId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(groupId: Double): js.Promise[GetResponse] = js.native
    def all(groupId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(groupId: String, title: String): js.Promise[js.Object] = js.native
    def create(groupId: String, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(groupId: Double, title: String): js.Promise[js.Object] = js.native
    def create(groupId: Double, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(groupId: String, epicId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: String, epicId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(groupId: Double, epicId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: Double, epicId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(groupId: String, epicId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: String, epicId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(groupId: Double, epicId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: Double, epicId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(groupId: String, epicId: Double): js.Promise[GetResponse] = js.native
    def show(groupId: String, epicId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(groupId: Double, epicId: Double): js.Promise[GetResponse] = js.native
    def show(groupId: Double, epicId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
