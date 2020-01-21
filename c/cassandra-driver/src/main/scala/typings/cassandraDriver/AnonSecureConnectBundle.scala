package typings.cassandraDriver

import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSecureConnectBundle extends js.Object {
  var secureConnectBundle: String | URL_
}

object AnonSecureConnectBundle {
  @scala.inline
  def apply(secureConnectBundle: String | URL_): AnonSecureConnectBundle = {
    val __obj = js.Dynamic.literal(secureConnectBundle = secureConnectBundle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSecureConnectBundle]
  }
}

