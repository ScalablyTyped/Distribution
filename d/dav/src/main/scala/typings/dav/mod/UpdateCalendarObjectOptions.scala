package typings.dav.mod

import typings.dav.mod.transport.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCalendarObjectOptions extends StObject {
  
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.undefined
}
object UpdateCalendarObjectOptions {
  
  @scala.inline
  def apply(): UpdateCalendarObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCalendarObjectOptions]
  }
  
  @scala.inline
  implicit class UpdateCalendarObjectOptionsMutableBuilder[Self <: UpdateCalendarObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSandbox(value: Sandbox): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    @scala.inline
    def setXhr(value: Transport): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
