package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientProperties extends StObject {
  
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
    
    inline def setReconnectEnabled(value: ReconnectEnum): Self = StObject.set(x, "ReconnectEnabled", value.asInstanceOf[js.Any])
    
    inline def setReconnectEnabledUndefined: Self = StObject.set(x, "ReconnectEnabled", js.undefined)
  }
}
