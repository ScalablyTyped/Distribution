package typings.cassandraDashDriver

import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecureConnectBundle extends js.Object {
  var secureConnectBundle: String | URL
}

object Anon_SecureConnectBundle {
  @scala.inline
  def apply(secureConnectBundle: String | URL): Anon_SecureConnectBundle = {
    val __obj = js.Dynamic.literal(secureConnectBundle = secureConnectBundle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SecureConnectBundle]
  }
}

