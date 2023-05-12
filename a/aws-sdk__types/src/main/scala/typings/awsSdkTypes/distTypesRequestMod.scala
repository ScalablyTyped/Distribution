package typings.awsSdkTypes

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRequestMod {
  
  trait Request extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var destination: URL
  }
  object Request {
    
    inline def apply(destination: URL): Request = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDestination(value: URL): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    }
  }
}
