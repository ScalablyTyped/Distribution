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
  var connectionProfile: js.UndefOr[IConnectionProfile] = js.undefined
}
object ConnectedContext {
  
  inline def apply(): ConnectedContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectedContext] (val x: Self) extends AnyVal {
    
    inline def setConnectionProfile(value: IConnectionProfile): Self = StObject.set(x, "connectionProfile", value.asInstanceOf[js.Any])
    
    inline def setConnectionProfileUndefined: Self = StObject.set(x, "connectionProfile", js.undefined)
  }
}
