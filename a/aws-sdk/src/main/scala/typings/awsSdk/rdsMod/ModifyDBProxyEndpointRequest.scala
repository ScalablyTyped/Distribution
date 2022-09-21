package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBProxyEndpointRequest extends StObject {
  
  /**
    * The name of the DB proxy sociated with the DB proxy endpoint that you want to modify.
    */
  var DBProxyEndpointName: typings.awsSdk.rdsMod.DBProxyEndpointName
  
  /**
    * The new identifier for the DBProxyEndpoint. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var NewDBProxyEndpointName: js.UndefOr[DBProxyEndpointName] = js.undefined
  
  /**
    * The VPC security group IDs for the DB proxy endpoint. When the DB proxy endpoint uses a different VPC than the original proxy, you also specify a different set of security group IDs than for the original proxy.
    */
  var VpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
}
object ModifyDBProxyEndpointRequest {
  
  inline def apply(DBProxyEndpointName: DBProxyEndpointName): ModifyDBProxyEndpointRequest = {
    val __obj = js.Dynamic.literal(DBProxyEndpointName = DBProxyEndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBProxyEndpointRequest]
  }
  
  extension [Self <: ModifyDBProxyEndpointRequest](x: Self) {
    
    inline def setDBProxyEndpointName(value: DBProxyEndpointName): Self = StObject.set(x, "DBProxyEndpointName", value.asInstanceOf[js.Any])
    
    inline def setNewDBProxyEndpointName(value: DBProxyEndpointName): Self = StObject.set(x, "NewDBProxyEndpointName", value.asInstanceOf[js.Any])
    
    inline def setNewDBProxyEndpointNameUndefined: Self = StObject.set(x, "NewDBProxyEndpointName", js.undefined)
    
    inline def setVpcSecurityGroupIds(value: StringList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
  }
}
