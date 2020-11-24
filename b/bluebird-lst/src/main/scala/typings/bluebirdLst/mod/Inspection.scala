package typings.bluebirdLst.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inspection[R] extends js.Object {
  
  /**
    * See if the underlying promise was cancelled at the creation time of this inspection object.
    */
  def isCancelled(): Boolean = js.native
  
  /**
    * See if the underlying promise was fulfilled at the creation time of this inspection object.
    */
  def isFulfilled(): Boolean = js.native
  
  /**
    * See if the underlying promise was defer at the creation time of this inspection object.
    */
  def isPending(): Boolean = js.native
  
  /**
    * See if the underlying promise was rejected at the creation time of this inspection object.
    */
  def isRejected(): Boolean = js.native
  
  /**
    * Get the rejection reason for the underlying promise. Throws if the promise wasn't rejected at the creation time of this inspection object.
    *
    * throws `TypeError`
    */
  def reason(): js.Any = js.native
  
  /**
    * Get the fulfillment value of the underlying promise. Throws if the promise wasn't fulfilled at the creation time of this inspection object.
    *
    * throws `TypeError`
    */
  def value(): R = js.native
}
object Inspection {
  
  @scala.inline
  def apply[R](
    isCancelled: () => Boolean,
    isFulfilled: () => Boolean,
    isPending: () => Boolean,
    isRejected: () => Boolean,
    reason: () => js.Any,
    value: () => R
  ): Inspection[R] = {
    val __obj = js.Dynamic.literal(isCancelled = js.Any.fromFunction0(isCancelled), isFulfilled = js.Any.fromFunction0(isFulfilled), isPending = js.Any.fromFunction0(isPending), isRejected = js.Any.fromFunction0(isRejected), reason = js.Any.fromFunction0(reason), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[Inspection[R]]
  }
  
  @scala.inline
  implicit class InspectionOps[Self <: Inspection[_], R] (val x: Self with Inspection[R]) extends AnyVal {
    
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
    def setIsCancelled(value: () => Boolean): Self = this.set("isCancelled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFulfilled(value: () => Boolean): Self = this.set("isFulfilled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPending(value: () => Boolean): Self = this.set("isPending", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRejected(value: () => Boolean): Self = this.set("isRejected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReason(value: () => js.Any): Self = this.set("reason", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: () => R): Self = this.set("value", js.Any.fromFunction0(value))
  }
}
