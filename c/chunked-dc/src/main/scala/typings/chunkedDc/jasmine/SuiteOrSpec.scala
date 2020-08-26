package typings.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuiteOrSpec extends js.Object {
  var description: String = js.native
  var env: Env = js.native
  var id: Double = js.native
  var queue: Queue = js.native
}

object SuiteOrSpec {
  @scala.inline
  def apply(description: String, env: Env, id: Double, queue: Queue): SuiteOrSpec = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteOrSpec]
  }
  @scala.inline
  implicit class SuiteOrSpecOps[Self <: SuiteOrSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: Env): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: Queue): Self = this.set("queue", value.asInstanceOf[js.Any])
  }
  
}

