package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamConsumersOutput extends StObject {
  
  /**
    * An array of JSON objects. Each object represents one registered consumer.
    */
  var Consumers: js.UndefOr[ConsumerList] = js.undefined
  
  /**
    * When the number of consumers that are registered with the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of registered consumers, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListStreamConsumers to list the next set of registered consumers. For more information about the use of this pagination token when calling the ListStreamConsumers operation, see ListStreamConsumersInput$NextToken.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListStreamConsumers, you have 300 seconds to use that value. If you specify an expired token in a call to ListStreamConsumers, you get ExpiredNextTokenException. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisMod.NextToken] = js.undefined
}
object ListStreamConsumersOutput {
  
  @scala.inline
  def apply(): ListStreamConsumersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamConsumersOutput]
  }
  
  @scala.inline
  implicit class ListStreamConsumersOutputMutableBuilder[Self <: ListStreamConsumersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumers(value: ConsumerList): Self = StObject.set(x, "Consumers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumersUndefined: Self = StObject.set(x, "Consumers", js.undefined)
    
    @scala.inline
    def setConsumersVarargs(value: Consumer*): Self = StObject.set(x, "Consumers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
