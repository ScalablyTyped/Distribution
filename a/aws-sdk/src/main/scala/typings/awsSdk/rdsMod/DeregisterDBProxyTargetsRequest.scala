package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterDBProxyTargetsRequest extends StObject {
  
  /**
    * One or more DB cluster identifiers.
    */
  var DBClusterIdentifiers: js.UndefOr[StringList] = js.native
  
  /**
    * One or more DB instance identifiers.
    */
  var DBInstanceIdentifiers: js.UndefOr[StringList] = js.native
  
  /**
    * The identifier of the DBProxy that is associated with the DBProxyTargetGroup.
    */
  var DBProxyName: String = js.native
  
  /**
    * The identifier of the DBProxyTargetGroup.
    */
  var TargetGroupName: js.UndefOr[String] = js.native
}
object DeregisterDBProxyTargetsRequest {
  
  @scala.inline
  def apply(DBProxyName: String): DeregisterDBProxyTargetsRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterDBProxyTargetsRequest]
  }
  
  @scala.inline
  implicit class DeregisterDBProxyTargetsRequestMutableBuilder[Self <: DeregisterDBProxyTargetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterIdentifiers(value: StringList): Self = StObject.set(x, "DBClusterIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterIdentifiersUndefined: Self = StObject.set(x, "DBClusterIdentifiers", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifiersVarargs(value: String*): Self = StObject.set(x, "DBClusterIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setDBInstanceIdentifiers(value: StringList): Self = StObject.set(x, "DBInstanceIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceIdentifiersUndefined: Self = StObject.set(x, "DBInstanceIdentifiers", js.undefined)
    
    @scala.inline
    def setDBInstanceIdentifiersVarargs(value: String*): Self = StObject.set(x, "DBInstanceIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupName(value: String): Self = StObject.set(x, "TargetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupNameUndefined: Self = StObject.set(x, "TargetGroupName", js.undefined)
  }
}
