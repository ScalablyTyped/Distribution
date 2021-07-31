package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverDBClusterMessage extends StObject {
  
  /**
    * A cluster identifier to force a failover for. This parameter is not case sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the instance to promote to the primary instance. You must specify the instance identifier for an Amazon DocumentDB replica in the cluster. For example, mydbcluster-replica1.
    */
  var TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined
}
object FailoverDBClusterMessage {
  
  @scala.inline
  def apply(): FailoverDBClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverDBClusterMessage]
  }
  
  @scala.inline
  implicit class FailoverDBClusterMessageMutableBuilder[Self <: FailoverDBClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setTargetDBInstanceIdentifier(value: String): Self = StObject.set(x, "TargetDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDBInstanceIdentifierUndefined: Self = StObject.set(x, "TargetDBInstanceIdentifier", js.undefined)
  }
}
