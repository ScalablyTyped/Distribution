package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceDetails extends js.Object {
  /**
    * The Amazon EC2 instances that AWS recommends that you purchase.
    */
  var EC2InstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.EC2InstanceDetails] = js.native
  /**
    * The Amazon ES instances that AWS recommends that you purchase.
    */
  var ESInstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.ESInstanceDetails] = js.native
  /**
    * The ElastiCache instances that AWS recommends that you purchase.
    */
  var ElastiCacheInstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.ElastiCacheInstanceDetails] = js.native
  /**
    * The Amazon RDS instances that AWS recommends that you purchase.
    */
  var RDSInstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.RDSInstanceDetails] = js.native
  /**
    * The Amazon Redshift instances that AWS recommends that you purchase.
    */
  var RedshiftInstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.RedshiftInstanceDetails] = js.native
}

object InstanceDetails {
  @scala.inline
  def apply(
    EC2InstanceDetails: EC2InstanceDetails = null,
    ESInstanceDetails: ESInstanceDetails = null,
    ElastiCacheInstanceDetails: ElastiCacheInstanceDetails = null,
    RDSInstanceDetails: RDSInstanceDetails = null,
    RedshiftInstanceDetails: RedshiftInstanceDetails = null
  ): InstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (EC2InstanceDetails != null) __obj.updateDynamic("EC2InstanceDetails")(EC2InstanceDetails.asInstanceOf[js.Any])
    if (ESInstanceDetails != null) __obj.updateDynamic("ESInstanceDetails")(ESInstanceDetails.asInstanceOf[js.Any])
    if (ElastiCacheInstanceDetails != null) __obj.updateDynamic("ElastiCacheInstanceDetails")(ElastiCacheInstanceDetails.asInstanceOf[js.Any])
    if (RDSInstanceDetails != null) __obj.updateDynamic("RDSInstanceDetails")(RDSInstanceDetails.asInstanceOf[js.Any])
    if (RedshiftInstanceDetails != null) __obj.updateDynamic("RedshiftInstanceDetails")(RedshiftInstanceDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceDetails]
  }
}

