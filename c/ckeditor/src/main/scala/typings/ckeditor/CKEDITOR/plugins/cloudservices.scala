package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.fileTools.fileLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.plugins.cloudservices")
@js.native
object cloudservices extends js.Object {
  
  @js.native
  trait cloudServicesLoader extends fileLoader {
    
    var customToken: String = js.native
    
    def loadAndUpload(): Unit = js.native
    def loadAndUpload(url: js.UndefOr[scala.Nothing], additionalRequestParameters: js.Any): Unit = js.native
    
    def upload(): Unit = js.native
    def upload(url: js.UndefOr[scala.Nothing], additionalRequestParameters: js.Any): Unit = js.native
  }
}
