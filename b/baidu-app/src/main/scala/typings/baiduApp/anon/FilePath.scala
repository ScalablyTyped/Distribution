package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePath extends StObject {
  
  var filePath: String
}
object FilePath {
  
  @scala.inline
  def apply(filePath: String): FilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
  
  @scala.inline
  implicit class FilePathMutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
