package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEngine extends js.Object {
  var name: java.lang.String
  var version: java.lang.String
}

object TestEngine {
  @scala.inline
  def apply(name: java.lang.String, version: java.lang.String): TestEngine = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[TestEngine]
  }
}

