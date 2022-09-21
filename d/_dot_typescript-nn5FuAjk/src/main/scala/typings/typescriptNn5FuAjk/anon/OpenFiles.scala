package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFiles extends StObject {
  
  var openFiles: Array[String]
}
object OpenFiles {
  
  inline def apply(openFiles: Array[String]): OpenFiles = {
    val __obj = js.Dynamic.literal(openFiles = openFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFiles]
  }
  
  extension [Self <: OpenFiles](x: Self) {
    
    inline def setOpenFiles(value: Array[String]): Self = StObject.set(x, "openFiles", value.asInstanceOf[js.Any])
  }
}
