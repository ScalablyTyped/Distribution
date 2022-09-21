package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcDescription extends StObject {
  
  /**
    * The security groups for the connector.
    */
  var securityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The subnets for the connector.
    */
  var subnets: js.UndefOr[listOfString] = js.undefined
}
object VpcDescription {
  
  inline def apply(): VpcDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcDescription]
  }
  
  extension [Self <: VpcDescription](x: Self) {
    
    inline def setSecurityGroups(value: listOfString): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "securityGroups", js.Array(value*))
    
    inline def setSubnets(value: listOfString): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: string*): Self = StObject.set(x, "subnets", js.Array(value*))
  }
}
