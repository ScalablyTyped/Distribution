package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serverless extends StObject {
  
  /**
    * 
    Includes all client authentication information.
    
    */
  var ClientAuthentication: js.UndefOr[ServerlessClientAuthentication] = js.undefined
  
  /**
    * 
    The configuration of the Amazon VPCs for the cluster.
    
    */
  var VpcConfigs: listOfVpcConfig
}
object Serverless {
  
  inline def apply(VpcConfigs: listOfVpcConfig): Serverless = {
    val __obj = js.Dynamic.literal(VpcConfigs = VpcConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serverless]
  }
  
  extension [Self <: Serverless](x: Self) {
    
    inline def setClientAuthentication(value: ServerlessClientAuthentication): Self = StObject.set(x, "ClientAuthentication", value.asInstanceOf[js.Any])
    
    inline def setClientAuthenticationUndefined: Self = StObject.set(x, "ClientAuthentication", js.undefined)
    
    inline def setVpcConfigs(value: listOfVpcConfig): Self = StObject.set(x, "VpcConfigs", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigsVarargs(value: VpcConfig*): Self = StObject.set(x, "VpcConfigs", js.Array(value*))
  }
}
