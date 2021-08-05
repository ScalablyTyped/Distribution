package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueueResponse extends StObject {
  
  /**
    * You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
    */
  var Queue: js.UndefOr[typings.awsSdk.mediaconvertMod.Queue] = js.undefined
}
object GetQueueResponse {
  
  inline def apply(): GetQueueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueResponse]
  }
  
  extension [Self <: GetQueueResponse](x: Self) {
    
    inline def setQueue(value: Queue): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
  }
}
