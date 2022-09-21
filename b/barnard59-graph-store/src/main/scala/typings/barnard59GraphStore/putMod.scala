package typings.barnard59GraphStore

import typings.readableStream.mod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putMod {
  
  @JSImport("barnard59-graph-store/put", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arg: Options): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(arg.asInstanceOf[js.Any]).asInstanceOf[Writable]
  
  trait Options extends StObject {
    
    var endpoint: String
    
    var maxQuadsPerRequest: js.UndefOr[Double] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(endpoint: String): Options = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setMaxQuadsPerRequest(value: Double): Self = StObject.set(x, "maxQuadsPerRequest", value.asInstanceOf[js.Any])
      
      inline def setMaxQuadsPerRequestUndefined: Self = StObject.set(x, "maxQuadsPerRequest", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
