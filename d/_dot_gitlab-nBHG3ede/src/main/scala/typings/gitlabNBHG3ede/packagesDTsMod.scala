package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagesDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Packages.d.ts", "Packages")
  @js.native
  open class Packages () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def remove(projectId: String, packageId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, packageId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, packageId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, packageId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, packageId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, packageId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, packageId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, packageId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def showFiles(projectId: String, packageId: Double): js.Promise[GetResponse] = js.native
    def showFiles(projectId: String, packageId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def showFiles(projectId: Double, packageId: Double): js.Promise[GetResponse] = js.native
    def showFiles(projectId: Double, packageId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
