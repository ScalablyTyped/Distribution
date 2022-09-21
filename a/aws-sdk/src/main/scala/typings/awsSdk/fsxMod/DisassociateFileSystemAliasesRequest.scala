package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateFileSystemAliasesRequest extends StObject {
  
  /**
    * An array of one or more DNS alias names to disassociate, or remove, from the file system.
    */
  var Aliases: AlternateDNSNames
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  /**
    * Specifies the file system from which to disassociate the DNS aliases.
    */
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId
}
object DisassociateFileSystemAliasesRequest {
  
  inline def apply(Aliases: AlternateDNSNames, FileSystemId: FileSystemId): DisassociateFileSystemAliasesRequest = {
    val __obj = js.Dynamic.literal(Aliases = Aliases.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateFileSystemAliasesRequest]
  }
  
  extension [Self <: DisassociateFileSystemAliasesRequest](x: Self) {
    
    inline def setAliases(value: AlternateDNSNames): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesVarargs(value: AlternateDNSName*): Self = StObject.set(x, "Aliases", js.Array(value*))
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
