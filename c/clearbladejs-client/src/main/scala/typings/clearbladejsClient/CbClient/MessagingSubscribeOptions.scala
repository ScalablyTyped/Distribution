package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingSubscribeOptions extends StObject {
  
  var invocationContext: js.UndefOr[js.Object] = js.native
  
  var onFailure: js.UndefOr[js.Function] = js.native
  
  var onSuccess: js.UndefOr[js.Function] = js.native
  
  var qos: js.UndefOr[MessagingQOS] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object MessagingSubscribeOptions {
  
  @scala.inline
  def apply(): MessagingSubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingSubscribeOptions]
  }
  
  @scala.inline
  implicit class MessagingSubscribeOptionsMutableBuilder[Self <: MessagingSubscribeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvocationContext(value: js.Object): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationContextUndefined: Self = StObject.set(x, "invocationContext", js.undefined)
    
    @scala.inline
    def setOnFailure(value: js.Function): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: js.Function): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    @scala.inline
    def setQos(value: MessagingQOS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
