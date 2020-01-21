package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRecordsRequest extends js.Object {
  /**
    * Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods. The ClientContext field is not yet implemented.
    */
  var ClientContext: js.UndefOr[typings.awsSdk.cognitosyncMod.ClientContext] = js.native
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: typings.awsSdk.cognitosyncMod.DatasetName = js.native
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.cognitosyncMod.DeviceId] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: typings.awsSdk.cognitosyncMod.IdentityId = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId = js.native
  /**
    * A list of patch operations.
    */
  var RecordPatches: js.UndefOr[RecordPatchList] = js.native
  /**
    * The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
    */
  var SyncSessionToken: typings.awsSdk.cognitosyncMod.SyncSessionToken = js.native
}

object UpdateRecordsRequest {
  @scala.inline
  def apply(
    DatasetName: DatasetName,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId,
    SyncSessionToken: SyncSessionToken,
    ClientContext: ClientContext = null,
    DeviceId: DeviceId = null,
    RecordPatches: RecordPatchList = null
  ): UpdateRecordsRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], SyncSessionToken = SyncSessionToken.asInstanceOf[js.Any])
    if (ClientContext != null) __obj.updateDynamic("ClientContext")(ClientContext.asInstanceOf[js.Any])
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId.asInstanceOf[js.Any])
    if (RecordPatches != null) __obj.updateDynamic("RecordPatches")(RecordPatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecordsRequest]
  }
}

