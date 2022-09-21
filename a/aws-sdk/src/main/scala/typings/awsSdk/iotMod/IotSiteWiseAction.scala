package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotSiteWiseAction extends StObject {
  
  /**
    * A list of asset property value entries.
    */
  var putAssetPropertyValueEntries: PutAssetPropertyValueEntryList
  
  /**
    * The ARN of the role that grants IoT permission to send an asset property value to IoT SiteWise. ("Action": "iotsitewise:BatchPutAssetPropertyValue"). The trust policy can restrict access to specific asset hierarchy paths.
    */
  var roleArn: AwsArn
}
object IotSiteWiseAction {
  
  inline def apply(putAssetPropertyValueEntries: PutAssetPropertyValueEntryList, roleArn: AwsArn): IotSiteWiseAction = {
    val __obj = js.Dynamic.literal(putAssetPropertyValueEntries = putAssetPropertyValueEntries.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotSiteWiseAction]
  }
  
  extension [Self <: IotSiteWiseAction](x: Self) {
    
    inline def setPutAssetPropertyValueEntries(value: PutAssetPropertyValueEntryList): Self = StObject.set(x, "putAssetPropertyValueEntries", value.asInstanceOf[js.Any])
    
    inline def setPutAssetPropertyValueEntriesVarargs(value: PutAssetPropertyValueEntry*): Self = StObject.set(x, "putAssetPropertyValueEntries", js.Array(value*))
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
