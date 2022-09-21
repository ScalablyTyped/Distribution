package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.PaginatedRequestOptions
import typings.gitlabNBHG3ede.anon.groupIdstringnumberundefi
import typings.gitlabNBHG3ede.anon.projectIdstringnumberunde
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuesDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Issues.d.ts", "Issues")
  @js.native
  open class Issues () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def addSpentTime(projectId: String, issueId: Double, duration: String): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: String, issueId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: Double, issueId: Double, duration: String): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: Double, issueId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def addTimeEstimate(projectId: String, issueId: Double, duration: String): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: String, issueId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: Double, issueId: Double, duration: String): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: Double, issueId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def all(): js.Promise[GetResponse] = js.native
    def all(
      hasProjectIdGroupIdOptions: projectIdstringnumberunde | groupIdstringnumberundefi | PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    
    def create(projectId: String): js.Promise[js.Object] = js.native
    def create(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def link(projectId: String, issueIId: Double, targetProjectId: String, targetIssueId: Double): js.Promise[js.Object] = js.native
    def link(
      projectId: String,
      issueIId: Double,
      targetProjectId: String,
      targetIssueId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def link(projectId: String, issueIId: Double, targetProjectId: Double, targetIssueId: Double): js.Promise[js.Object] = js.native
    def link(
      projectId: String,
      issueIId: Double,
      targetProjectId: Double,
      targetIssueId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def link(projectId: Double, issueIId: Double, targetProjectId: String, targetIssueId: Double): js.Promise[js.Object] = js.native
    def link(
      projectId: Double,
      issueIId: Double,
      targetProjectId: String,
      targetIssueId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def link(projectId: Double, issueIId: Double, targetProjectId: Double, targetIssueId: Double): js.Promise[js.Object] = js.native
    def link(
      projectId: Double,
      issueIId: Double,
      targetProjectId: Double,
      targetIssueId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def participants(projectId: String, issueId: Double): js.Promise[GetResponse] = js.native
    def participants(projectId: String, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def participants(projectId: Double, issueId: Double): js.Promise[GetResponse] = js.native
    def participants(projectId: Double, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def remove(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def resetSpentTime(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: String, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: Double, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def resetTimeEstimate(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: String, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, issueId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, issueId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def subscribe(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def subscribe(projectId: String, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def subscribe(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def subscribe(projectId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def timeStats(projectId: String, issueId: Double): js.Promise[GetResponse] = js.native
    def timeStats(projectId: String, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def timeStats(projectId: Double, issueId: Double): js.Promise[GetResponse] = js.native
    def timeStats(projectId: Double, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def unsubscribe(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: String, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
}
