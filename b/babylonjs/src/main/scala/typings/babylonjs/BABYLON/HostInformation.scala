package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostInformation extends StObject {
  
  /**
    * Defines if the current host is a mobile
    */
  var isMobile: Boolean = js.native
}
object HostInformation {
  
  @scala.inline
  def apply(isMobile: Boolean): HostInformation = {
    val __obj = js.Dynamic.literal(isMobile = isMobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostInformation]
  }
  
  @scala.inline
  implicit class HostInformationMutableBuilder[Self <: HostInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
  }
}
