package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipelineScheduleVariablesDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/PipelineScheduleVariables.d.ts", "PipelineScheduleVariables")
  @js.native
  open class PipelineScheduleVariables () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String, pipelineScheduleId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: String, pipelineScheduleId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double, pipelineScheduleId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, pipelineScheduleId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, pipelineScheduleId: Double): js.Promise[js.Object] = js.native
    def create(projectId: String, pipelineScheduleId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double, pipelineScheduleId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, pipelineScheduleId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, pipelineScheduleId: Double, keyId: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, pipelineScheduleId: Double, keyId: String): js.Promise[js.Object] = js.native
    def edit(projectId: Double, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, pipelineScheduleId: Double, keyId: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: Double, pipelineScheduleId: Double, keyId: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def show(projectId: String, pipelineScheduleId: Double, keyId: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def show(projectId: Double, pipelineScheduleId: Double, keyId: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
