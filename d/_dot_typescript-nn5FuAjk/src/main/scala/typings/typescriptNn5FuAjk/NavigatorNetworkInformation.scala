package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorNetworkInformation extends StObject {
  
  val connection: NetworkInformation
}
object NavigatorNetworkInformation {
  
  inline def apply(connection: NetworkInformation): NavigatorNetworkInformation = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorNetworkInformation]
  }
  
  extension [Self <: NavigatorNetworkInformation](x: Self) {
    
    inline def setConnection(value: NetworkInformation): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
  }
}
