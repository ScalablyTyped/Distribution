package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatDiagnosticsHost extends StObject {
  
  def getCanonicalFileName(fileName: java.lang.String): java.lang.String
  
  def getCurrentDirectory(): java.lang.String
  
  def getNewLine(): java.lang.String
}
object FormatDiagnosticsHost {
  
  inline def apply(
    getCanonicalFileName: java.lang.String => java.lang.String,
    getCurrentDirectory: () => java.lang.String,
    getNewLine: () => java.lang.String
  ): FormatDiagnosticsHost = {
    val __obj = js.Dynamic.literal(getCanonicalFileName = js.Any.fromFunction1(getCanonicalFileName), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getNewLine = js.Any.fromFunction0(getNewLine))
    __obj.asInstanceOf[FormatDiagnosticsHost]
  }
  
  extension [Self <: FormatDiagnosticsHost](x: Self) {
    
    inline def setGetCanonicalFileName(value: java.lang.String => java.lang.String): Self = StObject.set(x, "getCanonicalFileName", js.Any.fromFunction1(value))
    
    inline def setGetCurrentDirectory(value: () => java.lang.String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    inline def setGetNewLine(value: () => java.lang.String): Self = StObject.set(x, "getNewLine", js.Any.fromFunction0(value))
  }
}
