package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectAttributesRequest extends js.Object {
  /**
    * List of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList = js.native
  /**
    * The consistency level at which to retrieve the attributes on an object.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Reference that identifies the object whose attributes will be retrieved.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * Identifier for the facet whose attributes will be retrieved. See SchemaFacet for details.
    */
  var SchemaFacet: typings.awsSdk.clouddirectoryMod.SchemaFacet = js.native
}

object GetObjectAttributesRequest {
  @scala.inline
  def apply(
    AttributeNames: AttributeNameList,
    DirectoryArn: Arn,
    ObjectReference: ObjectReference,
    SchemaFacet: SchemaFacet
  ): GetObjectAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectAttributesRequest]
  }
  @scala.inline
  implicit class GetObjectAttributesRequestOps[Self <: GetObjectAttributesRequest] (val x: Self) extends AnyVal {
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
    def setAttributeNamesVarargs(value: AttributeName*): Self = this.set("AttributeNames", js.Array(value :_*))
    @scala.inline
    def setAttributeNames(value: AttributeNameList): Self = this.set("AttributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = this.set("ObjectReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaFacet(value: SchemaFacet): Self = this.set("SchemaFacet", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsistencyLevel(value: ConsistencyLevel): Self = this.set("ConsistencyLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistencyLevel: Self = this.set("ConsistencyLevel", js.undefined)
  }
  
}

