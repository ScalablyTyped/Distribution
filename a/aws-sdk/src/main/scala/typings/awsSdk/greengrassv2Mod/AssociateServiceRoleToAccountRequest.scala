package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateServiceRoleToAccountRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service role to associate with IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region.
    */
  var roleArn: String
}
object AssociateServiceRoleToAccountRequest {
  
  inline def apply(roleArn: String): AssociateServiceRoleToAccountRequest = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateServiceRoleToAccountRequest]
  }
  
  extension [Self <: AssociateServiceRoleToAccountRequest](x: Self) {
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
