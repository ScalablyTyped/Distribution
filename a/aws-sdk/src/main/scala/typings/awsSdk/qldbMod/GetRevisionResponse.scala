package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRevisionResponse extends StObject {
  
  /**
    * The proof object in Amazon Ion format returned by a GetRevision request. A proof contains the list of hash values that are required to recalculate the specified digest using a Merkle tree, starting with the specified document revision.
    */
  var Proof: js.UndefOr[ValueHolder] = js.undefined
  
  /**
    * The document revision data object in Amazon Ion format.
    */
  var Revision: ValueHolder
}
object GetRevisionResponse {
  
  @scala.inline
  def apply(Revision: ValueHolder): GetRevisionResponse = {
    val __obj = js.Dynamic.literal(Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRevisionResponse]
  }
  
  @scala.inline
  implicit class GetRevisionResponseMutableBuilder[Self <: GetRevisionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProof(value: ValueHolder): Self = StObject.set(x, "Proof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofUndefined: Self = StObject.set(x, "Proof", js.undefined)
    
    @scala.inline
    def setRevision(value: ValueHolder): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
  }
}
