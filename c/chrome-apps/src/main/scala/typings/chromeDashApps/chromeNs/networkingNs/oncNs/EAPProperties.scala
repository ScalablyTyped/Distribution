package typings.chromeDashApps.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EAPProperties extends js.Object {
  var AnonymousIdentity: js.UndefOr[String] = js.undefined
  /** @since Chrome 60. */
  var ClientCertPKCS11Id: js.UndefOr[String] = js.undefined
  var ClientCertPattern: js.UndefOr[CertPattern] = js.undefined
  var ClientCertRef: js.UndefOr[String] = js.undefined
  var ClientCertType: js.UndefOr[typings.chromeDashApps.chromeNs.networkingNs.oncNs.ClientCertType] = js.undefined
  var Identity: js.UndefOr[String] = js.undefined
  var Inner: js.UndefOr[String] = js.undefined
  /** The outer EAP type. Required by ONC, but may not be provided when translating from Shill. */
  var Outer: js.UndefOr[String] = js.undefined
  var Password: js.UndefOr[String] = js.undefined
  var SaveCredentials: js.UndefOr[Boolean] = js.undefined
  var ServerCAPEMs: js.UndefOr[js.Array[String]] = js.undefined
  var ServerCARefs: js.UndefOr[js.Array[String]] = js.undefined
  /** @since Chrome 60. */
  var SubjectMatch: js.UndefOr[ManagedDOMString] = js.undefined
  var UseProactiveKeyCaching: js.UndefOr[Boolean] = js.undefined
  var UseSytemCAs: js.UndefOr[Boolean] = js.undefined
}

object EAPProperties {
  @scala.inline
  def apply(
    AnonymousIdentity: String = null,
    ClientCertPKCS11Id: String = null,
    ClientCertPattern: CertPattern = null,
    ClientCertRef: String = null,
    ClientCertType: ClientCertType = null,
    Identity: String = null,
    Inner: String = null,
    Outer: String = null,
    Password: String = null,
    SaveCredentials: js.UndefOr[Boolean] = js.undefined,
    ServerCAPEMs: js.Array[String] = null,
    ServerCARefs: js.Array[String] = null,
    SubjectMatch: ManagedDOMString = null,
    UseProactiveKeyCaching: js.UndefOr[Boolean] = js.undefined,
    UseSytemCAs: js.UndefOr[Boolean] = js.undefined
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

