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
  @scala.inline
  implicit class CreateTypedLinkFacetRequestOps[Self <: CreateTypedLinkFacetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFacet(value: TypedLinkFacet): Self = this.set("Facet", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaArn(value: Arn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
  }
  
}

