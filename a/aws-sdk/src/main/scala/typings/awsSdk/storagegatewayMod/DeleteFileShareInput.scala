package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileShareInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the file share to be deleted.
    */
  var FileShareARN: typings.awsSdk.storagegatewayMod.FileShareARN
  
  /**
    * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to Amazon Web Services. Otherwise, the file share is not deleted until all data is uploaded to Amazon Web Services. This process aborts the data upload process, and the file share enters the FORCE_DELETING status. Valid Values: true | false 
    */
  var ForceDelete: js.UndefOr[scala.Boolean] = js.undefined
}
object DeleteFileShareInput {
  
  inline def apply(FileShareARN: FileShareARN): DeleteFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileShareInput]
  }
  
  extension [Self <: DeleteFileShareInput](x: Self) {
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setForceDelete(value: scala.Boolean): Self = StObject.set(x, "ForceDelete", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteUndefined: Self = StObject.set(x, "ForceDelete", js.undefined)
  }
}
