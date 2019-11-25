package typings.browserfs.distNodeCoreFileUnderscoreSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemOption[T] extends js.Object {
  var description: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: String | js.Array[String]
  var validator: js.UndefOr[js.Function2[/* opt */ T, /* cb */ BFSOneArgCallback, Unit]] = js.undefined
}

object FileSystemOption {
  @scala.inline
  def apply[T](
    description: String,
    `type`: String | js.Array[String],
    optional: js.UndefOr[Boolean] = js.undefined,
    validator: (/* opt */ T, /* cb */ BFSOneArgCallback) => Unit = null
  ): FileSystemOption[T] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction2(validator))
    __obj.asInstanceOf[FileSystemOption[T]]
  }
}

