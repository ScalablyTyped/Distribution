package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsubscribeFromDatasetRequest extends js.Object {
  /**
    * The name of the dataset from which to unsubcribe.
    */
  var DatasetName: typings.awsSdk.cognitosyncMod.DatasetName = js.native
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: typings.awsSdk.cognitosyncMod.DeviceId = js.native
  /**
    * Unique ID for this identity.
    */
  var IdentityId: typings.awsSdk.cognitosyncMod.IdentityId = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The ID of the pool to which this identity belongs.
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId = js.native
}

object UnsubscribeFromDatasetRequest {
  @scala.inline
  def apply(
    DatasetName: DatasetName,
    DeviceId: DeviceId,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId
  ): UnsubscribeFromDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeFromDatasetRequest]
  }
  @scala.inline
  implicit class UnsubscribeFromDatasetRequestOps[Self <: UnsubscribeFromDatasetRequest] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: DeviceId): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
  }
  
}

