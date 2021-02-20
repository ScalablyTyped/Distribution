package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterMember extends StObject {
  
  /**
    * Specifies the status of the cluster parameter group for this member of the DB cluster.
    */
  var DBClusterParameterGroupStatus: js.UndefOr[String] = js.native
  
  /**
    * Specifies the instance identifier for this member of the cluster.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A value that is true if the cluster member is the primary instance for the cluster and false otherwise.
    */
  var IsClusterWriter: js.UndefOr[Boolean] = js.native
  
  /**
    * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance. 
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
}
object DBClusterMember {
  
  @scala.inline
  def apply(): DBClusterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterMember]
  }
  
  @scala.inline
  implicit class DBClusterMemberMutableBuilder[Self <: DBClusterMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterParameterGroupStatus(value: String): Self = StObject.set(x, "DBClusterParameterGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterParameterGroupStatusUndefined: Self = StObject.set(x, "DBClusterParameterGroupStatus", js.undefined)
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setIsClusterWriter(value: Boolean): Self = StObject.set(x, "IsClusterWriter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClusterWriterUndefined: Self = StObject.set(x, "IsClusterWriter", js.undefined)
    
    @scala.inline
    def setPromotionTier(value: IntegerOptional): Self = StObject.set(x, "PromotionTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionTierUndefined: Self = StObject.set(x, "PromotionTier", js.undefined)
  }
}
