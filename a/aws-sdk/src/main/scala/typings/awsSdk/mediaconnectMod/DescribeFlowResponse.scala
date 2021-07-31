package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowResponse extends StObject {
  
  var Flow: js.UndefOr[typings.awsSdk.mediaconnectMod.Flow] = js.undefined
  
  var Messages: js.UndefOr[typings.awsSdk.mediaconnectMod.Messages] = js.undefined
}
object DescribeFlowResponse {
  
  @scala.inline
  def apply(): DescribeFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowResponse]
  }
  
  @scala.inline
  implicit class DescribeFlowResponseMutableBuilder[Self <: DescribeFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: Flow): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowUndefined: Self = StObject.set(x, "Flow", js.undefined)
    
    @scala.inline
    def setMessages(value: Messages): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
  }
}
