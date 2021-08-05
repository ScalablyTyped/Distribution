package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterMember extends StObject {
  
  /**
    * Specifies the status of the DB cluster parameter group for this member of the DB cluster.
    */
  var DBClusterParameterGroupStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the instance identifier for this member of the DB cluster.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Value that is true if the cluster member is the primary instance for the DB cluster and false otherwise.
    */
  var IsClusterWriter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide. 
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
}
object DBClusterMember {
  
  inline def apply(): DBClusterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterMember]
  }
  
  extension [Self <: DBClusterMember](x: Self) {
    
    inline def setDBClusterParameterGroupStatus(value: String): Self = StObject.set(x, "DBClusterParameterGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupStatusUndefined: Self = StObject.set(x, "DBClusterParameterGroupStatus", js.undefined)
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    inline def setIsClusterWriter(value: Boolean): Self = StObject.set(x, "IsClusterWriter", value.asInstanceOf[js.Any])
    
    inline def setIsClusterWriterUndefined: Self = StObject.set(x, "IsClusterWriter", js.undefined)
    
    inline def setPromotionTier(value: IntegerOptional): Self = StObject.set(x, "PromotionTier", value.asInstanceOf[js.Any])
    
    inline def setPromotionTierUndefined: Self = StObject.set(x, "PromotionTier", js.undefined)
  }
}
