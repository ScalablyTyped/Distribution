package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeToDatasetRequest extends js.Object {
  /**
    * The name of the dataset to subcribe to.
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
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The ID of the pool to which the identity belongs.
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId = js.native
}

object SubscribeToDatasetRequest {
  @scala.inline
  def apply(
    DatasetName: DatasetName,
    DeviceId: DeviceId,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId
  ): SubscribeToDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToDatasetRequest]
  }
}

