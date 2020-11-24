package typings.bullArena.mod.BullArena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queue extends js.Object {
  
  // Interface of Queue is much larger and
  // inconsistent between different packages.
  // We are using an example method here
  // that is consistent across all providers.
  def getJob(jobId: String): js.Promise[_] = js.native
}
object Queue {
  
  @scala.inline
  def apply(getJob: String => js.Promise[_]): Queue = {
    val __obj = js.Dynamic.literal(getJob = js.Any.fromFunction1(getJob))
    __obj.asInstanceOf[Queue]
  }
  
  @scala.inline
  implicit class QueueOps[Self <: Queue] (val x: Self) extends AnyVal {
    
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
    def setGetJob(value: String => js.Promise[_]): Self = this.set("getJob", js.Any.fromFunction1(value))
  }
}
