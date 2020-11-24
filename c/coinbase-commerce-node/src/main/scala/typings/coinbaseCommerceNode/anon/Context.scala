package typings.coinbaseCommerceNode.anon

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.DELAYED
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MANUAL
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MULTIPLE
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OTHER
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OVERPAID
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNDERPAID
import typings.coinbaseCommerceNode.mod.PaymentStatus
import typings.coinbaseCommerceNode.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  /**
    * Timeline entry context.
    */
  var context: js.UndefOr[UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER] = js.native
  
  /**
    * Timeline entry status.
    */
  var status: PaymentStatus = js.native
  
  /**
    * Timeline entry timestamp.
    */
  var time: Timestamp = js.native
}
object Context {
  
  @scala.inline
  def apply(status: PaymentStatus, time: Timestamp): Context = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: PaymentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Timestamp): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
}
