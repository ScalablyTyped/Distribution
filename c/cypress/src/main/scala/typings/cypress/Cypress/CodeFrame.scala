package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeFrame extends StObject {
  
  var absoluteFile: String
  
  var column: Double
  
  var frame: String
  
  var language: String
  
  var line: Double
  
  var originalFile: String
  
  var relativeFile: String
}
object CodeFrame {
  
  inline def apply(
    absoluteFile: String,
    column: Double,
    frame: String,
    language: String,
    line: Double,
    originalFile: String,
    relativeFile: String
  ): CodeFrame = {
    val __obj = js.Dynamic.literal(absoluteFile = absoluteFile.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], originalFile = originalFile.asInstanceOf[js.Any], relativeFile = relativeFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeFrame] (val x: Self) extends AnyVal {
    
    inline def setAbsoluteFile(value: String): Self = StObject.set(x, "absoluteFile", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setOriginalFile(value: String): Self = StObject.set(x, "originalFile", value.asInstanceOf[js.Any])
    
    inline def setRelativeFile(value: String): Self = StObject.set(x, "relativeFile", value.asInstanceOf[js.Any])
  }
}
