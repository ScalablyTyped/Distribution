package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputDestinationSettings extends StObject {
  
  /**
    * key used to extract the password from EC2 Parameter store
    */
  var PasswordParam: js.UndefOr[string] = js.undefined
  
  /**
    * Stream name for RTMP destinations (URLs of type rtmp://)
    */
  var StreamName: js.UndefOr[string] = js.undefined
  
  /**
    * A URL specifying a destination
    */
  var Url: js.UndefOr[string] = js.undefined
  
  /**
    * username for destination
    */
  var Username: js.UndefOr[string] = js.undefined
}
object OutputDestinationSettings {
  
  inline def apply(): OutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDestinationSettings]
  }
  
  extension [Self <: OutputDestinationSettings](x: Self) {
    
    inline def setPasswordParam(value: string): Self = StObject.set(x, "PasswordParam", value.asInstanceOf[js.Any])
    
    inline def setPasswordParamUndefined: Self = StObject.set(x, "PasswordParam", js.undefined)
    
    inline def setStreamName(value: string): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    inline def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
