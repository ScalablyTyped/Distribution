package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupDetail extends js.Object {
  
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The date/time the instance group was created.
    */
  var CreationDateTime: Date = js.native
  
  /**
    * The date/time the instance group was terminated.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  
  /**
    * Unique identifier for the instance group.
    */
  var InstanceGroupId: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * Target number of instances to run in the instance group.
    */
  var InstanceRequestCount: Integer = js.native
  
  /**
    * Instance group role in the cluster
    */
  var InstanceRole: InstanceRoleType = js.native
  
  /**
    * Actual count of running instances.
    */
  var InstanceRunningCount: Integer = js.native
  
  /**
    * EC2 instance type.
    */
  var InstanceType: typings.awsSdk.emrMod.InstanceType = js.native
  
  /**
    * Details regarding the state of the instance group.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  
  /**
    * Market type of the EC2 instances used to create a cluster node.
    */
  var Market: MarketType = js.native
  
  /**
    * Friendly name for the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The date/time the instance group was available to the cluster.
    */
  var ReadyDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The date/time the instance group was started.
    */
  var StartDateTime: js.UndefOr[Date] = js.native
  
  /**
    * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
    */
  var State: InstanceGroupState = js.native
}
object InstanceGroupDetail {
  
  @scala.inline
  def apply(
    CreationDateTime: Date,
    InstanceRequestCount: Integer,
    InstanceRole: InstanceRoleType,
    InstanceRunningCount: Integer,
    InstanceType: InstanceType,
    Market: MarketType,
    State: InstanceGroupState
  ): InstanceGroupDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], InstanceRequestCount = InstanceRequestCount.asInstanceOf[js.Any], InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceRunningCount = InstanceRunningCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], Market = Market.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupDetail]
  }
  
  @scala.inline
  implicit class InstanceGroupDetailOps[Self <: InstanceGroupDetail] (val x: Self) extends AnyVal {
    
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
    def setCreationDateTime(value: Date): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRequestCount(value: Integer): Self = this.set("InstanceRequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRole(value: InstanceRoleType): Self = this.set("InstanceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRunningCount(value: Integer): Self = this.set("InstanceRunningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarket(value: MarketType): Self = this.set("Market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: InstanceGroupState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPrice(value: XmlStringMaxLen256): Self = this.set("BidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidPrice: Self = this.set("BidPrice", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: Date): Self = this.set("EndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTime: Self = this.set("EndDateTime", js.undefined)
    
    @scala.inline
    def setInstanceGroupId(value: XmlStringMaxLen256): Self = this.set("InstanceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceGroupId: Self = this.set("InstanceGroupId", js.undefined)
    
    @scala.inline
    def setLastStateChangeReason(value: XmlString): Self = this.set("LastStateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStateChangeReason: Self = this.set("LastStateChangeReason", js.undefined)
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setReadyDateTime(value: Date): Self = this.set("ReadyDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyDateTime: Self = this.set("ReadyDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: Date): Self = this.set("StartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("StartDateTime", js.undefined)
  }
}
