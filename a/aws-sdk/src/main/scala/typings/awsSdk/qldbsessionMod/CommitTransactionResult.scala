package typings.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTransactionResult extends StObject {
  
  /**
    * The commit digest of the committed transaction.
    */
  var CommitDigest: js.UndefOr[typings.awsSdk.qldbsessionMod.CommitDigest] = js.undefined
  
  /**
    * The transaction ID of the committed transaction.
    */
  var TransactionId: js.UndefOr[typings.awsSdk.qldbsessionMod.TransactionId] = js.undefined
}
object CommitTransactionResult {
  
  inline def apply(): CommitTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitTransactionResult]
  }
  
  extension [Self <: CommitTransactionResult](x: Self) {
    
    inline def setCommitDigest(value: CommitDigest): Self = StObject.set(x, "CommitDigest", value.asInstanceOf[js.Any])
    
    inline def setCommitDigestUndefined: Self = StObject.set(x, "CommitDigest", js.undefined)
    
    inline def setTransactionId(value: TransactionId): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
