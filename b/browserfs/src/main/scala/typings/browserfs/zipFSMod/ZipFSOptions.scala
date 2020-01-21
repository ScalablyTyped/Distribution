package typings.browserfs.zipFSMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipFSOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var zipData: Buffer
}

object ZipFSOptions {
  @scala.inline
  def apply(zipData: Buffer, name: String = null): ZipFSOptions = {
    val __obj = js.Dynamic.literal(zipData = zipData.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipFSOptions]
  }
}

