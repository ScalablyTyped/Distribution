package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueueMessagesOptions
  extends StObject
     with PeekQueueMessagesOptions {
  
  var peekonly: js.UndefOr[Boolean] = js.undefined
  
  var visibilitytimeout: js.UndefOr[Double] = js.undefined
}
object GetQueueMessagesOptions {
  
  @scala.inline
  def apply(): GetQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueMessagesOptions]
  }
  
  @scala.inline
  implicit class GetQueueMessagesOptionsMutableBuilder[Self <: GetQueueMessagesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeekonly(value: Boolean): Self = StObject.set(x, "peekonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeekonlyUndefined: Self = StObject.set(x, "peekonly", js.undefined)
    
    @scala.inline
    def setVisibilitytimeout(value: Double): Self = StObject.set(x, "visibilitytimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilitytimeoutUndefined: Self = StObject.set(x, "visibilitytimeout", js.undefined)
  }
}
