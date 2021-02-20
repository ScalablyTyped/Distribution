package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateFileSystemAliasesRequest extends StObject {
  
  /**
    * An array of one or more DNS alias names to disassociate, or remove, from the file system.
    */
  var Aliases: AlternateDNSNames = js.native
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.native
  
  /**
    * Specifies the file system from which to disassociate the DNS aliases.
    */
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId = js.native
}
object DisassociateFileSystemAliasesRequest {
  
  @scala.inline
  def apply(Aliases: AlternateDNSNames, FileSystemId: FileSystemId): DisassociateFileSystemAliasesRequest = {
    val __obj = js.Dynamic.literal(Aliases = Aliases.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateFileSystemAliasesRequest]
  }
  
  @scala.inline
  implicit class DisassociateFileSystemAliasesRequestMutableBuilder[Self <: DisassociateFileSystemAliasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: AlternateDNSNames): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesVarargs(value: AlternateDNSName*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
