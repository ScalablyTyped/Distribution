package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUploaderLocaleMod {
  
  object default {
    
    @JSImport("baseui/file-uploader/locale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/file-uploader/locale", "default.browseFiles")
    @js.native
    def browseFiles: String = js.native
    inline def browseFiles_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browseFiles")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/file-uploader/locale", "default.cancel")
    @js.native
    def cancel: String = js.native
    inline def cancel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/file-uploader/locale", "default.dropFilesToUpload")
    @js.native
    def dropFilesToUpload: String = js.native
    inline def dropFilesToUpload_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropFilesToUpload")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/file-uploader/locale", "default.or")
    @js.native
    def or: String = js.native
    inline def or_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("or")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/file-uploader/locale", "default.retry")
    @js.native
    def retry: String = js.native
    inline def retry_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("retry")(x.asInstanceOf[js.Any])
  }
  
  trait FileUploaderLocale extends StObject {
    
    var browseFiles: String
    
    var cancel: String
    
    var dropFilesToUpload: String
    
    var or: String
    
    var retry: String
  }
  object FileUploaderLocale {
    
    inline def apply(browseFiles: String, cancel: String, dropFilesToUpload: String, or: String, retry: String): FileUploaderLocale = {
      val __obj = js.Dynamic.literal(browseFiles = browseFiles.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], dropFilesToUpload = dropFilesToUpload.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploaderLocale]
    }
    
    extension [Self <: FileUploaderLocale](x: Self) {
      
      inline def setBrowseFiles(value: String): Self = StObject.set(x, "browseFiles", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setDropFilesToUpload(value: String): Self = StObject.set(x, "dropFilesToUpload", value.asInstanceOf[js.Any])
      
      inline def setOr(value: String): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: String): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    }
  }
}
