package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConditionalForwardersRequest extends StObject {
  
  /**
    * The directory ID for which to get the list of associated conditional forwarders.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional forwarders. If this member is null, all conditional forwarders are returned.
    */
  var RemoteDomainNames: js.UndefOr[typings.awsSdk.directoryserviceMod.RemoteDomainNames] = js.undefined
}
object DescribeConditionalForwardersRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId): DescribeConditionalForwardersRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConditionalForwardersRequest]
  }
  
  @scala.inline
  implicit class DescribeConditionalForwardersRequestMutableBuilder[Self <: DescribeConditionalForwardersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteDomainNames(value: RemoteDomainNames): Self = StObject.set(x, "RemoteDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteDomainNamesUndefined: Self = StObject.set(x, "RemoteDomainNames", js.undefined)
    
    @scala.inline
    def setRemoteDomainNamesVarargs(value: RemoteDomainName*): Self = StObject.set(x, "RemoteDomainNames", js.Array(value :_*))
  }
}
