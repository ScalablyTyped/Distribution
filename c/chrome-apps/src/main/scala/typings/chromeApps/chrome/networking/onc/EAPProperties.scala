package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EAPProperties extends js.Object {
  var AnonymousIdentity: js.UndefOr[String] = js.undefined
  /** @since Chrome 60. */
  var ClientCertPKCS11Id: js.UndefOr[String] = js.undefined
  var ClientCertPattern: js.UndefOr[CertPattern] = js.undefined
  var ClientCertRef: js.UndefOr[String] = js.undefined
  var ClientCertType: js.UndefOr[typings.chromeApps.chrome.networking.onc.ClientCertType] = js.undefined
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
    if (AnonymousIdentity != null) __obj.updateDynamic("AnonymousIdentity")(AnonymousIdentity.asInstanceOf[js.Any])
    if (ClientCertPKCS11Id != null) __obj.updateDynamic("ClientCertPKCS11Id")(ClientCertPKCS11Id.asInstanceOf[js.Any])
    if (ClientCertPattern != null) __obj.updateDynamic("ClientCertPattern")(ClientCertPattern.asInstanceOf[js.Any])
    if (ClientCertRef != null) __obj.updateDynamic("ClientCertRef")(ClientCertRef.asInstanceOf[js.Any])
    if (ClientCertType != null) __obj.updateDynamic("ClientCertType")(ClientCertType.asInstanceOf[js.Any])
    if (Identity != null) __obj.updateDynamic("Identity")(Identity.asInstanceOf[js.Any])
    if (Inner != null) __obj.updateDynamic("Inner")(Inner.asInstanceOf[js.Any])
    if (Outer != null) __obj.updateDynamic("Outer")(Outer.asInstanceOf[js.Any])
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    if (!js.isUndefined(SaveCredentials)) __obj.updateDynamic("SaveCredentials")(SaveCredentials.asInstanceOf[js.Any])
    if (ServerCAPEMs != null) __obj.updateDynamic("ServerCAPEMs")(ServerCAPEMs.asInstanceOf[js.Any])
    if (ServerCARefs != null) __obj.updateDynamic("ServerCARefs")(ServerCARefs.asInstanceOf[js.Any])
    if (SubjectMatch != null) __obj.updateDynamic("SubjectMatch")(SubjectMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(UseProactiveKeyCaching)) __obj.updateDynamic("UseProactiveKeyCaching")(UseProactiveKeyCaching.asInstanceOf[js.Any])
    if (!js.isUndefined(UseSytemCAs)) __obj.updateDynamic("UseSytemCAs")(UseSytemCAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[EAPProperties]
  }
}

