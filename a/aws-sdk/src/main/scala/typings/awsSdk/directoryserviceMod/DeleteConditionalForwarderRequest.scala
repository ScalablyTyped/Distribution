package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConditionalForwarderRequest extends StObject {
  
  /**
    * The directory ID for which you are deleting the conditional forwarder.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional forwarder.
    */
  var RemoteDomainName: typings.awsSdk.directoryserviceMod.RemoteDomainName
}
object DeleteConditionalForwarderRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, RemoteDomainName: RemoteDomainName): DeleteConditionalForwarderRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConditionalForwarderRequest]
  }
  
  @scala.inline
  implicit class DeleteConditionalForwarderRequestMutableBuilder[Self <: DeleteConditionalForwarderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteDomainName(value: RemoteDomainName): Self = StObject.set(x, "RemoteDomainName", value.asInstanceOf[js.Any])
  }
}
