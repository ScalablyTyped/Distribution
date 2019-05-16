package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisputeGateway extends js.Object {
  def accept(disputeId: java.lang.String): js.Promise[ValidatedResponse[Dispute]]
  def addFileEvidence(disputeId: java.lang.String, evidence: braintreeLib.Anon_Category): js.Promise[ValidatedResponse[Evidence]]
  def addTextEvidence(disputeId: java.lang.String, evidence: braintreeLib.Anon_CategoryContent): js.Promise[ValidatedResponse[Evidence]]
  def finalize(disputeId: java.lang.String): js.Promise[ValidatedResponse[Dispute]]
  def find(disputeId: java.lang.String): js.Promise[Dispute]
  def removeEvidence(disputeId: java.lang.String, evidenceId: java.lang.String): js.Promise[ValidatedResponse[Dispute]]
  def search(searchFn: js.Any): js.Promise[js.Array[Dispute]]
}

object DisputeGateway {
  @scala.inline
  def apply(
    accept: java.lang.String => js.Promise[ValidatedResponse[Dispute]],
    addFileEvidence: (java.lang.String, braintreeLib.Anon_Category) => js.Promise[ValidatedResponse[Evidence]],
    addTextEvidence: (java.lang.String, braintreeLib.Anon_CategoryContent) => js.Promise[ValidatedResponse[Evidence]],
    finalize: java.lang.String => js.Promise[ValidatedResponse[Dispute]],
    find: java.lang.String => js.Promise[Dispute],
    removeEvidence: (java.lang.String, java.lang.String) => js.Promise[ValidatedResponse[Dispute]],
    search: js.Any => js.Promise[js.Array[Dispute]]
  ): DisputeGateway = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), addFileEvidence = js.Any.fromFunction2(addFileEvidence), addTextEvidence = js.Any.fromFunction2(addTextEvidence), finalize = js.Any.fromFunction1(finalize), find = js.Any.fromFunction1(find), removeEvidence = js.Any.fromFunction2(removeEvidence), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[DisputeGateway]
  }
}

