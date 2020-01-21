package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestedServiceQuotaChange extends js.Object {
  /**
    * The case Id for the service quota increase request.
    */
  var CaseId: js.UndefOr[CustomerServiceEngagementId] = js.native
  /**
    * The date and time when the service quota increase request was received and the case Id was created. 
    */
  var Created: js.UndefOr[DateTime] = js.native
  /**
    * New increased value for the service quota.
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.native
  /**
    * Identifies if the quota is global.
    */
  var GlobalQuota: js.UndefOr[typings.awsSdk.servicequotasMod.GlobalQuota] = js.native
  /**
    * The unique identifier of a requested service quota change.
    */
  var Id: js.UndefOr[RequestId] = js.native
  /**
    * The date and time of the most recent change in the service quota increase request.
    */
  var LastUpdated: js.UndefOr[DateTime] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service quota.
    */
  var QuotaArn: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaArn] = js.native
  /**
    * Specifies the service quota that you want to use.
    */
  var QuotaCode: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaCode] = js.native
  /**
    * Name of the service quota.
    */
  var QuotaName: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaName] = js.native
  /**
    * The IAM identity who submitted the service quota increase request.
    */
  var Requester: js.UndefOr[typings.awsSdk.servicequotasMod.Requester] = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceCode] = js.native
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceName] = js.native
  /**
    * State of the service quota increase request.
    */
  var Status: js.UndefOr[RequestStatus] = js.native
  /**
    * Specifies the unit used for the quota.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.native
}

object RequestedServiceQuotaChange {
  @scala.inline
  def apply(
    CaseId: CustomerServiceEngagementId = null,
    Created: DateTime = null,
    DesiredValue: Int | Double = null,
    GlobalQuota: js.UndefOr[Boolean] = js.undefined,
    Id: RequestId = null,
    LastUpdated: DateTime = null,
    QuotaArn: QuotaArn = null,
    QuotaCode: QuotaCode = null,
    QuotaName: QuotaName = null,
    Requester: Requester = null,
    ServiceCode: ServiceCode = null,
    ServiceName: ServiceName = null,
    Status: RequestStatus = null,
    Unit: QuotaUnit = null
  ): RequestedServiceQuotaChange = {
    val __obj = js.Dynamic.literal()
    if (CaseId != null) __obj.updateDynamic("CaseId")(CaseId.asInstanceOf[js.Any])
    if (Created != null) __obj.updateDynamic("Created")(Created.asInstanceOf[js.Any])
    if (DesiredValue != null) __obj.updateDynamic("DesiredValue")(DesiredValue.asInstanceOf[js.Any])
    if (!js.isUndefined(GlobalQuota)) __obj.updateDynamic("GlobalQuota")(GlobalQuota.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (QuotaArn != null) __obj.updateDynamic("QuotaArn")(QuotaArn.asInstanceOf[js.Any])
    if (QuotaCode != null) __obj.updateDynamic("QuotaCode")(QuotaCode.asInstanceOf[js.Any])
    if (QuotaName != null) __obj.updateDynamic("QuotaName")(QuotaName.asInstanceOf[js.Any])
    if (Requester != null) __obj.updateDynamic("Requester")(Requester.asInstanceOf[js.Any])
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestedServiceQuotaChange]
  }
}

