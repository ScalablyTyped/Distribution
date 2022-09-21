package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBProxyTargetGroupRequest extends StObject {
  
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfiguration] = js.undefined
  
  /**
    * The name of the proxy.
    */
  var DBProxyName: String
  
  /**
    * The new name for the modified DBProxyTarget. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var NewName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the target group to modify.
    */
  var TargetGroupName: String
}
object ModifyDBProxyTargetGroupRequest {
  
  inline def apply(DBProxyName: String, TargetGroupName: String): ModifyDBProxyTargetGroupRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any], TargetGroupName = TargetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBProxyTargetGroupRequest]
  }
  
  extension [Self <: ModifyDBProxyTargetGroupRequest](x: Self) {
    
    inline def setConnectionPoolConfig(value: ConnectionPoolConfiguration): Self = StObject.set(x, "ConnectionPoolConfig", value.asInstanceOf[js.Any])
    
    inline def setConnectionPoolConfigUndefined: Self = StObject.set(x, "ConnectionPoolConfig", js.undefined)
    
    inline def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    inline def setNewName(value: String): Self = StObject.set(x, "NewName", value.asInstanceOf[js.Any])
    
    inline def setNewNameUndefined: Self = StObject.set(x, "NewName", js.undefined)
    
    inline def setTargetGroupName(value: String): Self = StObject.set(x, "TargetGroupName", value.asInstanceOf[js.Any])
  }
}
