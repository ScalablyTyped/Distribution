package typings.consola.consolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsolaLogObject extends js.Object {
  var additional: js.UndefOr[String | js.Array[String]] = js.undefined
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ConsolaLogObject {
  @scala.inline
  def apply(
    additional: String | js.Array[String] = null,
    args: js.Array[_] = null,
    level: Int | Double = null,
    message: String = null,
    tag: String = null,
    `type`: String = null
  ): ConsolaLogObject = {
    val __obj = js.Dynamic.literal()
    if (additional != null) __obj.updateDynamic("additional")(additional.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolaLogObject]
  }
}

