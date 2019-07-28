package typings.cookies.cookiesMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.connect.connectMod.NextHandleFunction
import typings.cookies.Anon_Attrs
import typings.express.expressMod.Handler
import typings.keygrip.keygripMod.Keygrip
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookiesFunction
  extends Instantiable2[/* request */ IncomingMessage, /* response */ ServerResponse, Cookies]
     with /**
  * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
  */
// tslint:disable-next-line:unified-signatures
/**
  * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
  */
Instantiable3[
      /* request */ IncomingMessage, 
      /* response */ ServerResponse, 
      (/* options */ js.Array[String]) | (/* options */ Keygrip) | (/* options */ Option), 
      Cookies
    ] {
  var Cookie: Anon_Attrs = js.native
  def apply(request: IncomingMessage, response: ServerResponse): Cookies = js.native
  /**
    * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  def apply(request: IncomingMessage, response: ServerResponse, options: js.Array[String]): Cookies = js.native
  def apply(request: IncomingMessage, response: ServerResponse, options: Option): Cookies = js.native
  /**
    * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  def apply(request: IncomingMessage, response: ServerResponse, options: Keygrip): Cookies = js.native
  def connect(keys: js.Array[String]): NextHandleFunction = js.native
  def connect(keys: Keygrip): NextHandleFunction = js.native
  def express(keys: js.Array[String]): Handler = js.native
  def express(keys: Keygrip): Handler = js.native
}

