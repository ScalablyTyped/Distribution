package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQueueMessagesOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var messagetext: js.UndefOr[String] = js.undefined
}
object UpdateQueueMessagesOptions {
  
  inline def apply(): UpdateQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQueueMessagesOptions]
  }
  
  extension [Self <: UpdateQueueMessagesOptions](x: Self) {
    
    inline def setMessagetext(value: String): Self = StObject.set(x, "messagetext", value.asInstanceOf[js.Any])
    
    inline def setMessagetextUndefined: Self = StObject.set(x, "messagetext", js.undefined)
  }
}
