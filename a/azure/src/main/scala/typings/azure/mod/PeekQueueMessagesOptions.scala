package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeekQueueMessagesOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var numofmessages: js.UndefOr[Double] = js.undefined
}
object PeekQueueMessagesOptions {
  
  inline def apply(): PeekQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeekQueueMessagesOptions]
  }
  
  extension [Self <: PeekQueueMessagesOptions](x: Self) {
    
    inline def setNumofmessages(value: Double): Self = StObject.set(x, "numofmessages", value.asInstanceOf[js.Any])
    
    inline def setNumofmessagesUndefined: Self = StObject.set(x, "numofmessages", js.undefined)
  }
}
