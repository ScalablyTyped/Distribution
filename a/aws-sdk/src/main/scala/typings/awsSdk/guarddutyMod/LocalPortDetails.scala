package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalPortDetails extends StObject {
  
  /**
    * The port number of the local connection.
    */
  var Port: js.UndefOr[Integer] = js.native
  
  /**
    * The port name of the local connection.
    */
  var PortName: js.UndefOr[String] = js.native
}
object LocalPortDetails {
  
  @scala.inline
  def apply(): LocalPortDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalPortDetails]
  }
  
  @scala.inline
  implicit class LocalPortDetailsMutableBuilder[Self <: LocalPortDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortName(value: String): Self = StObject.set(x, "PortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNameUndefined: Self = StObject.set(x, "PortName", js.undefined)
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
