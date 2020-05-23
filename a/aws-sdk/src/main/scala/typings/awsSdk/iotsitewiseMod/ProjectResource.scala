package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectResource extends js.Object {
  /**
    * The ID of the project.
    */
  var id: ID = js.native
}

object ProjectResource {
  @scala.inline
  def apply(id: ID): ProjectResource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectResource]
  }
}

