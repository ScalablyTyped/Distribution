package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportFileInError extends StObject {
  
  var fileName: java.lang.String
  
  var line: Double
}
object ReportFileInError {
  
  inline def apply(fileName: java.lang.String, line: Double): ReportFileInError = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportFileInError]
  }
  
  extension [Self <: ReportFileInError](x: Self) {
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
