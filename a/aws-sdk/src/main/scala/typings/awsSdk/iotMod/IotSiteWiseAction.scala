package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class IotSiteWiseActionOps[Self <: IotSiteWiseAction] (val x: Self) extends AnyVal {
    
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
    def setPutAssetPropertyValueEntriesVarargs(value: PutAssetPropertyValueEntry*): Self = this.set("putAssetPropertyValueEntries", js.Array(value :_*))
    
    @scala.inline
    def setPutAssetPropertyValueEntries(value: PutAssetPropertyValueEntryList): Self = this.set("putAssetPropertyValueEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
}
