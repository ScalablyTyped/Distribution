package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "Dispute")
@js.native
class Dispute () extends js.Object {
  var amountDisputed: java.lang.String = js.native
  var amountWon: java.lang.String = js.native
  var caseNumber: java.lang.String = js.native
  var createdAt: stdLib.Date = js.native
  var currencyIsoCode: java.lang.String = js.native
  var evidence: Evidence = js.native
  var id: java.lang.String = js.native
  var kind: java.lang.String = js.native
  var merchantAccountId: java.lang.String = js.native
  var originalDisputeId: java.lang.String = js.native
  var processorComments: java.lang.String = js.native
  var reason: java.lang.String = js.native
  var reasonCode: java.lang.String = js.native
  var reasonDescription: java.lang.String = js.native
  var receivedDate: stdLib.Date = js.native
  var referenceNumber: java.lang.String = js.native
  var replyByDate: stdLib.Date = js.native
  var status: DisputeStatus = js.native
  var statusHistory: DisputeStatusHistory = js.native
  var transaction: braintreeLib.Anon_Amount = js.native
  var updatedAt: stdLib.Date = js.native
}

