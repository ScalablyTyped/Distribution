package typings.confit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends js.Object {
  var basedir: String
  var protocols: ProtocolsSetPrivate
}

object options {
  @scala.inline
  def apply(basedir: String, protocols: ProtocolsSetPrivate): options = {
    val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
}

