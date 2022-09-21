package typings.awsSdkTypes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileMod {
  
  type IniSection = Record[String, js.UndefOr[String]]
  
  type ParsedIniData = Record[String, IniSection]
  
  type Profile = IniSection
  
  trait SharedConfigFiles extends StObject {
    
    var configFile: ParsedIniData
    
    var credentialsFile: ParsedIniData
  }
  object SharedConfigFiles {
    
    inline def apply(configFile: ParsedIniData, credentialsFile: ParsedIniData): SharedConfigFiles = {
      val __obj = js.Dynamic.literal(configFile = configFile.asInstanceOf[js.Any], credentialsFile = credentialsFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedConfigFiles]
    }
    
    extension [Self <: SharedConfigFiles](x: Self) {
      
      inline def setConfigFile(value: ParsedIniData): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setCredentialsFile(value: ParsedIniData): Self = StObject.set(x, "credentialsFile", value.asInstanceOf[js.Any])
    }
  }
}
