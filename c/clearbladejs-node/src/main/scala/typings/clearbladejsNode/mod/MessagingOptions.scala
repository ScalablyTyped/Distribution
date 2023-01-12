package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingOptions
  extends StObject
     with CommonMessagingProperties {
  
  var qos: js.UndefOr[MessagingQOS] = js.undefined
}
object MessagingOptions {
  
  inline def apply(): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagingOptions] (val x: Self) extends AnyVal {
    
    inline def setQos(value: MessagingQOS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
  }
}
