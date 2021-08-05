package typings.clearbladejsClient.CbClient

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
  
  extension [Self <: MessagingOptions](x: Self) {
    
    inline def setQos(value: MessagingQOS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
  }
}
