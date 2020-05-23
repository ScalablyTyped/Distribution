package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var strategy: String
}

object Name {
  @scala.inline
  def apply(name: String, strategy: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

