package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment status.
  */
/* Rewritten from type alias, can be one of: 
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.COMPLETED
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED
*/
trait PaymentStatus extends js.Object
object PaymentStatus {
  
  @scala.inline
  def CANCELED: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED = "CANCELED".asInstanceOf[typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED]
  
  @scala.inline
  def COMPLETED: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.COMPLETED = "COMPLETED".asInstanceOf[typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.COMPLETED]
  
  @scala.inline
  def EXPIRED: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED = "EXPIRED".asInstanceOf[typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED]
  
  @scala.inline
  def NEW: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW = "NEW".asInstanceOf[typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW]
  
  @scala.inline
  def PENDING: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING = "PENDING".asInstanceOf[typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING]
  
  @scala.inline
  def RESOLVED: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED = "RESOLVED".asInstanceOf[typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED]
  
  @scala.inline
  def UNRESOLVED: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED = "UNRESOLVED".asInstanceOf[typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED]
}
