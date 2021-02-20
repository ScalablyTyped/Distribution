package typings.connectTimeout

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-timeout", JSImport.Namespace)
  @js.native
  def apply(timeout: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-timeout", JSImport.Namespace)
  @js.native
  def apply(timeout: String, options: TimeoutOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * @summary Interface for timeout options.
    * @interface
    */
  @js.native
  trait TimeoutOptions extends StObject {
    
    /**
      * @summary Controls if this module will "respond" in the form of forwarding an error.
      * @type {boolean}
      */
    var respond: js.UndefOr[Boolean] = js.native
  }
  object TimeoutOptions {
    
    @scala.inline
    def apply(): TimeoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeoutOptions]
    }
    
    @scala.inline
    implicit class TimeoutOptionsMutableBuilder[Self <: TimeoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRespond(value: Boolean): Self = StObject.set(x, "respond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespondUndefined: Self = StObject.set(x, "respond", js.undefined)
    }
  }
}
