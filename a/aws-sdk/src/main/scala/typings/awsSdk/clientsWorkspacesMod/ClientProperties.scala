package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientProperties extends StObject {
  
  /**
    * Specifies whether users can upload diagnostic log files of Amazon WorkSpaces client directly to WorkSpaces to troubleshoot issues when using the WorkSpaces client. When enabled, the log files will be sent to WorkSpaces automatically and will be applied to all users in the specified directory.
    */
  var LogUploadEnabled: js.UndefOr[LogUploadEnum] = js.undefined
  
  /**
    * Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users can choose to reconnect to their WorkSpaces without re-entering their credentials. 
    */
  var ReconnectEnabled: js.UndefOr[ReconnectEnum] = js.undefined
}
object ClientProperties {
  
  inline def apply(): ClientProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientProperties]
  }
  
  extension [Self <: ClientProperties](x: Self) {
    
    inline def setLogUploadEnabled(value: LogUploadEnum): Self = StObject.set(x, "LogUploadEnabled", value.asInstanceOf[js.Any])
    
    inline def setLogUploadEnabledUndefined: Self = StObject.set(x, "LogUploadEnabled", js.undefined)
    
    inline def setReconnectEnabled(value: ReconnectEnum): Self = StObject.set(x, "ReconnectEnabled", value.asInstanceOf[js.Any])
    
    inline def setReconnectEnabledUndefined: Self = StObject.set(x, "ReconnectEnabled", js.undefined)
  }
}
