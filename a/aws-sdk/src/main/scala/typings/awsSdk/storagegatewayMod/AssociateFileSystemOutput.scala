package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateFileSystemOutput extends StObject {
  
  /**
    * The ARN of the newly created file system association.
    */
  var FileSystemAssociationARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileSystemAssociationARN] = js.undefined
}
object AssociateFileSystemOutput {
  
  inline def apply(): AssociateFileSystemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateFileSystemOutput]
  }
  
  extension [Self <: AssociateFileSystemOutput](x: Self) {
    
    inline def setFileSystemAssociationARN(value: FileSystemAssociationARN): Self = StObject.set(x, "FileSystemAssociationARN", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationARNUndefined: Self = StObject.set(x, "FileSystemAssociationARN", js.undefined)
  }
}
