package typings.connectTimeout

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(timeout: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(timeout.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(timeout: String, options: TimeoutOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(timeout.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("connect-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @summary Interface for timeout options.
    * @interface
    */
  trait TimeoutOptions extends StObject {
    
    /**
      * @summary Controls if this module will "respond" in the form of forwarding an error.
      * @type {boolean}
      */
    var respond: js.UndefOr[Boolean] = js.undefined
  }
  object TimeoutOptions {
    
    inline def apply(): TimeoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeoutOptions]
    }
    
    extension [Self <: TimeoutOptions](x: Self) {
      
      inline def setRespond(value: Boolean): Self = StObject.set(x, "respond", value.asInstanceOf[js.Any])
      
      inline def setRespondUndefined: Self = StObject.set(x, "respond", js.undefined)
    }
  }
}
