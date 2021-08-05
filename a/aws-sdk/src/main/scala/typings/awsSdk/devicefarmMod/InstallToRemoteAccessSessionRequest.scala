package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallToRemoteAccessSessionRequest extends StObject {
  
  /**
    * The ARN of the app about which you are requesting information.
    */
  var appArn: AmazonResourceName
  
  /**
    * The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
    */
  var remoteAccessSessionArn: AmazonResourceName
}
object InstallToRemoteAccessSessionRequest {
  
  inline def apply(appArn: AmazonResourceName, remoteAccessSessionArn: AmazonResourceName): InstallToRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], remoteAccessSessionArn = remoteAccessSessionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallToRemoteAccessSessionRequest]
  }
  
  extension [Self <: InstallToRemoteAccessSessionRequest](x: Self) {
    
    inline def setAppArn(value: AmazonResourceName): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessSessionArn(value: AmazonResourceName): Self = StObject.set(x, "remoteAccessSessionArn", value.asInstanceOf[js.Any])
  }
}
