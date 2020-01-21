package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTypedLinkFacetRequest extends js.Object {
  /**
    *  Facet structure that is associated with the typed link facet.
    */
  var Facet: TypedLinkFacet = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object CreateTypedLinkFacetRequest {
  @scala.inline
  def apply(Facet: TypedLinkFacet, SchemaArn: Arn): CreateTypedLinkFacetRequest = {
    val __obj = js.Dynamic.literal(Facet = Facet.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateTypedLinkFacetRequest]
  }
}

