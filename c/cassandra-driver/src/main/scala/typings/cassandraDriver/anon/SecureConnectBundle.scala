package typings.cassandraDriver.anon

import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureConnectBundle extends js.Object {
  var secureConnectBundle: String | URL_ = js.native
}

object SecureConnectBundle {
  @scala.inline
  def apply(secureConnectBundle: String | URL_): SecureConnectBundle = {
    val __obj = js.Dynamic.literal(secureConnectBundle = secureConnectBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureConnectBundle]
  }
  @scala.inline
  implicit class SecureConnectBundleOps[Self <: SecureConnectBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSecureConnectBundle(value: String | URL_): Self = this.set("secureConnectBundle", value.asInstanceOf[js.Any])
  }
  
}

