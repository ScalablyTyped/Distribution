package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTypedLinkFacetRequest extends js.Object {
  /**
    * Attributes update structure.
    */
  var AttributeUpdates: TypedLinkFacetAttributeUpdateList = js.native
  /**
    * The order of identity attributes for the facet, from most significant to least significant. The ability to filter typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to a typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls. For more information about identity attributes, see Typed Links.
    */
  var IdentityAttributeOrder: AttributeNameList = js.native
  /**
    * The unique name of the typed link facet.
    */
  var Name: TypedLinkName = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object UpdateTypedLinkFacetRequest {
  @scala.inline
  def apply(
    AttributeUpdates: TypedLinkFacetAttributeUpdateList,
    IdentityAttributeOrder: AttributeNameList,
    Name: TypedLinkName,
    SchemaArn: Arn
  ): UpdateTypedLinkFacetRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], IdentityAttributeOrder = IdentityAttributeOrder.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTypedLinkFacetRequest]
  }
  @scala.inline
  implicit class UpdateTypedLinkFacetRequestOps[Self <: UpdateTypedLinkFacetRequest] (val x: Self) extends AnyVal {
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
    def setAttributeUpdatesVarargs(value: TypedLinkFacetAttributeUpdate*): Self = this.set("AttributeUpdates", js.Array(value :_*))
    @scala.inline
    def setAttributeUpdates(value: TypedLinkFacetAttributeUpdateList): Self = this.set("AttributeUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityAttributeOrderVarargs(value: AttributeName*): Self = this.set("IdentityAttributeOrder", js.Array(value :_*))
    @scala.inline
    def setIdentityAttributeOrder(value: AttributeNameList): Self = this.set("IdentityAttributeOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: TypedLinkName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaArn(value: Arn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
  }
  
}

