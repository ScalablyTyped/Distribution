package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.coinbase.coinbaseStrings.pending
  - typings.coinbase.coinbaseStrings.completed
  - typings.coinbase.coinbaseStrings.failed
  - typings.coinbase.coinbaseStrings.expired
  - typings.coinbase.coinbaseStrings.canceled
  - typings.coinbase.coinbaseStrings.waiting_for_signature
  - typings.coinbase.coinbaseStrings.waiting_for_clearing
*/
trait TransactionStatus extends StObject
object TransactionStatus {
  
  inline def canceled: typings.coinbase.coinbaseStrings.canceled = "canceled".asInstanceOf[typings.coinbase.coinbaseStrings.canceled]
  
  inline def completed: typings.coinbase.coinbaseStrings.completed = "completed".asInstanceOf[typings.coinbase.coinbaseStrings.completed]
  
  inline def expired: typings.coinbase.coinbaseStrings.expired = "expired".asInstanceOf[typings.coinbase.coinbaseStrings.expired]
  
  inline def failed: typings.coinbase.coinbaseStrings.failed = "failed".asInstanceOf[typings.coinbase.coinbaseStrings.failed]
  
  inline def pending: typings.coinbase.coinbaseStrings.pending = "pending".asInstanceOf[typings.coinbase.coinbaseStrings.pending]
  
  inline def waiting_for_clearing: typings.coinbase.coinbaseStrings.waiting_for_clearing = "waiting_for_clearing".asInstanceOf[typings.coinbase.coinbaseStrings.waiting_for_clearing]
  
  inline def waiting_for_signature: typings.coinbase.coinbaseStrings.waiting_for_signature = "waiting_for_signature".asInstanceOf[typings.coinbase.coinbaseStrings.waiting_for_signature]
}
