package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectImportExportDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/ProjectImportExport.d.ts", "ProjectImportExport")
  @js.native
  open class ProjectImportExport () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def download(projectId: String): js.Promise[GetResponse] = js.native
    def download(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def download(projectId: Double): js.Promise[GetResponse] = js.native
    def download(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def exportStatus(projectId: String): js.Promise[GetResponse] = js.native
    def exportStatus(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def exportStatus(projectId: Double): js.Promise[GetResponse] = js.native
    def exportStatus(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def `import`(content: String, path: String): js.Promise[js.Object] = js.native
    def `import`(content: String, path: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def importStatus(projectId: String): js.Promise[GetResponse] = js.native
    def importStatus(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def importStatus(projectId: Double): js.Promise[GetResponse] = js.native
    def importStatus(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def schedule(projectId: String): js.Promise[js.Object] = js.native
    def schedule(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def schedule(projectId: Double): js.Promise[js.Object] = js.native
    def schedule(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  }
  
  trait UploadMetadata extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object UploadMetadata {
    
    inline def apply(): UploadMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadMetadata]
    }
    
    extension [Self <: UploadMetadata](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
}
