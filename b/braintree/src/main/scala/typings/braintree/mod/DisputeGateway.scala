package typings.braintree.mod

import typings.braintree.anon.Category
import typings.braintree.anon.Content
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisputeGateway extends StObject {
  
  def accept(disputeId: String): js.Promise[ValidatedResponse[Dispute]]
  
  def addFileEvidence(disputeId: String, evidence: Category): js.Promise[ValidatedResponse[Evidence]]
  
  def addTextEvidence(disputeId: String, evidence: Content): js.Promise[ValidatedResponse[Evidence]]
  
  def finalize(disputeId: String): js.Promise[ValidatedResponse[Dispute]]
  
  def find(disputeId: String): js.Promise[Dispute]
  
  def removeEvidence(disputeId: String, evidenceId: String): js.Promise[ValidatedResponse[Dispute]]
  
  def search(searchFn: Any): Readable
}
object DisputeGateway {
  
  inline def apply(
    accept: String => js.Promise[ValidatedResponse[Dispute]],
    addFileEvidence: (String, Category) => js.Promise[ValidatedResponse[Evidence]],
    addTextEvidence: (String, Content) => js.Promise[ValidatedResponse[Evidence]],
    finalize_ : String => js.Promise[ValidatedResponse[Dispute]],
    find: String => js.Promise[Dispute],
    removeEvidence: (String, String) => js.Promise[ValidatedResponse[Dispute]],
    search: Any => Readable
  ): DisputeGateway = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), addFileEvidence = js.Any.fromFunction2(addFileEvidence), addTextEvidence = js.Any.fromFunction2(addTextEvidence), find = js.Any.fromFunction1(find), removeEvidence = js.Any.fromFunction2(removeEvidence), search = js.Any.fromFunction1(search))
    __obj.updateDynamic("finalize")(js.Any.fromFunction1(finalize_))
    __obj.asInstanceOf[DisputeGateway]
  }
  
  extension [Self <: DisputeGateway](x: Self) {
    
    inline def setAccept(value: String => js.Promise[ValidatedResponse[Dispute]]): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
    
    inline def setAddFileEvidence(value: (String, Category) => js.Promise[ValidatedResponse[Evidence]]): Self = StObject.set(x, "addFileEvidence", js.Any.fromFunction2(value))
    
    inline def setAddTextEvidence(value: (String, Content) => js.Promise[ValidatedResponse[Evidence]]): Self = StObject.set(x, "addTextEvidence", js.Any.fromFunction2(value))
    
    inline def setFinalize_(value: String => js.Promise[ValidatedResponse[Dispute]]): Self = StObject.set(x, "finalize", js.Any.fromFunction1(value))
    
    inline def setFind(value: String => js.Promise[Dispute]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setRemoveEvidence(value: (String, String) => js.Promise[ValidatedResponse[Dispute]]): Self = StObject.set(x, "removeEvidence", js.Any.fromFunction2(value))
    
    inline def setSearch(value: Any => Readable): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
  }
}
