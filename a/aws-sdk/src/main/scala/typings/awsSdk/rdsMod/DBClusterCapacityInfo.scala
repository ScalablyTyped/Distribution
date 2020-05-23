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
  def apply(
    CurrentCapacity: js.UndefOr[IntegerOptional] = js.undefined,
    DBClusterIdentifier: String = null,
    PendingCapacity: js.UndefOr[IntegerOptional] = js.undefined,
    SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined,
    TimeoutAction: String = null
  ): DBClusterCapacityInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentCapacity)) __obj.updateDynamic("CurrentCapacity")(CurrentCapacity.get.asInstanceOf[js.Any])
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(PendingCapacity)) __obj.updateDynamic("PendingCapacity")(PendingCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SecondsBeforeTimeout)) __obj.updateDynamic("SecondsBeforeTimeout")(SecondsBeforeTimeout.get.asInstanceOf[js.Any])
    if (TimeoutAction != null) __obj.updateDynamic("TimeoutAction")(TimeoutAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterCapacityInfo]
  }
}

