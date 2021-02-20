package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProtocolClientCapabilities extends StObject {
  
  var hostName: String = js.native
  
  var hostVersion: String = js.native
}
object DataProtocolClientCapabilities {
  
  @scala.inline
  def apply(hostName: String, hostVersion: String): DataProtocolClientCapabilities = {
    val __obj = js.Dynamic.literal(hostName = hostName.asInstanceOf[js.Any], hostVersion = hostVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProtocolClientCapabilities]
  }
  
  @scala.inline
  implicit class DataProtocolClientCapabilitiesMutableBuilder[Self <: DataProtocolClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostVersion(value: String): Self = StObject.set(x, "hostVersion", value.asInstanceOf[js.Any])
  }
}
