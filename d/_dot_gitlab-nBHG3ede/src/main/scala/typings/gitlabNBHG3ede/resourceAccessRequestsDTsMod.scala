package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.anon.accessLevelAccessLevelund
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceAccessRequestsDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/templates/ResourceAccessRequests.d.ts", "ResourceAccessRequests")
  @js.native
  open class ResourceAccessRequests protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    
    def approve(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
    def approve(resourceId: String, userId: Double, hasAccessLevel: accessLevelAccessLevelund): js.Promise[js.Object] = js.native
    def approve(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
    def approve(resourceId: Double, userId: Double, hasAccessLevel: accessLevelAccessLevelund): js.Promise[js.Object] = js.native
    
    def deny(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
    def deny(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
    
    def request(resourceId: String): js.Promise[js.Object] = js.native
    def request(resourceId: Double): js.Promise[js.Object] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`10`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`20`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`30`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`40`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`50`
  */
  trait AccessLevel extends StObject
  object AccessLevel {
    
    inline def `10`: typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`10` = 10.asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`10`]
    
    inline def `20`: typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`20` = 20.asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`20`]
    
    inline def `30`: typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`30` = 30.asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`30`]
    
    inline def `40`: typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`40` = 40.asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`40`]
    
    inline def `50`: typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`50` = 50.asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeNumbers.`50`]
  }
}
