package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.SudokeepNstringolderThans
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerRegistryDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/ContainerRegistry.d.ts", "ContainerRegistry")
  @js.native
  open class ContainerRegistry () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def removeRepository(projectId: String, repositoryId: Double): js.Promise[js.Object] = js.native
    def removeRepository(projectId: String, repositoryId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeRepository(projectId: Double, repositoryId: Double): js.Promise[js.Object] = js.native
    def removeRepository(projectId: Double, repositoryId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def removeTag(projectId: String, repositoryId: Double, tagName: String): js.Promise[js.Object] = js.native
    def removeTag(projectId: String, repositoryId: Double, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
    def removeTag(projectId: Double, repositoryId: Double, tagName: String): js.Promise[js.Object] = js.native
    def removeTag(projectId: Double, repositoryId: Double, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def removeTags(projectId: String, repositoryId: Double, tagNameRegex: String): js.Promise[js.Object] = js.native
    def removeTags(projectId: String, repositoryId: Double, tagNameRegex: String, options: SudokeepNstringolderThans): js.Promise[js.Object] = js.native
    def removeTags(projectId: Double, repositoryId: Double, tagNameRegex: String): js.Promise[js.Object] = js.native
    def removeTags(projectId: Double, repositoryId: Double, tagNameRegex: String, options: SudokeepNstringolderThans): js.Promise[js.Object] = js.native
    
    def repositories(projectId: String): js.Promise[GetResponse] = js.native
    def repositories(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def repositories(projectId: Double): js.Promise[GetResponse] = js.native
    def repositories(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def showTag(projectId: String, repositoryId: Double, tagName: String): js.Promise[GetResponse] = js.native
    def showTag(projectId: String, repositoryId: Double, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showTag(projectId: Double, repositoryId: Double, tagName: String): js.Promise[GetResponse] = js.native
    def showTag(projectId: Double, repositoryId: Double, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def tags(projectId: String, repositoryId: Double): js.Promise[GetResponse] = js.native
    def tags(projectId: String, repositoryId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def tags(projectId: Double, repositoryId: Double): js.Promise[GetResponse] = js.native
    def tags(projectId: Double, repositoryId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  }
}
