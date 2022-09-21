package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUploadErrors extends StObject {
  
  var fileUploadErrors: js.Array[String]
  
  var numFilesUploaded: Double
}
object FileUploadErrors {
  
  inline def apply(fileUploadErrors: js.Array[String], numFilesUploaded: Double): FileUploadErrors = {
    val __obj = js.Dynamic.literal(fileUploadErrors = fileUploadErrors.asInstanceOf[js.Any], numFilesUploaded = numFilesUploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadErrors]
  }
  
  extension [Self <: FileUploadErrors](x: Self) {
    
    inline def setFileUploadErrors(value: js.Array[String]): Self = StObject.set(x, "fileUploadErrors", value.asInstanceOf[js.Any])
    
    inline def setFileUploadErrorsVarargs(value: String*): Self = StObject.set(x, "fileUploadErrors", js.Array(value*))
    
    inline def setNumFilesUploaded(value: Double): Self = StObject.set(x, "numFilesUploaded", value.asInstanceOf[js.Any])
  }
}
