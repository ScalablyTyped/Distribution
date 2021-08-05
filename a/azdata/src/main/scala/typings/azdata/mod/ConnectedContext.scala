package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectedContext extends StObject {
  
  /**
    * The connection information for the selected object.
    * Note that the connection is not guaranteed to be in a connected
    * state on click.
    */
  var connectionProfile: IConnectionProfile
}
object ConnectedContext {
  
  inline def apply(connectionProfile: IConnectionProfile): ConnectedContext = {
    val __obj = js.Dynamic.literal(connectionProfile = connectionProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedContext]
  }
  
  extension [Self <: ConnectedContext](x: Self) {
    
    inline def setConnectionProfile(value: IConnectionProfile): Self = StObject.set(x, "connectionProfile", value.asInstanceOf[js.Any])
  }
}
