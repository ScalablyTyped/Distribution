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
    SyncSessionToken: SyncSessionToken
  ): UpdateRecordsRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], SyncSessionToken = SyncSessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecordsRequest]
  }
  @scala.inline
  implicit class UpdateRecordsRequestOps[Self <: UpdateRecordsRequest] (val x: Self) extends AnyVal {
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
    def setDatasetName(value: DatasetName): Self = this.set("DatasetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyncSessionToken(value: SyncSessionToken): Self = this.set("SyncSessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientContext(value: ClientContext): Self = this.set("ClientContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientContext: Self = this.set("ClientContext", js.undefined)
    @scala.inline
    def setDeviceId(value: DeviceId): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("DeviceId", js.undefined)
    @scala.inline
    def setRecordPatchesVarargs(value: RecordPatch*): Self = this.set("RecordPatches", js.Array(value :_*))
    @scala.inline
    def setRecordPatches(value: RecordPatchList): Self = this.set("RecordPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordPatches: Self = this.set("RecordPatches", js.undefined)
  }
  
}

