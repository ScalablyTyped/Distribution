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

object resourceNotesDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/templates/ResourceNotes.d.ts", "ResourceNotes")
  @js.native
  open class ResourceNotes protected () extends BaseService {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
    
    def all(resourceId: String, resource2Id: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, resource2Id: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: String, resource2Id: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: String, resource2Id: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: String): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(resourceId: String, resource2Id: String, body: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, resource2Id: String, body: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: String, resource2Id: Double, body: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, resource2Id: Double, body: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: String, body: String): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: String, body: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: Double, body: String): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: Double, body: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(resourceId: String, resource2Id: String, noteId: Double, body: String): js.Promise[js.Object] = js.native
    def edit(resourceId: String, resource2Id: String, noteId: Double, body: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: String, resource2Id: Double, noteId: Double, body: String): js.Promise[js.Object] = js.native
    def edit(resourceId: String, resource2Id: Double, noteId: Double, body: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, resource2Id: String, noteId: Double, body: String): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, resource2Id: String, noteId: Double, body: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, resource2Id: Double, noteId: Double, body: String): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, resource2Id: Double, noteId: Double, body: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(resourceId: String, resource2Id: String, noteId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, resource2Id: String, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: String, resource2Id: Double, noteId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, resource2Id: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, resource2Id: String, noteId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, resource2Id: String, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, resource2Id: Double, noteId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, resource2Id: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    /* protected */ var resource2Type: String = js.native
    
    def show(resourceId: String, resource2Id: String, noteId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: String, noteId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: Double, noteId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: Double, noteId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: String, noteId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: String, noteId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: Double, noteId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: Double, noteId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
