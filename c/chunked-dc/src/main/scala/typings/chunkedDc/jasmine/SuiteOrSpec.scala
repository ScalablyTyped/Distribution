package typings.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteOrSpec extends js.Object {
  var description: String
  var env: Env
  var id: Double
  var queue: Queue
}

object SuiteOrSpec {
  @scala.inline
  def apply(description: String, env: Env, id: Double, queue: Queue): SuiteOrSpec = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuiteOrSpec]
  }
}

