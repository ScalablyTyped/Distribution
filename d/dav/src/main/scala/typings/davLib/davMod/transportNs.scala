package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "transport")
@js.native
object transportNs extends js.Object {
  @js.native
  class Basic protected () extends Transport {
    /**
             * Create a new Basic object. This sends dav requests using http basic authentication.
             * @param credentials user authorization.
             */
    def this(credentials: davLib.davMod.Credentials) = this()
  }
  
  /**
       * Create a new OAuth2 object.This sends dav requests authorized via rfc 6749 oauth2.
       * @param credentials user authorization.
       */
  @js.native
  class OAuth2 protected () extends Transport {
    def this(credentials: davLib.davMod.Credentials) = this()
  }
  
  @js.native
  class Transport protected () extends js.Object {
    /**
             * @param credentials user authorization.
             */
    def this(credentials: davLib.davMod.Credentials) = this()
    def send(request: davLib.davMod.Request, url: java.lang.String): js.Promise[_] = js.native
    def send(request: davLib.davMod.Request, url: java.lang.String, options: TransportOptions): js.Promise[_] = js.native
  }
  
  
  trait TransportOptions extends js.Object {
    var retry: js.UndefOr[scala.Boolean] = js.undefined
    /**
             *  request sandbox.
             */
    var sandbox: js.UndefOr[davLib.davMod.Sandbox] = js.undefined
  }
  
}

