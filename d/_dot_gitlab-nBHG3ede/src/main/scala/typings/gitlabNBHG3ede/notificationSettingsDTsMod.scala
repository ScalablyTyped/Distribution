package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.groupIdstringnumberPagina
import typings.gitlabNBHG3ede.anon.groupIdstringnumberlevelN
import typings.gitlabNBHG3ede.anon.projectIdstringnumberPagi
import typings.gitlabNBHG3ede.anon.projectIdstringnumberleve
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationSettingsDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/NotificationSettings.d.ts", "NotificationSettings")
  @js.native
  open class NotificationSettings () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasProjectIdGroupIdOptions: groupIdstringnumberPagina): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: projectIdstringnumberPagi): js.Promise[GetResponse] = js.native
    
    def edit(hasProjectIdGroupIdOptions: groupIdstringnumberlevelN): js.Promise[js.Object] = js.native
    def edit(hasProjectIdGroupIdOptions: projectIdstringnumberleve): js.Promise[js.Object] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.disabled
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.participating
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.watch
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.global
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.mention
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.custom
  */
  trait NotificationSettingLevel extends StObject
  object NotificationSettingLevel {
    
    inline def custom: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.custom = "custom".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.custom]
    
    inline def disabled: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.disabled = "disabled".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.disabled]
    
    inline def global: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.global = "global".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.global]
    
    inline def mention: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.mention = "mention".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.mention]
    
    inline def participating: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.participating = "participating".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.participating]
    
    inline def watch: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.watch = "watch".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.watch]
  }
}
