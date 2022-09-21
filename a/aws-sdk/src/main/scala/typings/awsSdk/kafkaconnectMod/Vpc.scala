package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vpc extends StObject {
  
  /**
    * The security groups for the connector.
    */
  var securityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The subnets for the connector.
    */
  var subnets: listOfString
}
object Vpc {
  
  inline def apply(subnets: listOfString): Vpc = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vpc]
  }
  
  extension [Self <: Vpc](x: Self) {
    
    inline def setSecurityGroups(value: listOfString): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "securityGroups", js.Array(value*))
    
    inline def setSubnets(value: listOfString): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: string*): Self = StObject.set(x, "subnets", js.Array(value*))
  }
}
