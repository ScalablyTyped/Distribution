package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidekiqMetricsDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/SidekiqMetrics.d.ts", "SidekiqMetrics")
  @js.native
  open class SidekiqMetrics () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def compoundMetrics(): js.Promise[GetResponse] = js.native
    
    def jobStats(): js.Promise[GetResponse] = js.native
    
    def processMetrics(): js.Promise[GetResponse] = js.native
    
    def queueMetrics(): js.Promise[GetResponse] = js.native
  }
}
