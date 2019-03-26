package typings
package cookiesLib.cookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookies", JSImport.Namespace)
@js.native
class namespacedCls protected () extends Cookies {
  def this(request: nodeLib.httpMod.IncomingMessage, response: nodeLib.httpMod.ServerResponse) = this()
  def this(request: nodeLib.httpMod.IncomingMessage, response: nodeLib.httpMod.ServerResponse, options: cookiesLib.cookiesMod.CookiesNs.Option) = this()
  /**
    * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  def this(request: nodeLib.httpMod.IncomingMessage, response: nodeLib.httpMod.ServerResponse, options: js.Array[java.lang.String]) = this()
  /**
    * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  def this(request: nodeLib.httpMod.IncomingMessage, response: nodeLib.httpMod.ServerResponse, options: keygripLib.keygripMod.Keygrip) = this()
}

