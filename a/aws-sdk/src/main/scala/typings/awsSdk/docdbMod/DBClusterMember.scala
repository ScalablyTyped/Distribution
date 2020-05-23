package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterMember extends js.Object {
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
  def apply(
    DBClusterParameterGroupStatus: String = null,
    DBInstanceIdentifier: String = null,
    IsClusterWriter: js.UndefOr[Boolean] = js.undefined,
    PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  ): DBClusterMember = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroupStatus != null) __obj.updateDynamic("DBClusterParameterGroupStatus")(DBClusterParameterGroupStatus.asInstanceOf[js.Any])
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(IsClusterWriter)) __obj.updateDynamic("IsClusterWriter")(IsClusterWriter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PromotionTier)) __obj.updateDynamic("PromotionTier")(PromotionTier.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterMember]
  }
}

