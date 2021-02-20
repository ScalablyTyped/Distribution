package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexOutputSettings extends StObject {
  
  /**
    * Destination is a Multiplex.
    */
  var Destination: OutputLocationRef = js.native
}
object MultiplexOutputSettings {
  
  @scala.inline
  def apply(Destination: OutputLocationRef): MultiplexOutputSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexOutputSettings]
  }
  
  @scala.inline
  implicit class MultiplexOutputSettingsMutableBuilder[Self <: MultiplexOutputSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
  }
}
