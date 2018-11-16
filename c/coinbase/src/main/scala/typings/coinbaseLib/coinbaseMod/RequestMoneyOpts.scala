package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestMoneyOpts extends js.Object {
  /**
       * Amount to be transferred
       */
  var amount: java.lang.String
  /**
       * Currency for the amount (see Client#getCurrencies() for available strings)
       */
  var currency: java.lang.String
  /**
       * Notes to be included in the email that the recipient receives
       */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An email of the recipient
       */
  var to: java.lang.String
  /**
       * Type request is required when sending money
       */
  var `type`: coinbaseLib.coinbaseLibStrings.request
}

