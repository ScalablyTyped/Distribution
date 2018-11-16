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

