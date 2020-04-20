package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotSiteWiseAction extends js.Object {
  /**
    * A list of asset property value entries.
    */
  var putAssetPropertyValueEntries: PutAssetPropertyValueEntryList = js.native
  /**
    * The ARN of the role that grants AWS IoT permission to send an asset property value to AWS IoTSiteWise. ("Action": "iotsitewise:BatchPutAssetPropertyValue"). The trust policy can restrict access to specific asset hierarchy paths.
    */
  var roleArn: AwsArn = js.native
}

object IotSiteWiseAction {
  @scala.inline
  def apply(putAssetPropertyValueEntries: PutAssetPropertyValueEntryList, roleArn: AwsArn): IotSiteWiseAction = {
    val __obj = js.Dynamic.literal(putAssetPropertyValueEntries = putAssetPropertyValueEntries.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotSiteWiseAction]
  }
}

