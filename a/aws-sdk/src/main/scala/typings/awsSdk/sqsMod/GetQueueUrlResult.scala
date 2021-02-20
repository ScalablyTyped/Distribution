package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQueueUrlResult extends StObject {
  
  /**
    * The URL of the queue.
    */
  var QueueUrl: js.UndefOr[String] = js.native
}
object GetQueueUrlResult {
  
  @scala.inline
  def apply(): GetQueueUrlResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueUrlResult]
  }
  
  @scala.inline
  implicit class GetQueueUrlResultMutableBuilder[Self <: GetQueueUrlResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
