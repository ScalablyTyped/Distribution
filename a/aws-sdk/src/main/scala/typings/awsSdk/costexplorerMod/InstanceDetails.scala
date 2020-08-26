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
  def apply(): InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceDetails]
  }
  @scala.inline
  implicit class InstanceDetailsOps[Self <: InstanceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEC2InstanceDetails(value: EC2InstanceDetails): Self = this.set("EC2InstanceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2InstanceDetails: Self = this.set("EC2InstanceDetails", js.undefined)
    @scala.inline
    def setESInstanceDetails(value: ESInstanceDetails): Self = this.set("ESInstanceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteESInstanceDetails: Self = this.set("ESInstanceDetails", js.undefined)
    @scala.inline
    def setElastiCacheInstanceDetails(value: ElastiCacheInstanceDetails): Self = this.set("ElastiCacheInstanceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElastiCacheInstanceDetails: Self = this.set("ElastiCacheInstanceDetails", js.undefined)
    @scala.inline
    def setRDSInstanceDetails(value: RDSInstanceDetails): Self = this.set("RDSInstanceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRDSInstanceDetails: Self = this.set("RDSInstanceDetails", js.undefined)
    @scala.inline
    def setRedshiftInstanceDetails(value: RedshiftInstanceDetails): Self = this.set("RedshiftInstanceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedshiftInstanceDetails: Self = this.set("RedshiftInstanceDetails", js.undefined)
  }
  
}

