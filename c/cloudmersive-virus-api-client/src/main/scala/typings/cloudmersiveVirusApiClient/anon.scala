package typings.cloudmersiveVirusApiClient

import typings.cloudmersiveVirusApiClient.mod.ApiInstanceAuthentications
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Apikey extends StObject {
    
    var Apikey: ApiInstanceAuthentications = js.native
  }
  object Apikey {
    
    @scala.inline
    def apply(Apikey: ApiInstanceAuthentications): Apikey = {
      val __obj = js.Dynamic.literal(Apikey = Apikey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Apikey]
    }
    
    @scala.inline
    implicit class ApikeyMutableBuilder[Self <: Apikey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApikey(value: ApiInstanceAuthentications): Self = StObject.set(x, "Apikey", value.asInstanceOf[js.Any])
    }
  }
}
