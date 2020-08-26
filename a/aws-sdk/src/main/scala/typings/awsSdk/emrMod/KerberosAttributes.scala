package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KerberosAttributes extends js.Object {
  /**
    * The Active Directory password for ADDomainJoinUser.
    */
  var ADDomainJoinPassword: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain.
    */
  var ADDomainJoinUser: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms.
    */
  var CrossRealmTrustPrincipalPassword: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster.
    */
  var KdcAdminPassword: XmlStringMaxLen256 = js.native
  /**
    * The name of the Kerberos realm to which all nodes in a cluster belong. For example, EC2.INTERNAL. 
    */
  var Realm: XmlStringMaxLen256 = js.native
}

object KerberosAttributes {
  @scala.inline
  def apply(KdcAdminPassword: XmlStringMaxLen256, Realm: XmlStringMaxLen256): KerberosAttributes = {
    val __obj = js.Dynamic.literal(KdcAdminPassword = KdcAdminPassword.asInstanceOf[js.Any], Realm = Realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[KerberosAttributes]
  }
  @scala.inline
  implicit class KerberosAttributesOps[Self <: KerberosAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKdcAdminPassword(value: XmlStringMaxLen256): Self = this.set("KdcAdminPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealm(value: XmlStringMaxLen256): Self = this.set("Realm", value.asInstanceOf[js.Any])
    @scala.inline
    def setADDomainJoinPassword(value: XmlStringMaxLen256): Self = this.set("ADDomainJoinPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteADDomainJoinPassword: Self = this.set("ADDomainJoinPassword", js.undefined)
    @scala.inline
    def setADDomainJoinUser(value: XmlStringMaxLen256): Self = this.set("ADDomainJoinUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteADDomainJoinUser: Self = this.set("ADDomainJoinUser", js.undefined)
    @scala.inline
    def setCrossRealmTrustPrincipalPassword(value: XmlStringMaxLen256): Self = this.set("CrossRealmTrustPrincipalPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossRealmTrustPrincipalPassword: Self = this.set("CrossRealmTrustPrincipalPassword", js.undefined)
  }
  
}

