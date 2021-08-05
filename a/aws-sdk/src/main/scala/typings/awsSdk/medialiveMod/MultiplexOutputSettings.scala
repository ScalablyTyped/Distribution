package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexOutputSettings extends StObject {
  
  /**
    * Destination is a Multiplex.
    */
  var Destination: OutputLocationRef
}
object MultiplexOutputSettings {
  
  inline def apply(Destination: OutputLocationRef): MultiplexOutputSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexOutputSettings]
  }
  
  extension [Self <: MultiplexOutputSettings](x: Self) {
    
    inline def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
  }
}
