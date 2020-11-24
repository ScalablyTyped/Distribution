package typings.bullArena.mod.BullArena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareOptions extends js.Object {
  
  var Bee: js.UndefOr[QueueConstructor] = js.native
  
  var Bull: js.UndefOr[QueueConstructor] = js.native
  
  var BullMQ: js.UndefOr[QueueConstructor] = js.native
  
  var queues: js.Array[QueueOptions with ConnectionOptions] = js.native
}
object MiddlewareOptions {
  
  @scala.inline
  def apply(queues: js.Array[QueueOptions with ConnectionOptions]): MiddlewareOptions = {
    val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
  
  @scala.inline
  implicit class MiddlewareOptionsOps[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
    
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
    def setQueuesVarargs(value: (QueueOptions with ConnectionOptions)*): Self = this.set("queues", js.Array(value :_*))
    
    @scala.inline
    def setQueues(value: js.Array[QueueOptions with ConnectionOptions]): Self = this.set("queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBee(value: QueueConstructor): Self = this.set("Bee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBee: Self = this.set("Bee", js.undefined)
    
    @scala.inline
    def setBull(value: QueueConstructor): Self = this.set("Bull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBull: Self = this.set("Bull", js.undefined)
    
    @scala.inline
    def setBullMQ(value: QueueConstructor): Self = this.set("BullMQ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBullMQ: Self = this.set("BullMQ", js.undefined)
  }
}
