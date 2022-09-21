package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.publicbooleanPaginatedReq
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snippetsDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Snippets.d.ts", "Snippets")
  @js.native
  open class Snippets () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasPOptions: publicbooleanPaginatedReq): js.Promise[GetResponse] = js.native
    
    def content(snippetId: Double): js.Promise[GetResponse] = js.native
    def content(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def create(title: String, fileName: String, content: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
    def create(
      title: String,
      fileName: String,
      content: String,
      visibility: SnippetVisibility,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def edit(snippetId: Double): js.Promise[js.Object] = js.native
    def edit(snippetId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(snippetId: Double): js.Promise[js.Object] = js.native
    def remove(snippetId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(snippetId: Double): js.Promise[GetResponse] = js.native
    def show(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def userAgentDetails(snippetId: Double): js.Promise[GetResponse] = js.native
    def userAgentDetails(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`private`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.public
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.internal
  */
  trait SnippetVisibility extends StObject
  object SnippetVisibility {
    
    inline def internal: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.internal = "internal".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.internal]
    
    inline def `private`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`private` = "private".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`private`]
    
    inline def public: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.public = "public".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.public]
  }
}
