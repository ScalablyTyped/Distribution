package typings.confit.confitMod

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
    val __obj = js.Dynamic.literal(basedir = basedir, protocols = protocols)
  
    __obj.asInstanceOf[options]
  }
}

