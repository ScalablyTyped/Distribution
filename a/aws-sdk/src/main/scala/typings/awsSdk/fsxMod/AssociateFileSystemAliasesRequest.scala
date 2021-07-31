package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateFileSystemAliasesRequest extends StObject {
  
  /**
    * An array of one or more DNS alias names to associate with the file system. The alias name has to comply with the following formatting requirements:   Formatted as a fully-qualified domain name (FQDN),  hostname.domain , for example, accounting.corp.example.com.   Can contain alphanumeric characters and the hyphen (-).   Cannot start or end with a hyphen.   Can start with a numeric.   For DNS alias names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you specify them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
    */
  var Aliases: AlternateDNSNames
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  /**
    * Specifies the file system with which you want to associate one or more DNS aliases.
    */
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId
}
object AssociateFileSystemAliasesRequest {
  
  @scala.inline
  def apply(Aliases: AlternateDNSNames, FileSystemId: FileSystemId): AssociateFileSystemAliasesRequest = {
    val __obj = js.Dynamic.literal(Aliases = Aliases.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateFileSystemAliasesRequest]
  }
  
  @scala.inline
  implicit class AssociateFileSystemAliasesRequestMutableBuilder[Self <: AssociateFileSystemAliasesRequest] (val x: Self) extends AnyVal {
    
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
