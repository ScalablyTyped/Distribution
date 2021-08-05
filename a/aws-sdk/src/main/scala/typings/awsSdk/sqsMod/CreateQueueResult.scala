package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQueueResult extends StObject {
  
  /**
    * The URL of the created Amazon SQS queue.
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object CreateQueueResult {
  
  inline def apply(): CreateQueueResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueResult]
  }
  
  extension [Self <: CreateQueueResult](x: Self) {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
