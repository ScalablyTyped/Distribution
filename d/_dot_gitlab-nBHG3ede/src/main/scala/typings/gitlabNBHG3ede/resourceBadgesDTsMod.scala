package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceBadgesDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/templates/ResourceBadges.d.ts", "ResourceBadges")
  @js.native
  open class ResourceBadges protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def add(resourceId: String): js.Promise[js.Object] = js.native
    def add(resourceId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(resourceId: Double): js.Promise[js.Object] = js.native
    def add(resourceId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def edit(resourceId: String, badgeId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: String, badgeId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, badgeId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, badgeId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def preview(resourceId: String, linkUrl: String, imageUrl: String): js.Promise[GetResponse] = js.native
    def preview(resourceId: String, linkUrl: String, imageUrl: String, options: Sudo): js.Promise[GetResponse] = js.native
    def preview(resourceId: Double, linkUrl: String, imageUrl: String): js.Promise[GetResponse] = js.native
    def preview(resourceId: Double, linkUrl: String, imageUrl: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def remove(resourceId: String, badgeId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, badgeId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, badgeId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, badgeId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(resourceId: String, badgeId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, badgeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, badgeId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, badgeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
