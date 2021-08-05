package typings.chrome.anon

import typings.chrome.chrome.enterprise.networkingAttributes.NetworkDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofnetworkingAttribute extends StObject {
  
  def getNetworkDetails(callback: js.Function1[/* networkDetails */ NetworkDetails, Unit]): Unit
}
object TypeofnetworkingAttribute {
  
  inline def apply(getNetworkDetails: js.Function1[/* networkDetails */ NetworkDetails, Unit] => Unit): TypeofnetworkingAttribute = {
    val __obj = js.Dynamic.literal(getNetworkDetails = js.Any.fromFunction1(getNetworkDetails))
    __obj.asInstanceOf[TypeofnetworkingAttribute]
  }
  
  extension [Self <: TypeofnetworkingAttribute](x: Self) {
    
    inline def setGetNetworkDetails(value: js.Function1[/* networkDetails */ NetworkDetails, Unit] => Unit): Self = StObject.set(x, "getNetworkDetails", js.Any.fromFunction1(value))
  }
}
