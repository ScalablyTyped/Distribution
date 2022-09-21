package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateFileSystemOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted file system association.
    */
  var FileSystemAssociationARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileSystemAssociationARN] = js.undefined
}
object DisassociateFileSystemOutput {
  
  inline def apply(): DisassociateFileSystemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateFileSystemOutput]
  }
  
  extension [Self <: DisassociateFileSystemOutput](x: Self) {
    
    inline def setFileSystemAssociationARN(value: FileSystemAssociationARN): Self = StObject.set(x, "FileSystemAssociationARN", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationARNUndefined: Self = StObject.set(x, "FileSystemAssociationARN", js.undefined)
  }
}
