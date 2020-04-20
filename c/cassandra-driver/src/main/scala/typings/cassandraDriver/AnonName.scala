package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var strategy: String
}

object AnonName {
  @scala.inline
  def apply(name: String, strategy: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

