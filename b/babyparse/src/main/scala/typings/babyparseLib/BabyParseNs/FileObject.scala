package typings
package babyparseLib.BabyParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileObject extends js.Object {
  var config: js.UndefOr[ParseConfig] = js.undefined
  var file: java.lang.String
}

object FileObject {
  @scala.inline
  def apply(file: java.lang.String, config: ParseConfig = null): FileObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[FileObject]
  }
}

