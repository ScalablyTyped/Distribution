package typings.braintree.braintreeMod

import typings.braintree.Anon_Category
import typings.braintree.Anon_CategoryContent
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisputeGateway extends js.Object {
  def accept(disputeId: String): js.Promise[ValidatedResponse[Dispute]]
  def addFileEvidence(disputeId: String, evidence: Anon_Category): js.Promise[ValidatedResponse[Evidence]]
  def addTextEvidence(disputeId: String, evidence: Anon_CategoryContent): js.Promise[ValidatedResponse[Evidence]]
  def finalize(disputeId: String): js.Promise[ValidatedResponse[Dispute]]
  def find(disputeId: String): js.Promise[Dispute]
  def removeEvidence(disputeId: String, evidenceId: String): js.Promise[ValidatedResponse[Dispute]]
  def search(searchFn: js.Any): Readable
}

object DisputeGateway {
  @scala.inline
  def apply(
    accept: String => js.Promise[ValidatedResponse[Dispute]],
    addFileEvidence: (String, Anon_Category) => js.Promise[ValidatedResponse[Evidence]],
    addTextEvidence: (String, Anon_CategoryContent) => js.Promise[ValidatedResponse[Evidence]],
    finalize: String => js.Promise[ValidatedResponse[Dispute]],
    find: String => js.Promise[Dispute],
    removeEvidence: (String, String) => js.Promise[ValidatedResponse[Dispute]],
    search: js.Any => Readable
  ): DisputeGateway = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), addFileEvidence = js.Any.fromFunction2(addFileEvidence), addTextEvidence = js.Any.fromFunction2(addTextEvidence), finalize = js.Any.fromFunction1(finalize), find = js.Any.fromFunction1(find), removeEvidence = js.Any.fromFunction2(removeEvidence), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[DisputeGateway]
  }
}

