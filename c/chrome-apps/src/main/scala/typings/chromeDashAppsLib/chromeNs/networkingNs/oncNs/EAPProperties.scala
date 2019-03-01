package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EAPProperties extends js.Object {
  var AnonymousIdentity: js.UndefOr[java.lang.String] = js.undefined
  /** @since Chrome 60. */
  var ClientCertPKCS11Id: js.UndefOr[java.lang.String] = js.undefined
  var ClientCertPattern: js.UndefOr[CertPattern] = js.undefined
  var ClientCertRef: js.UndefOr[java.lang.String] = js.undefined
  var ClientCertType: js.UndefOr[ClientCertType] = js.undefined
  var Identity: js.UndefOr[java.lang.String] = js.undefined
  var Inner: js.UndefOr[java.lang.String] = js.undefined
  /** The outer EAP type. Required by ONC, but may not be provided when translating from Shill. */
  var Outer: js.UndefOr[java.lang.String] = js.undefined
  var Password: js.UndefOr[java.lang.String] = js.undefined
  var SaveCredentials: js.UndefOr[scala.Boolean] = js.undefined
  var ServerCAPEMs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ServerCARefs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** @since Chrome 60. */
  var SubjectMatch: js.UndefOr[ManagedDOMString] = js.undefined
  var UseProactiveKeyCaching: js.UndefOr[scala.Boolean] = js.undefined
  var UseSytemCAs: js.UndefOr[scala.Boolean] = js.undefined
}

object EAPProperties {
  @scala.inline
  def apply(
    AnonymousIdentity: java.lang.String = null,
    ClientCertPKCS11Id: java.lang.String = null,
    ClientCertPattern: CertPattern = null,
    ClientCertRef: java.lang.String = null,
    ClientCertType: ClientCertType = null,
    Identity: java.lang.String = null,
    Inner: java.lang.String = null,
    Outer: java.lang.String = null,
    Password: java.lang.String = null,
    SaveCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    ServerCAPEMs: js.Array[java.lang.String] = null,
    ServerCARefs: js.Array[java.lang.String] = null,
    SubjectMatch: ManagedDOMString = null,
    UseProactiveKeyCaching: js.UndefOr[scala.Boolean] = js.undefined,
    UseSytemCAs: js.UndefOr[scala.Boolean] = js.undefined
  ): EAPProperties = {
    val __obj = js.Dynamic.literal()
    if (AnonymousIdentity != null) __obj.updateDynamic("AnonymousIdentity")(AnonymousIdentity)
    if (ClientCertPKCS11Id != null) __obj.updateDynamic("ClientCertPKCS11Id")(ClientCertPKCS11Id)
    if (ClientCertPattern != null) __obj.updateDynamic("ClientCertPattern")(ClientCertPattern)
    if (ClientCertRef != null) __obj.updateDynamic("ClientCertRef")(ClientCertRef)
    if (ClientCertType != null) __obj.updateDynamic("ClientCertType")(ClientCertType)
    if (Identity != null) __obj.updateDynamic("Identity")(Identity)
    if (Inner != null) __obj.updateDynamic("Inner")(Inner)
    if (Outer != null) __obj.updateDynamic("Outer")(Outer)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (!js.isUndefined(SaveCredentials)) __obj.updateDynamic("SaveCredentials")(SaveCredentials)
    if (ServerCAPEMs != null) __obj.updateDynamic("ServerCAPEMs")(ServerCAPEMs)
    if (ServerCARefs != null) __obj.updateDynamic("ServerCARefs")(ServerCARefs)
    if (SubjectMatch != null) __obj.updateDynamic("SubjectMatch")(SubjectMatch)
    if (!js.isUndefined(UseProactiveKeyCaching)) __obj.updateDynamic("UseProactiveKeyCaching")(UseProactiveKeyCaching)
    if (!js.isUndefined(UseSytemCAs)) __obj.updateDynamic("UseSytemCAs")(UseSytemCAs)
    __obj.asInstanceOf[EAPProperties]
  }
}

