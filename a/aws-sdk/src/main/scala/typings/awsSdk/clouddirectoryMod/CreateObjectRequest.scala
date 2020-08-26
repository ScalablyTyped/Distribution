package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateObjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory in which the object will be created. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The name of link that is used to attach this object to a parent.
    */
  var LinkName: js.UndefOr[typings.awsSdk.clouddirectoryMod.LinkName] = js.native
  /**
    * The attribute map whose attribute ARN contains the key and attribute value as the map value.
    */
  var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.native
  /**
    * If specified, the parent reference to which this object will be attached.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.native
  /**
    * A list of schema facets to be associated with the object. Do not provide minor version components. See SchemaFacet for details.
    */
  var SchemaFacets: SchemaFacetList = js.native
}

object CreateObjectRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, SchemaFacets: SchemaFacetList): CreateObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], SchemaFacets = SchemaFacets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateObjectRequest]
  }
  @scala.inline
  implicit class CreateObjectRequestOps[Self <: CreateObjectRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaFacetsVarargs(value: SchemaFacet*): Self = this.set("SchemaFacets", js.Array(value :_*))
    @scala.inline
    def setSchemaFacets(value: SchemaFacetList): Self = this.set("SchemaFacets", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkName(value: LinkName): Self = this.set("LinkName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkName: Self = this.set("LinkName", js.undefined)
    @scala.inline
    def setObjectAttributeListVarargs(value: AttributeKeyAndValue*): Self = this.set("ObjectAttributeList", js.Array(value :_*))
    @scala.inline
    def setObjectAttributeList(value: AttributeKeyAndValueList): Self = this.set("ObjectAttributeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectAttributeList: Self = this.set("ObjectAttributeList", js.undefined)
    @scala.inline
    def setParentReference(value: ObjectReference): Self = this.set("ParentReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentReference: Self = this.set("ParentReference", js.undefined)
  }
  
}

