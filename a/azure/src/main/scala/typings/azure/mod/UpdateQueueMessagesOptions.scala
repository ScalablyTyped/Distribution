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
  
  @scala.inline
  def apply(): UpdateQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQueueMessagesOptions]
  }
  
  @scala.inline
  implicit class UpdateQueueMessagesOptionsMutableBuilder[Self <: UpdateQueueMessagesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessagetext(value: String): Self = StObject.set(x, "messagetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagetextUndefined: Self = StObject.set(x, "messagetext", js.undefined)
  }
}
