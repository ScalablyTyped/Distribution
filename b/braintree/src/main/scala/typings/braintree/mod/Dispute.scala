package typings.braintree.mod

import typings.braintree.anon.Amount
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "Dispute")
@js.native
class Dispute () extends js.Object {
  var amountDisputed: String = js.native
  var amountWon: String = js.native
  var caseNumber: String = js.native
  var createdAt: Date = js.native
  var currencyIsoCode: String = js.native
  var evidence: Evidence = js.native
  var id: String = js.native
  var kind: String = js.native
  var merchantAccountId: String = js.native
  var originalDisputeId: String = js.native
  var processorComments: String = js.native
  var reason: String = js.native
  var reasonCode: String = js.native
  var reasonDescription: String = js.native
  var receivedDate: Date = js.native
  var referenceNumber: String = js.native
  var replyByDate: Date = js.native
  var status: DisputeStatus = js.native
  var statusHistory: DisputeStatusHistory = js.native
  var transaction: Amount = js.native
  var updatedAt: Date = js.native
}

