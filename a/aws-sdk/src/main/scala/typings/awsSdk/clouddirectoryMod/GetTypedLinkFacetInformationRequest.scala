package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTypedLinkFacetInformationRequest extends js.Object {
  /**
    * The unique name of the typed link facet.
    */
  var Name: TypedLinkName = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object GetTypedLinkFacetInformationRequest {
  @scala.inline
  def apply(Name: TypedLinkName, SchemaArn: Arn): GetTypedLinkFacetInformationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTypedLinkFacetInformationRequest]
  }
}

