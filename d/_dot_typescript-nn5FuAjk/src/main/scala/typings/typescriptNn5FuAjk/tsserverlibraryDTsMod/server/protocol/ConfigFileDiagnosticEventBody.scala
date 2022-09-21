package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFileDiagnosticEventBody extends StObject {
  
  /**
    * The name of the found config file.
    */
  var configFile: String
  
  /**
    * An arry of diagnostic information items for the found config file.
    */
  var diagnostics: Array[DiagnosticWithFileName]
  
  /**
    * The file which trigged the searching and error-checking of the config file
    */
  var triggerFile: String
}
object ConfigFileDiagnosticEventBody {
  
  inline def apply(configFile: String, diagnostics: Array[DiagnosticWithFileName], triggerFile: String): ConfigFileDiagnosticEventBody = {
    val __obj = js.Dynamic.literal(configFile = configFile.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], triggerFile = triggerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFileDiagnosticEventBody]
  }
  
  extension [Self <: ConfigFileDiagnosticEventBody](x: Self) {
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: Array[DiagnosticWithFileName]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setTriggerFile(value: String): Self = StObject.set(x, "triggerFile", value.asInstanceOf[js.Any])
  }
}
