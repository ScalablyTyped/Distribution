package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingSubscribeOptions extends StObject {
  
  var qos: js.UndefOr[MessagingQOS] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
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
    def setQos(value: MessagingQOS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
