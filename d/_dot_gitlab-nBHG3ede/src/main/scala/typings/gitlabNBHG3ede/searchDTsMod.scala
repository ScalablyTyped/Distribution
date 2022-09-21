package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.projectIdstringnumberundeGroupId
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Search.d.ts", "Search")
  @js.native
  open class Search () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(scope: String, search: String, hasProjectIdGroupIdOptions: projectIdstringnumberundeGroupId): js.Promise[GetResponse] = js.native
  }
}
