package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostInformation extends StObject {
  
  /**
    * Defines if the current host is a mobile
    */
  var isMobile: Boolean
}
object HostInformation {
  
  inline def apply(isMobile: Boolean): HostInformation = {
    val __obj = js.Dynamic.literal(isMobile = isMobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostInformation]
  }
  
  extension [Self <: HostInformation](x: Self) {
    
    inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
  }
}
