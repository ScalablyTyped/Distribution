package typings.braintree.mod

import typings.braintree.anon.Category
import typings.braintree.anon.Content
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisputeGateway extends js.Object {
  def accept(disputeId: String): js.Promise[ValidatedResponse[Dispute]] = js.native
  def addFileEvidence(disputeId: String, evidence: Category): js.Promise[ValidatedResponse[Evidence]] = js.native
  def addTextEvidence(disputeId: String, evidence: Content): js.Promise[ValidatedResponse[Evidence]] = js.native
  def finalize(disputeId: String): js.Promise[ValidatedResponse[Dispute]] = js.native
  def find(disputeId: String): js.Promise[Dispute] = js.native
  def removeEvidence(disputeId: String, evidenceId: String): js.Promise[ValidatedResponse[Dispute]] = js.native
  def search(searchFn: js.Any): Readable = js.native
}

object DisputeGateway {
  @scala.inline
  def apply(
    accept: String => js.Promise[ValidatedResponse[Dispute]],
    addFileEvidence: (String, Category) => js.Promise[ValidatedResponse[Evidence]],
    addTextEvidence: (String, Content) => js.Promise[ValidatedResponse[Evidence]],
    finalize: String => js.Promise[ValidatedResponse[Dispute]],
    find: String => js.Promise[Dispute],
    removeEvidence: (String, String) => js.Promise[ValidatedResponse[Dispute]],
    search: js.Any => Readable
  ): DisputeGateway = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), addFileEvidence = js.Any.fromFunction2(addFileEvidence), addTextEvidence = js.Any.fromFunction2(addTextEvidence), finalize = js.Any.fromFunction1(finalize), find = js.Any.fromFunction1(find), removeEvidence = js.Any.fromFunction2(removeEvidence), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[DisputeGateway]
  }
  @scala.inline
  implicit class DisputeGatewayOps[Self <: DisputeGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccept(value: String => js.Promise[ValidatedResponse[Dispute]]): Self = this.set("accept", js.Any.fromFunction1(value))
    @scala.inline
    def setAddFileEvidence(value: (String, Category) => js.Promise[ValidatedResponse[Evidence]]): Self = this.set("addFileEvidence", js.Any.fromFunction2(value))
    @scala.inline
    def setAddTextEvidence(value: (String, Content) => js.Promise[ValidatedResponse[Evidence]]): Self = this.set("addTextEvidence", js.Any.fromFunction2(value))
    @scala.inline
    def setFinalize(value: String => js.Promise[ValidatedResponse[Dispute]]): Self = this.set("finalize", js.Any.fromFunction1(value))
    @scala.inline
    def setFind(value: String => js.Promise[Dispute]): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveEvidence(value: (String, String) => js.Promise[ValidatedResponse[Dispute]]): Self = this.set("removeEvidence", js.Any.fromFunction2(value))
    @scala.inline
    def setSearch(value: js.Any => Readable): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

