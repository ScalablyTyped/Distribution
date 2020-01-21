package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trust extends js.Object {
  /**
    * The date and time that the trust relationship was created.
    */
  var CreatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.CreatedDateTime] = js.native
  /**
    * The Directory ID of the AWS directory involved in the trust relationship.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The date and time that the trust relationship was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LastUpdatedDateTime] = js.native
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
    */
  var RemoteDomainName: js.UndefOr[typings.awsSdk.directoryserviceMod.RemoteDomainName] = js.native
  /**
    * Current state of selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsSdk.directoryserviceMod.SelectiveAuth] = js.native
  /**
    * The date and time that the TrustState was last updated.
    */
  var StateLastUpdatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.StateLastUpdatedDateTime] = js.native
  /**
    * The trust relationship direction.
    */
  var TrustDirection: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustDirection] = js.native
  /**
    * The unique ID of the trust relationship.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.native
  /**
    * The trust relationship state.
    */
  var TrustState: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustState] = js.native
  /**
    * The reason for the TrustState.
    */
  var TrustStateReason: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustStateReason] = js.native
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustType] = js.native
}

object Trust {
  @scala.inline
  def apply(
    CreatedDateTime: CreatedDateTime = null,
    DirectoryId: DirectoryId = null,
    LastUpdatedDateTime: LastUpdatedDateTime = null,
    RemoteDomainName: RemoteDomainName = null,
    SelectiveAuth: SelectiveAuth = null,
    StateLastUpdatedDateTime: StateLastUpdatedDateTime = null,
    TrustDirection: TrustDirection = null,
    TrustId: TrustId = null,
    TrustState: TrustState = null,
    TrustStateReason: TrustStateReason = null,
    TrustType: TrustType = null
  ): Trust = {
    val __obj = js.Dynamic.literal()
    if (CreatedDateTime != null) __obj.updateDynamic("CreatedDateTime")(CreatedDateTime.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (LastUpdatedDateTime != null) __obj.updateDynamic("LastUpdatedDateTime")(LastUpdatedDateTime.asInstanceOf[js.Any])
    if (RemoteDomainName != null) __obj.updateDynamic("RemoteDomainName")(RemoteDomainName.asInstanceOf[js.Any])
    if (SelectiveAuth != null) __obj.updateDynamic("SelectiveAuth")(SelectiveAuth.asInstanceOf[js.Any])
    if (StateLastUpdatedDateTime != null) __obj.updateDynamic("StateLastUpdatedDateTime")(StateLastUpdatedDateTime.asInstanceOf[js.Any])
    if (TrustDirection != null) __obj.updateDynamic("TrustDirection")(TrustDirection.asInstanceOf[js.Any])
    if (TrustId != null) __obj.updateDynamic("TrustId")(TrustId.asInstanceOf[js.Any])
    if (TrustState != null) __obj.updateDynamic("TrustState")(TrustState.asInstanceOf[js.Any])
    if (TrustStateReason != null) __obj.updateDynamic("TrustStateReason")(TrustStateReason.asInstanceOf[js.Any])
    if (TrustType != null) __obj.updateDynamic("TrustType")(TrustType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trust]
  }
}

