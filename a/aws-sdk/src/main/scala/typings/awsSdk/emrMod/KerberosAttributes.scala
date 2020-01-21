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
  def apply(
    KdcAdminPassword: XmlStringMaxLen256,
    Realm: XmlStringMaxLen256,
    ADDomainJoinPassword: XmlStringMaxLen256 = null,
    ADDomainJoinUser: XmlStringMaxLen256 = null,
    CrossRealmTrustPrincipalPassword: XmlStringMaxLen256 = null
  ): KerberosAttributes = {
    val __obj = js.Dynamic.literal(KdcAdminPassword = KdcAdminPassword.asInstanceOf[js.Any], Realm = Realm.asInstanceOf[js.Any])
    if (ADDomainJoinPassword != null) __obj.updateDynamic("ADDomainJoinPassword")(ADDomainJoinPassword.asInstanceOf[js.Any])
    if (ADDomainJoinUser != null) __obj.updateDynamic("ADDomainJoinUser")(ADDomainJoinUser.asInstanceOf[js.Any])
    if (CrossRealmTrustPrincipalPassword != null) __obj.updateDynamic("CrossRealmTrustPrincipalPassword")(CrossRealmTrustPrincipalPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[KerberosAttributes]
  }
}

