package typings.babyparse.BabyParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileObject extends js.Object {
  var config: js.UndefOr[ParseConfig] = js.undefined
  var file: String
}

object FileObject {
  @scala.inline
  def apply(file: String, config: ParseConfig = null): FileObject = {
    val __obj = js.Dynamic.literal(file = file)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[FileObject]
  }
}

