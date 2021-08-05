package typings.connectTimeout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Express {
  
  trait Request extends StObject {
    
    /**
      * @summary Clears the timeout on the request.
      */
    def clearTimeout(): Unit
    
    /**
      * @summary true if timeout fired; false otherwise.
      */
    var timedout: Boolean
  }
  object Request {
    
    inline def apply(clearTimeout: () => Unit, timedout: Boolean): Request = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction0(clearTimeout), timedout = timedout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setClearTimeout(value: () => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction0(value))
      
      inline def setTimedout(value: Boolean): Self = StObject.set(x, "timedout", value.asInstanceOf[js.Any])
    }
  }
}
