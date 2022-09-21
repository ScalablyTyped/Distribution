package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.BaseRequestOptions
import typings.gitlabNBHG3ede.anon.groupIdstringnumberundefiDictkey
import typings.gitlabNBHG3ede.anon.projectIdstringnumberundeDictkey
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuesStatisticsDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/IssuesStatistics.d.ts", "IssuesStatistics")
  @js.native
  open class IssuesStatistics () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(
      hasProjectIdGroupIdOptions: projectIdstringnumberundeDictkey | groupIdstringnumberundefiDictkey | BaseRequestOptions
    ): js.Promise[GetResponse] = js.native
  }
}
