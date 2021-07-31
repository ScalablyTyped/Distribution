package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueTransition extends StObject {
  
  /**
    * The queue that the job was on after the transition.
    */
  var DestinationQueue: js.UndefOr[string] = js.undefined
  
  /**
    * The queue that the job was on before the transition.
    */
  var SourceQueue: js.UndefOr[string] = js.undefined
  
  /**
    * The time, in Unix epoch format, that the job moved from the source queue to the destination queue.
    */
  var Timestamp: js.UndefOr[timestampUnix] = js.undefined
}
object QueueTransition {
  
  @scala.inline
  def apply(): QueueTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueTransition]
  }
  
  @scala.inline
  implicit class QueueTransitionMutableBuilder[Self <: QueueTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationQueue(value: string): Self = StObject.set(x, "DestinationQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationQueueUndefined: Self = StObject.set(x, "DestinationQueue", js.undefined)
    
    @scala.inline
    def setSourceQueue(value: string): Self = StObject.set(x, "SourceQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceQueueUndefined: Self = StObject.set(x, "SourceQueue", js.undefined)
    
    @scala.inline
    def setTimestamp(value: timestampUnix): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
