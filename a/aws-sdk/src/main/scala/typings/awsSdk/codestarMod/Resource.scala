package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var id: ResourceId = js.native
}

object Resource {
  @scala.inline
  def apply(id: ResourceId): Resource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resource]
  }
}

