package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.fileTools.fileLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.cloudservices")
@js.native
object cloudservices extends js.Object {
  @js.native
  trait cloudServicesLoader extends fileLoader {
    var customToken: String = js.native
    def loadAndUpload(): Unit = js.native
    def upload(): Unit = js.native
  }
  
}

