package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRemoteAccessSessionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the session for which you want to delete remote access.
    */
  var arn: AmazonResourceName
}
object DeleteRemoteAccessSessionRequest {
  
  inline def apply(arn: AmazonResourceName): DeleteRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRemoteAccessSessionRequest]
  }
  
  extension [Self <: DeleteRemoteAccessSessionRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
