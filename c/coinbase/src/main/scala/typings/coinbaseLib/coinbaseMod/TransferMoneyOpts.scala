package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TransferMoneyOpts extends js.Object {
  /**
       * Amount to be transferred
       */
  var amount: java.lang.String
  /**
       * Currency for the amount (see Client#getCurrencies() for available strings)
       */
  var currency: java.lang.String
  /**
       * Notes to be included in the transfer
       */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
       * ID of the receiving account
       */
  var to: java.lang.String
  /**
       * Type transfer is required when transferring bitcoin or ethereum between accounts
       */
  var `type`: coinbaseLib.coinbaseLibStrings.transfer
}

