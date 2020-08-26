package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterCapacityInfo extends js.Object {
  /**
    * The current capacity of the DB cluster.
    */
  var CurrentCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster. 
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A value that specifies the capacity that the DB cluster scales to next.
    */
  var PendingCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The number of seconds before a call to ModifyCurrentDBClusterCapacity times out.
    */
  var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.native
  /**
    * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
    */
  var TimeoutAction: js.UndefOr[String] = js.native
}

object DBClusterCapacityInfo {
  @scala.inline
  def apply(): DBClusterCapacityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterCapacityInfo]
  }
  @scala.inline
  implicit class DBClusterCapacityInfoOps[Self <: DBClusterCapacityInfo] (val x: Self) extends AnyVal {
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
    def setCurrentCapacity(value: IntegerOptional): Self = this.set("CurrentCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentCapacity: Self = this.set("CurrentCapacity", js.undefined)
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterIdentifier: Self = this.set("DBClusterIdentifier", js.undefined)
    @scala.inline
    def setPendingCapacity(value: IntegerOptional): Self = this.set("PendingCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingCapacity: Self = this.set("PendingCapacity", js.undefined)
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

