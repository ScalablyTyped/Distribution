package typings.braintree.mod

import typings.braintree.anon.CreatedAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "Dispute")
@js.native
open class Dispute () extends StObject {
  
  var amountDisputed: String = js.native
  
  var amountWon: String = js.native
  
  var caseNumber: String = js.native
  
  var createdAt: String = js.native
  
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
  
  var receivedDate: js.Date = js.native
  
  var referenceNumber: String = js.native
  
  var replyByDate: js.Date = js.native
  
  var status: DisputeStatus = js.native
  
  var statusHistory: js.Array[DisputeStatusHistory] = js.native
  
  var transaction: CreatedAt = js.native
  
  var updatedAt: String = js.native
}
