package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.searchstringundefinedPagi
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object branchesDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Branches.d.ts", "Branches")
  @js.native
  open class Branches () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: searchstringundefinedPagi): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: searchstringundefinedPagi): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, branchName: String, ref: String): js.Promise[js.Object] = js.native
    def create(projectId: String, branchName: String, ref: String, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: Double, branchName: String, ref: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, branchName: String, ref: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def protect(projectId: String, branchName: String): js.Promise[js.Object] = js.native
    def protect(projectId: String, branchName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def protect(projectId: Double, branchName: String): js.Promise[js.Object] = js.native
    def protect(projectId: Double, branchName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, branchName: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, branchName: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, branchName: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, branchName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, branchName: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, branchName: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def unprotect(projectId: String, branchName: String): js.Promise[js.Object] = js.native
    def unprotect(projectId: String, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
    def unprotect(projectId: Double, branchName: String): js.Promise[js.Object] = js.native
    def unprotect(projectId: Double, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
  }
}
