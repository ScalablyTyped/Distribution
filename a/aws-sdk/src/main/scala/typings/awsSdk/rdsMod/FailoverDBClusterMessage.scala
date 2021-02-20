package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailoverDBClusterMessage extends StObject {
  
  /**
    * A DB cluster identifier to force a failover for. This parameter isn't case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: String = js.native
  
  /**
    * The name of the instance to promote to the primary instance. You must specify the instance identifier for an Aurora Replica in the DB cluster. For example, mydbcluster-replica1.
    */
  var TargetDBInstanceIdentifier: js.UndefOr[String] = js.native
}
object FailoverDBClusterMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String): FailoverDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverDBClusterMessage]
  }
  
  @scala.inline
  implicit class FailoverDBClusterMessageMutableBuilder[Self <: FailoverDBClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDBInstanceIdentifier(value: String): Self = StObject.set(x, "TargetDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDBInstanceIdentifierUndefined: Self = StObject.set(x, "TargetDBInstanceIdentifier", js.undefined)
  }
}
