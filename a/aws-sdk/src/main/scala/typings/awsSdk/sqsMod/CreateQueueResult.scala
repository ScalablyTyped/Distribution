package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateQueueResult extends StObject {
  
  /**
    * The URL of the created Amazon SQS queue.
    */
  var QueueUrl: js.UndefOr[String] = js.native
}
object CreateQueueResult {
  
  @scala.inline
  def apply(): CreateQueueResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueResult]
  }
  
  @scala.inline
  implicit class CreateQueueResultMutableBuilder[Self <: CreateQueueResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
