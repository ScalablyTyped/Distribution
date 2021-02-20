package typings.connectTimeout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Express {
  
  @js.native
  trait Request extends StObject {
    
    /**
      * @summary Clears the timeout on the request.
      */
    def clearTimeout(): Unit = js.native
    
    /**
      * @summary true if timeout fired; false otherwise.
      */
    var timedout: Boolean = js.native
  }
  object Request {
    
    @scala.inline
    def apply(clearTimeout: () => Unit, timedout: Boolean): Request = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction0(clearTimeout), timedout = timedout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearTimeout(value: () => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTimedout(value: Boolean): Self = StObject.set(x, "timedout", value.asInstanceOf[js.Any])
    }
  }
}
