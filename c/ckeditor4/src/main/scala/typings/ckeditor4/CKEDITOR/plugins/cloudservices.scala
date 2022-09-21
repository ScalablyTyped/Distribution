package typings.ckeditor4.CKEDITOR.plugins

import typings.ckeditor4.CKEDITOR.fileTools.fileLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudservices {
  
  @js.native
  trait cloudServicesLoader
    extends StObject
       with fileLoader {
    
    var customToken: String = js.native
    
    def loadAndUpload(): Unit = js.native
    def loadAndUpload(url: Unit, additionalRequestParameters: Any): Unit = js.native
    
    def upload(): Unit = js.native
    def upload(url: Unit, additionalRequestParameters: Any): Unit = js.native
  }
}
