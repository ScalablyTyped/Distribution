package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotSiteWiseAction extends StObject {
  
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
  implicit class IotSiteWiseActionMutableBuilder[Self <: IotSiteWiseAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPutAssetPropertyValueEntries(value: PutAssetPropertyValueEntryList): Self = StObject.set(x, "putAssetPropertyValueEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutAssetPropertyValueEntriesVarargs(value: PutAssetPropertyValueEntry*): Self = StObject.set(x, "putAssetPropertyValueEntries", js.Array(value :_*))
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
