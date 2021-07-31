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
  
  @scala.inline
  def apply(): ClientProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientProperties]
  }
  
  @scala.inline
  implicit class ClientPropertiesMutableBuilder[Self <: ClientProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReconnectEnabled(value: ReconnectEnum): Self = StObject.set(x, "ReconnectEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectEnabledUndefined: Self = StObject.set(x, "ReconnectEnabled", js.undefined)
  }
}
