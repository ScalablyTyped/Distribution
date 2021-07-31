package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexOutputDestination extends StObject {
  
  /**
    * Multiplex MediaConnect output destination settings.
    */
  var MediaConnectSettings: js.UndefOr[MultiplexMediaConnectOutputDestinationSettings] = js.undefined
}
object MultiplexOutputDestination {
  
  @scala.inline
  def apply(): MultiplexOutputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexOutputDestination]
  }
  
  @scala.inline
  implicit class MultiplexOutputDestinationMutableBuilder[Self <: MultiplexOutputDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaConnectSettings(value: MultiplexMediaConnectOutputDestinationSettings): Self = StObject.set(x, "MediaConnectSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConnectSettingsUndefined: Self = StObject.set(x, "MediaConnectSettings", js.undefined)
  }
}
