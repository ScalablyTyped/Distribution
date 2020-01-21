package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateTagOptionWithResourceInput extends js.Object {
  /**
    * The resource identifier.
    */
  var ResourceId: typings.awsSdk.servicecatalogMod.ResourceId = js.native
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typings.awsSdk.servicecatalogMod.TagOptionId = js.native
}

object AssociateTagOptionWithResourceInput {
  @scala.inline
  def apply(ResourceId: ResourceId, TagOptionId: TagOptionId): AssociateTagOptionWithResourceInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagOptionId = TagOptionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateTagOptionWithResourceInput]
  }
}

