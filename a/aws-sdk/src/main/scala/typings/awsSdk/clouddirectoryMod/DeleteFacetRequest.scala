package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFacetRequest extends js.Object {
  /**
    * The name of the facet to delete.
    */
  var Name: FacetName = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object DeleteFacetRequest {
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn): DeleteFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFacetRequest]
  }
}

