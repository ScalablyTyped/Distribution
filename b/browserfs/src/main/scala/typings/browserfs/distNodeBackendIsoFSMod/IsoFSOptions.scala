package typings.browserfs.distNodeBackendIsoFSMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsoFSOptions extends js.Object {
  var data: Buffer
  var name: js.UndefOr[String] = js.undefined
}

object IsoFSOptions {
  @scala.inline
  def apply(data: Buffer, name: String = null): IsoFSOptions = {
    val __obj = js.Dynamic.literal(data = data)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IsoFSOptions]
  }
}

