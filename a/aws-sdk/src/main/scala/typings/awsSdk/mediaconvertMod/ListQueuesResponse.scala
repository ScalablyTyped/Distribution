package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueuesResponse extends StObject {
  
  /**
    * Use this string to request the next batch of queues.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * List of queues.
    */
  var Queues: js.UndefOr[listOfQueue] = js.native
}
object ListQueuesResponse {
  
  @scala.inline
  def apply(): ListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesResponse]
  }
  
  @scala.inline
  implicit class ListQueuesResponseMutableBuilder[Self <: ListQueuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQueues(value: listOfQueue): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    @scala.inline
    def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "Queues", js.Array(value :_*))
  }
}
