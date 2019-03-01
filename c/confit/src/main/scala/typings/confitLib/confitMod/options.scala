package typings
package confitLib.confitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends js.Object {
  var basedir: java.lang.String
  var protocols: ProtocolsSetPrivate
}

object options {
  @scala.inline
  def apply(basedir: java.lang.String, protocols: ProtocolsSetPrivate): options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basedir")(basedir)
    __obj.updateDynamic("protocols")(protocols)
    __obj.asInstanceOf[options]
  }
}

