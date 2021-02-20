package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateQueueMessageOptions extends TimeoutIntervalOptions {
  
  var messagettl: js.UndefOr[Double] = js.native
  
  var visibilitytimeout: js.UndefOr[Double] = js.native
}
object CreateQueueMessageOptions {
  
  @scala.inline
  def apply(): CreateQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueMessageOptions]
  }
  
  @scala.inline
  implicit class CreateQueueMessageOptionsMutableBuilder[Self <: CreateQueueMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessagettl(value: Double): Self = StObject.set(x, "messagettl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagettlUndefined: Self = StObject.set(x, "messagettl", js.undefined)
    
    @scala.inline
    def setVisibilitytimeout(value: Double): Self = StObject.set(x, "visibilitytimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilitytimeoutUndefined: Self = StObject.set(x, "visibilitytimeout", js.undefined)
  }
}
