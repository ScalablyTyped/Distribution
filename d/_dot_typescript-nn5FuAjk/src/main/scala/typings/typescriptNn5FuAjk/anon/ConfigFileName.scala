package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFileName extends StObject {
  
  var configFileName: String
  
  var diagnostics: Array[Diagnostic]
  
  var triggerFile: String
}
object ConfigFileName {
  
  inline def apply(configFileName: String, diagnostics: Array[Diagnostic], triggerFile: String): ConfigFileName = {
    val __obj = js.Dynamic.literal(configFileName = configFileName.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], triggerFile = triggerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFileName]
  }
  
  extension [Self <: ConfigFileName](x: Self) {
    
    inline def setConfigFileName(value: String): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setTriggerFile(value: String): Self = StObject.set(x, "triggerFile", value.asInstanceOf[js.Any])
  }
}
