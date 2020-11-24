package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCurrentDBClusterCapacityMessage extends js.Object {
  
  /**
    * The DB cluster capacity. When you change the capacity of a paused Aurora Serverless DB cluster, it automatically resumes. Constraints:   For Aurora MySQL, valid capacity values are 1, 2, 4, 8, 16, 32, 64, 128, and 256.   For Aurora PostgreSQL, valid capacity values are 2, 4, 8, 16, 32, 64, 192, and 384.  
    */
  var Capacity: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive. Constraints:   Must match the identifier of an existing DB cluster.  
    */
  var DBClusterIdentifier: String = js.native
  
  /**
    * The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless scaling before enforcing the timeout action. The default is 300.   Value must be from 10 through 600.  
    */
  var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The action to take when the timeout is reached, either ForceApplyCapacityChange or RollbackCapacityChange.  ForceApplyCapacityChange, the default, sets the capacity to the specified value as soon as possible.  RollbackCapacityChange ignores the capacity change if a scaling point isn't found in the timeout period.
    */
  var TimeoutAction: js.UndefOr[String] = js.native
}
object ModifyCurrentDBClusterCapacityMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String): ModifyCurrentDBClusterCapacityMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCurrentDBClusterCapacityMessage]
  }
  
  @scala.inline
  implicit class ModifyCurrentDBClusterCapacityMessageOps[Self <: ModifyCurrentDBClusterCapacityMessage] (val x: Self) extends AnyVal {
    
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
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: IntegerOptional): Self = this.set("Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("Capacity", js.undefined)
    
    @scala.inline
    def setSecondsBeforeTimeout(value: IntegerOptional): Self = this.set("SecondsBeforeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondsBeforeTimeout: Self = this.set("SecondsBeforeTimeout", js.undefined)
    
    @scala.inline
    def setTimeoutAction(value: String): Self = this.set("TimeoutAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutAction: Self = this.set("TimeoutAction", js.undefined)
  }
}
