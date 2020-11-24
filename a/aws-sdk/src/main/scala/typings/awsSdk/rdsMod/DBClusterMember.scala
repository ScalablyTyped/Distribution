package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterMember extends js.Object {
  
  /**
    * Specifies the status of the DB cluster parameter group for this member of the DB cluster.
    */
  var DBClusterParameterGroupStatus: js.UndefOr[String] = js.native
  
  /**
    * Specifies the instance identifier for this member of the DB cluster.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * Value that is true if the cluster member is the primary instance for the DB cluster and false otherwise.
    */
  var IsClusterWriter: js.UndefOr[Boolean] = js.native
  
  /**
    * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide. 
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
  implicit class DBClusterMemberOps[Self <: DBClusterMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDBClusterParameterGroupStatus(value: String): Self = this.set("DBClusterParameterGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterParameterGroupStatus: Self = this.set("DBClusterParameterGroupStatus", js.undefined)
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBInstanceIdentifier: Self = this.set("DBInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setIsClusterWriter(value: Boolean): Self = this.set("IsClusterWriter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClusterWriter: Self = this.set("IsClusterWriter", js.undefined)
    
    @scala.inline
    def setPromotionTier(value: IntegerOptional): Self = this.set("PromotionTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionTier: Self = this.set("PromotionTier", js.undefined)
  }
}
