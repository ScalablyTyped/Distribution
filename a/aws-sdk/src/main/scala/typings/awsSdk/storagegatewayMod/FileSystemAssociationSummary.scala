package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemAssociationSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the file system association.
    */
  var FileSystemAssociationARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileSystemAssociationARN] = js.undefined
  
  /**
    * The ID of the file system association.
    */
  var FileSystemAssociationId: js.UndefOr[typings.awsSdk.storagegatewayMod.FileSystemAssociationId] = js.undefined
  
  /**
    * The status of the file share. Valid Values: AVAILABLE | CREATING | DELETING | FORCE_DELETING | UPDATING | ERROR 
    */
  var FileSystemAssociationStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.FileSystemAssociationStatus] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
}
object FileSystemAssociationSummary {
  
  inline def apply(): FileSystemAssociationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemAssociationSummary]
  }
  
  extension [Self <: FileSystemAssociationSummary](x: Self) {
    
    inline def setFileSystemAssociationARN(value: FileSystemAssociationARN): Self = StObject.set(x, "FileSystemAssociationARN", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationARNUndefined: Self = StObject.set(x, "FileSystemAssociationARN", js.undefined)
    
    inline def setFileSystemAssociationId(value: FileSystemAssociationId): Self = StObject.set(x, "FileSystemAssociationId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationIdUndefined: Self = StObject.set(x, "FileSystemAssociationId", js.undefined)
    
    inline def setFileSystemAssociationStatus(value: FileSystemAssociationStatus): Self = StObject.set(x, "FileSystemAssociationStatus", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationStatusUndefined: Self = StObject.set(x, "FileSystemAssociationStatus", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
