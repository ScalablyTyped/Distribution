package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFacetRequest extends js.Object {
  /**
    * The name of the facet to retrieve.
    */
  var Name: FacetName = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object GetFacetRequest {
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn): GetFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFacetRequest]
  }
}

