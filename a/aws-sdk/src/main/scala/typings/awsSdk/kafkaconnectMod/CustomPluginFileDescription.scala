package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPluginFileDescription extends StObject {
  
  /**
    * The hex-encoded MD5 checksum of the custom plugin file. You can use it to validate the file.
    */
  var fileMd5: js.UndefOr[string] = js.undefined
  
  /**
    * The size in bytes of the custom plugin file. You can use it to validate the file.
    */
  var fileSize: js.UndefOr[long] = js.undefined
}
object CustomPluginFileDescription {
  
  inline def apply(): CustomPluginFileDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPluginFileDescription]
  }
  
  extension [Self <: CustomPluginFileDescription](x: Self) {
    
    inline def setFileMd5(value: string): Self = StObject.set(x, "fileMd5", value.asInstanceOf[js.Any])
    
    inline def setFileMd5Undefined: Self = StObject.set(x, "fileMd5", js.undefined)
    
    inline def setFileSize(value: long): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
  }
}
