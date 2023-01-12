package typings.cloudmersiveVirusApiClient

import typings.cloudmersiveVirusApiClient.mod.ApiInstanceAuthentications
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Apikey extends StObject {
    
    var Apikey: ApiInstanceAuthentications
  }
  object Apikey {
    
    inline def apply(Apikey: ApiInstanceAuthentications): Apikey = {
      val __obj = js.Dynamic.literal(Apikey = Apikey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Apikey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Apikey] (val x: Self) extends AnyVal {
      
      inline def setApikey(value: ApiInstanceAuthentications): Self = StObject.set(x, "Apikey", value.asInstanceOf[js.Any])
    }
  }
}
