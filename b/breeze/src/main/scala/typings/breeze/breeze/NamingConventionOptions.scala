package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamingConventionOptions extends StObject {
  
  var clientPropertyNameToServer: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
  
  var serverPropertyNameToClient: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
}
object NamingConventionOptions {
  
  @scala.inline
  def apply(): NamingConventionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamingConventionOptions]
  }
  
  @scala.inline
  implicit class NamingConventionOptionsMutableBuilder[Self <: NamingConventionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientPropertyNameToServer(value: /* name */ String => String): Self = StObject.set(x, "clientPropertyNameToServer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClientPropertyNameToServerUndefined: Self = StObject.set(x, "clientPropertyNameToServer", js.undefined)
    
    @scala.inline
    def setServerPropertyNameToClient(value: /* name */ String => String): Self = StObject.set(x, "serverPropertyNameToClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServerPropertyNameToClientUndefined: Self = StObject.set(x, "serverPropertyNameToClient", js.undefined)
  }
}
