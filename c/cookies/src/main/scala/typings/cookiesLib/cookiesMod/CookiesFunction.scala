package typings
package cookiesLib.cookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookiesFunction
  extends org.scalablytyped.runtime.Instantiable2[
      /* request */ nodeLib.httpMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      Cookies
    ]
     with /**
  * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
  */
// tslint:disable-next-line:unified-signatures
/**
  * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
  */
org.scalablytyped.runtime.Instantiable3[
      /* request */ nodeLib.httpMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      (/* options */ js.Array[java.lang.String]) | (/* options */ keygripLib.keygripMod.Keygrip) | (/* options */ cookiesLib.cookiesMod.CookiesNs.Option), 
      Cookies
    ] {
  var Cookie: cookiesLib.Anon_Attrs = js.native
  def apply(request: nodeLib.httpMod.IncomingMessage, response: nodeLib.httpMod.ServerResponse): Cookies = js.native
  def apply(
    request: nodeLib.httpMod.IncomingMessage,
    response: nodeLib.httpMod.ServerResponse,
    options: cookiesLib.cookiesMod.CookiesNs.Option
  ): Cookies = js.native
  /**
    * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  def apply(
    request: nodeLib.httpMod.IncomingMessage,
    response: nodeLib.httpMod.ServerResponse,
    options: js.Array[java.lang.String]
  ): Cookies = js.native
  /**
    * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  def apply(
    request: nodeLib.httpMod.IncomingMessage,
    response: nodeLib.httpMod.ServerResponse,
    options: keygripLib.keygripMod.Keygrip
  ): Cookies = js.native
  def connect(keys: js.Array[java.lang.String]): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def connect(keys: keygripLib.keygripMod.Keygrip): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def express(keys: js.Array[java.lang.String]): expressLib.expressMod.eNs.Handler = js.native
  def express(keys: keygripLib.keygripMod.Keygrip): expressLib.expressMod.eNs.Handler = js.native
}

