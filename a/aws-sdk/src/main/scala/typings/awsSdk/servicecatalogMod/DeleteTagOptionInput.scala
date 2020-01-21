package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagOptionInput extends js.Object {
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId = js.native
}

object DeleteTagOptionInput {
  @scala.inline
  def apply(Id: TagOptionId): DeleteTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTagOptionInput]
  }
}

