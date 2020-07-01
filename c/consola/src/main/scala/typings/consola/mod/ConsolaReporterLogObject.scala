package typings.consola.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsolaReporterLogObject extends js.Object {
  var args: js.Array[_]
  var date: Date
  var level: LogLevel
  var tag: String
  var `type`: String
}

object ConsolaReporterLogObject {
  @scala.inline
  def apply(args: js.Array[_], date: Date, level: LogLevel, tag: String, `type`: String): ConsolaReporterLogObject = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolaReporterLogObject]
  }
}

