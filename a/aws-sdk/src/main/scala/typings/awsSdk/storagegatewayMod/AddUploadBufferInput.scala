package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddUploadBufferInput extends StObject {
  
  /**
    * An array of strings that identify disks that are to be configured as working storage. Each string has a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
    */
  var DiskIds: typings.awsSdk.storagegatewayMod.DiskIds
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object AddUploadBufferInput {
  
  @scala.inline
  def apply(DiskIds: DiskIds, GatewayARN: GatewayARN): AddUploadBufferInput = {
    val __obj = js.Dynamic.literal(DiskIds = DiskIds.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddUploadBufferInput]
  }
  
  @scala.inline
  implicit class AddUploadBufferInputMutableBuilder[Self <: AddUploadBufferInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskIds(value: DiskIds): Self = StObject.set(x, "DiskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskIdsVarargs(value: DiskId*): Self = StObject.set(x, "DiskIds", js.Array(value :_*))
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
