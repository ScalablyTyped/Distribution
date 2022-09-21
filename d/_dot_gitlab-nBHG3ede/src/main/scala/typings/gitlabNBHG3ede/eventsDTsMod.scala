package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.closed
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.commented
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.created
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.destroyed
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.expired
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.issue
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.joined
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.left
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.merge_request
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.merged
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.milestone
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.note
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.project
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.pushed
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.reopened
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.snippet
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.updated
import typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.user
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Events.d.ts", "Events")
  @js.native
  open class Events () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions & EventOptions): js.Promise[GetResponse] = js.native
  }
  
  trait EventOptions extends StObject {
    
    var action: js.UndefOr[
        created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
      ] = js.undefined
    
    var targetType: js.UndefOr[issue | milestone | merge_request | note | project | snippet | user] = js.undefined
  }
  object EventOptions {
    
    inline def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    extension [Self <: EventOptions](x: Self) {
      
      inline def setAction(
        value: created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setTargetType(value: issue | milestone | merge_request | note | project | snippet | user): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    }
  }
}
