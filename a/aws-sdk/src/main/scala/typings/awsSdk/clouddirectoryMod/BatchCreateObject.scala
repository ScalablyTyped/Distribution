package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateObject extends js.Object {
  
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typings.awsSdk.clouddirectoryMod.BatchReferenceName] = js.native
  
  /**
    * The name of the link.
    */
  var LinkName: js.UndefOr[typings.awsSdk.clouddirectoryMod.LinkName] = js.native
  
  /**
    * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
    */
  var ObjectAttributeList: AttributeKeyAndValueList = js.native
  
  /**
    * If specified, the parent reference to which this object will be attached.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.native
  
  /**
    * A list of FacetArns that will be associated with the object. For more information, see arns.
    */
  var SchemaFacet: SchemaFacetList = js.native
}
object BatchCreateObject {
  
  @scala.inline
  def apply(ObjectAttributeList: AttributeKeyAndValueList, SchemaFacet: SchemaFacetList): BatchCreateObject = {
    val __obj = js.Dynamic.literal(ObjectAttributeList = ObjectAttributeList.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateObject]
  }
  
  @scala.inline
  implicit class BatchCreateObjectOps[Self <: BatchCreateObject] (val x: Self) extends AnyVal {
    
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
    def setObjectAttributeListVarargs(value: AttributeKeyAndValue*): Self = this.set("ObjectAttributeList", js.Array(value :_*))
    
    @scala.inline
    def setObjectAttributeList(value: AttributeKeyAndValueList): Self = this.set("ObjectAttributeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaFacetVarargs(value: SchemaFacet*): Self = this.set("SchemaFacet", js.Array(value :_*))
    
    @scala.inline
    def setSchemaFacet(value: SchemaFacetList): Self = this.set("SchemaFacet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchReferenceName(value: BatchReferenceName): Self = this.set("BatchReferenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchReferenceName: Self = this.set("BatchReferenceName", js.undefined)
    
    @scala.inline
    def setLinkName(value: LinkName): Self = this.set("LinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkName: Self = this.set("LinkName", js.undefined)
    
    @scala.inline
    def setParentReference(value: ObjectReference): Self = this.set("ParentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentReference: Self = this.set("ParentReference", js.undefined)
  }
}
