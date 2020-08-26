package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrustRequest extends js.Object {
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName.
    */
  var ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs] = js.native
  /**
    * The Directory ID of the AWS Managed Microsoft AD directory for which to establish the trust relationship.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
    */
  var RemoteDomainName: typings.awsSdk.directoryserviceMod.RemoteDomainName = js.native
  /**
    * Optional parameter to enable selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsSdk.directoryserviceMod.SelectiveAuth] = js.native
  /**
    * The direction of the trust relationship.
    */
  var TrustDirection: typings.awsSdk.directoryserviceMod.TrustDirection = js.native
  /**
    * The trust password. The must be the same password that was used when creating the trust relationship on the external domain.
    */
  var TrustPassword: typings.awsSdk.directoryserviceMod.TrustPassword = js.native
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustType] = js.native
}

object CreateTrustRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId,
    RemoteDomainName: RemoteDomainName,
    TrustDirection: TrustDirection,
    TrustPassword: TrustPassword
  ): CreateTrustRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any], TrustDirection = TrustDirection.asInstanceOf[js.Any], TrustPassword = TrustPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrustRequest]
  }
  @scala.inline
  implicit class CreateTrustRequestOps[Self <: CreateTrustRequest] (val x: Self) extends AnyVal {
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
    def setRemoteDomainName(value: RemoteDomainName): Self = this.set("RemoteDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustDirection(value: TrustDirection): Self = this.set("TrustDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustPassword(value: TrustPassword): Self = this.set("TrustPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionalForwarderIpAddrsVarargs(value: IpAddr*): Self = this.set("ConditionalForwarderIpAddrs", js.Array(value :_*))
    @scala.inline
    def setConditionalForwarderIpAddrs(value: DnsIpAddrs): Self = this.set("ConditionalForwarderIpAddrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalForwarderIpAddrs: Self = this.set("ConditionalForwarderIpAddrs", js.undefined)
    @scala.inline
    def setSelectiveAuth(value: SelectiveAuth): Self = this.set("SelectiveAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectiveAuth: Self = this.set("SelectiveAuth", js.undefined)
    @scala.inline
    def setTrustType(value: TrustType): Self = this.set("TrustType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustType: Self = this.set("TrustType", js.undefined)
  }
  
}

