package typings.contractProxyKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConfigEntry extends js.Object {
  var fallbackHandlerAddress: String
  var masterCopyAddress: String
  var multiSendAddress: String
  var proxyFactoryAddress: String
}

object NetworkConfigEntry {
  @scala.inline
  def apply(
    fallbackHandlerAddress: String,
    masterCopyAddress: String,
    multiSendAddress: String,
    proxyFactoryAddress: String
  ): NetworkConfigEntry = {
    val __obj = js.Dynamic.literal(fallbackHandlerAddress = fallbackHandlerAddress.asInstanceOf[js.Any], masterCopyAddress = masterCopyAddress.asInstanceOf[js.Any], multiSendAddress = multiSendAddress.asInstanceOf[js.Any], proxyFactoryAddress = proxyFactoryAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkConfigEntry]
  }
}

