package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEngine extends js.Object {
  var name: String
  var version: String
}

object TestEngine {
  @scala.inline
  def apply(name: String, version: String): TestEngine = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEngine]
  }
}

