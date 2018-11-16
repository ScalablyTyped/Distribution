package typings
package braintreeDashWebLib.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object braintreeNs {
  /**
     * @global
     * @callback callback
     * @param {?BraintreeError} [err] `null` or `undefined` if there was no error.
     * @param {?any} [data] The successful result of the asynchronous function call (if data exists).
     * @description The Node.js-style callback pattern used throughout the SDK.
     * @returns {void}
     */
  type callback = js.Function2[/* err */ js.UndefOr[BraintreeError], /* data */ js.UndefOr[js.Any], scala.Unit]
}
