package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import typings.gitlabNBHG3ede.snippetsDTsMod.SnippetVisibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectSnippetsDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/ProjectSnippets.d.ts", "ProjectSnippets")
  @js.native
  open class ProjectSnippets () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def content(projectId: String, snippetId: Double): js.Promise[GetResponse] = js.native
    def content(projectId: String, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def content(projectId: Double, snippetId: Double): js.Promise[GetResponse] = js.native
    def content(projectId: Double, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, title: String, fileName: String, code: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
    def create(
      projectId: String,
      title: String,
      fileName: String,
      code: String,
      visibility: SnippetVisibility,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def create(projectId: Double, title: String, fileName: String, code: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
    def create(
      projectId: Double,
      title: String,
      fileName: String,
      code: String,
      visibility: SnippetVisibility,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, snippetId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, snippetId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, snippetId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, snippetId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, snippetId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, snippetId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, snippetId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, snippetId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, snippetId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, snippetId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def userAgentDetails(projectId: String, snippetId: Double): js.Promise[GetResponse] = js.native
    def userAgentDetails(projectId: String, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def userAgentDetails(projectId: Double, snippetId: Double): js.Promise[GetResponse] = js.native
    def userAgentDetails(projectId: Double, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
