package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskList extends js.Object {
  /**
    * The name of the task list.
    */
  var name: Name = js.native
}

object TaskList {
  @scala.inline
  def apply(name: Name): TaskList = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskList]
  }
}

