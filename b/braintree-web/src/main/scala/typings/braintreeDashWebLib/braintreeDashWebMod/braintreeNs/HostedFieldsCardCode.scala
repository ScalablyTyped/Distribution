package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * @description Information about the card type, sent in {@link HostedFields~stateObject|stateObjects}.
   * @property {string} type The code-friendly representation of the card type. It will be one of the following strings:
   * - `american-express`
   * - `diners-club`
   * - `discover`
   * - `jcb`
   * - `maestro`
   * - `master-card`
   * - `unionpay`
   * - `visa`
   * @property {string} niceType The pretty-printed card type. It will be one of the following strings:
   * - `American Express`
   * - `Diners Club`
   * - `Discover`
   * - `JCB`
   * - `Maestro`
   * - `MasterCard`
   * - `UnionPay`
   * - `Visa`
   * @property {object} code
   * This object contains data relevant to the security code requirements of the card brand.
   * For example, on a Visa card there will be a <code>CVV</code> of 3 digits, whereas an
   * American Express card requires a 4-digit <code>CID</code>.
   * @property {string} code.name <code>"CVV"</code> <code>"CID"</code> <code>"CVC"</code>
   * @property {number} code.size The expected length of the security code. Typically, this is 3 or 4.
   */


trait HostedFieldsCardCode extends js.Object {
  var name: java.lang.String
  var size: scala.Double
}

