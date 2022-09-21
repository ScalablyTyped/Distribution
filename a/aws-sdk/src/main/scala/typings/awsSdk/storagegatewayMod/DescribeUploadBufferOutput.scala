package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUploadBufferOutput extends StObject {
  
  /**
    * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
    */
  var DiskIds: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskIds] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
  
  /**
    * The total number of bytes allocated in the gateway's as upload buffer.
    */
  var UploadBufferAllocatedInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of bytes being used in the gateway's upload buffer.
    */
  var UploadBufferUsedInBytes: js.UndefOr[long] = js.undefined
}
object DescribeUploadBufferOutput {
  
  inline def apply(): DescribeUploadBufferOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUploadBufferOutput]
  }
  
  extension [Self <: DescribeUploadBufferOutput](x: Self) {
    
    inline def setDiskIds(value: DiskIds): Self = StObject.set(x, "DiskIds", value.asInstanceOf[js.Any])
    
    inline def setDiskIdsUndefined: Self = StObject.set(x, "DiskIds", js.undefined)
    
    inline def setDiskIdsVarargs(value: DiskId*): Self = StObject.set(x, "DiskIds", js.Array(value*))
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setUploadBufferAllocatedInBytes(value: long): Self = StObject.set(x, "UploadBufferAllocatedInBytes", value.asInstanceOf[js.Any])
    
    inline def setUploadBufferAllocatedInBytesUndefined: Self = StObject.set(x, "UploadBufferAllocatedInBytes", js.undefined)
    
    inline def setUploadBufferUsedInBytes(value: long): Self = StObject.set(x, "UploadBufferUsedInBytes", value.asInstanceOf[js.Any])
    
    inline def setUploadBufferUsedInBytesUndefined: Self = StObject.set(x, "UploadBufferUsedInBytes", js.undefined)
  }
}
