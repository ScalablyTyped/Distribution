package typings.axeDashCore.axeDashCoreMod

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
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[TestEngine]
  }
}

