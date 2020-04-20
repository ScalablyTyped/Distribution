package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTypedLinkFacetRequest extends js.Object {
  /**
    * The unique name of the typed link facet.
    */
  var Name: TypedLinkName = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object DeleteTypedLinkFacetRequest {
  @scala.inline
  def apply(Name: TypedLinkName, SchemaArn: Arn): DeleteTypedLinkFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTypedLinkFacetRequest]
  }
}

