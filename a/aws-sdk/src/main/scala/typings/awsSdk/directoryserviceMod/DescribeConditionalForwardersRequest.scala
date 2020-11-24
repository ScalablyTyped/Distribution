package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConditionalForwardersRequest extends js.Object {
  
  /**
    * The directory ID for which to get the list of associated conditional forwarders.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  
  /**
    * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional forwarders. If this member is null, all conditional forwarders are returned.
    */
  var RemoteDomainNames: js.UndefOr[typings.awsSdk.directoryserviceMod.RemoteDomainNames] = js.native
}
object DescribeConditionalForwardersRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId): DescribeConditionalForwardersRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConditionalForwardersRequest]
  }
  
  @scala.inline
  implicit class DescribeConditionalForwardersRequestOps[Self <: DescribeConditionalForwardersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteDomainNamesVarargs(value: RemoteDomainName*): Self = this.set("RemoteDomainNames", js.Array(value :_*))
    
    @scala.inline
    def setRemoteDomainNames(value: RemoteDomainNames): Self = this.set("RemoteDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteDomainNames: Self = this.set("RemoteDomainNames", js.undefined)
  }
}
