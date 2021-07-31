package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoundNetworkProperties extends StObject {
  
  /** The network operator's long-format name. */
  var LongName: js.UndefOr[String] = js.undefined
  
  /** Network ID. */
  var NetworkId: String
  
  /** The network operator's short-format name. */
  var ShortName: js.UndefOr[String] = js.undefined
  
  /** Network availability. */
  var Status: String
  
  /** Access technology used by the network. */
  var Technology: String
}
object FoundNetworkProperties {
  
  @scala.inline
  def apply(NetworkId: String, Status: String, Technology: String): FoundNetworkProperties = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Technology = Technology.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoundNetworkProperties]
  }
  
  @scala.inline
  implicit class FoundNetworkPropertiesMutableBuilder[Self <: FoundNetworkProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLongName(value: String): Self = StObject.set(x, "LongName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongNameUndefined: Self = StObject.set(x, "LongName", js.undefined)
    
    @scala.inline
    def setNetworkId(value: String): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortName(value: String): Self = StObject.set(x, "ShortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNameUndefined: Self = StObject.set(x, "ShortName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechnology(value: String): Self = StObject.set(x, "Technology", value.asInstanceOf[js.Any])
  }
}
