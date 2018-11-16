package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCollector extends js.Object {
  /**
       * @description The current version of the SDK, i.e. `3.0.2`.
       * @type {string}
       */
  var VERSION: java.lang.String = js.native
  /**
       * @memberof DataCollector
       * @name deviceData
       * @type string
       * @description JSON string to pass with server transactions.
       * @instance
       */
  var deviceData: java.lang.String = js.native
  /**
       * @static
       * @function create
       * @description Creates a DataCollector instance. Requires advanced fraud protection to be enabled in the Braintree gateway. Contact our [support team](mailto:support@braintreepayments.com) to configure your Kount ID.
       * @param {object} options Creation options:
       * @param {Client} options.client A {@link Client} instance.
       * @param {boolean} [options.kount] If true, Kount fraud data collection is enabled.
       * @param {boolean} [options.paypal] If true, PayPal fraud data collection is enabled.
       * @param {callback} callback The second argument, `data`, is the {@link DataCollector} instance.
       * @returns {void}
       */
  def create(options: braintreeDashWebLib.Anon_ClientKount, callback: callback): scala.Unit = js.native
  /**
       * @memberof DataCollector
       * @name teardown
       * @function
       * @description Cleanly remove all event handlers and DOM nodes that were added.
       * @param {callback} [callback] Called once teardown is complete. No data is returned if teardown completes successfully.
       * @instance
       * @returns {void}
       */
  def teardown(): scala.Unit = js.native
  /**
       * @memberof DataCollector
       * @name teardown
       * @function
       * @description Cleanly remove all event handlers and DOM nodes that were added.
       * @param {callback} [callback] Called once teardown is complete. No data is returned if teardown completes successfully.
       * @instance
       * @returns {void}
       */
  def teardown(callback: callback): scala.Unit = js.native
}

