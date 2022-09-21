package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQueueResponse extends StObject {
  
  /**
    * The name of the queue.
    */
  var Queue: js.UndefOr[typings.awsSdk.connectMod.Queue] = js.undefined
}
object DescribeQueueResponse {
  
  inline def apply(): DescribeQueueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueueResponse]
  }
  
  extension [Self <: DescribeQueueResponse](x: Self) {
    
    inline def setQueue(value: Queue): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
  }
}
