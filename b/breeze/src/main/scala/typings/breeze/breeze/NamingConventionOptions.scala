package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamingConventionOptions extends StObject {
  
  var clientPropertyNameToServer: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
  
  var serverPropertyNameToClient: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
}
object NamingConventionOptions {
  
  inline def apply(): NamingConventionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamingConventionOptions]
  }
  
  extension [Self <: NamingConventionOptions](x: Self) {
    
    inline def setClientPropertyNameToServer(value: /* name */ String => String): Self = StObject.set(x, "clientPropertyNameToServer", js.Any.fromFunction1(value))
    
    inline def setClientPropertyNameToServerUndefined: Self = StObject.set(x, "clientPropertyNameToServer", js.undefined)
    
    inline def setServerPropertyNameToClient(value: /* name */ String => String): Self = StObject.set(x, "serverPropertyNameToClient", js.Any.fromFunction1(value))
    
    inline def setServerPropertyNameToClientUndefined: Self = StObject.set(x, "serverPropertyNameToClient", js.undefined)
  }
}
