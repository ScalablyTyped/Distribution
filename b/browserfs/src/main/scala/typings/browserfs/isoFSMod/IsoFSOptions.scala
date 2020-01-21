package typings.browserfs.isoFSMod

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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsoFSOptions]
  }
}

