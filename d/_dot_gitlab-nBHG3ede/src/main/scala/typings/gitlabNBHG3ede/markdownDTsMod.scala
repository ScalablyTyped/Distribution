package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.gfmstringundefinedproject
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markdownDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Markdown.d.ts", "Markdown")
  @js.native
  open class Markdown () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def render(text: String): js.Promise[js.Object] = js.native
    def render(text: String, options: gfmstringundefinedproject): js.Promise[js.Object] = js.native
  }
}
