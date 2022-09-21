package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemAssociationStatusDetail extends StObject {
  
  /**
    * The error code for a given file system association status.
    */
  var ErrorCode: js.UndefOr[FileSystemAssociationSyncErrorCode] = js.undefined
}
object FileSystemAssociationStatusDetail {
  
  inline def apply(): FileSystemAssociationStatusDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemAssociationStatusDetail]
  }
  
  extension [Self <: FileSystemAssociationStatusDetail](x: Self) {
    
    inline def setErrorCode(value: FileSystemAssociationSyncErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
  }
}
