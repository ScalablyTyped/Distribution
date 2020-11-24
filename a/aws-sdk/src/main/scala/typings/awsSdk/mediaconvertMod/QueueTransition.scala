package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueTransition extends js.Object {
  
  /**
    * The queue that the job was on after the transition.
    */
  var DestinationQueue: js.UndefOr[string] = js.native
  
  /**
    * The queue that the job was on before the transition.
    */
  var SourceQueue: js.UndefOr[string] = js.native
  
  /**
    * The time, in Unix epoch format, that the job moved from the source queue to the destination queue.
    */
  var Timestamp: js.UndefOr[timestampUnix] = js.native
}
object QueueTransition {
  
  @scala.inline
  def apply(): QueueTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueTransition]
  }
  
  @scala.inline
  implicit class QueueTransitionOps[Self <: QueueTransition] (val x: Self) extends AnyVal {
    
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
    def setDestinationQueue(value: string): Self = this.set("DestinationQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationQueue: Self = this.set("DestinationQueue", js.undefined)
    
    @scala.inline
    def setSourceQueue(value: string): Self = this.set("SourceQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceQueue: Self = this.set("SourceQueue", js.undefined)
    
    @scala.inline
    def setTimestamp(value: timestampUnix): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
