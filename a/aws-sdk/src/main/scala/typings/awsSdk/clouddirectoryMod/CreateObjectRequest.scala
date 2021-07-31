package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateObjectRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory in which the object will be created. For more information, see arns.
    */
  var DirectoryArn: Arn
  
  /**
    * The name of link that is used to attach this object to a parent.
    */
  var LinkName: js.UndefOr[typings.awsSdk.clouddirectoryMod.LinkName] = js.undefined
  
  /**
    * The attribute map whose attribute ARN contains the key and attribute value as the map value.
    */
  var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  
  /**
    * If specified, the parent reference to which this object will be attached.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.undefined
  
  /**
    * A list of schema facets to be associated with the object. Do not provide minor version components. See SchemaFacet for details.
    */
  var SchemaFacets: SchemaFacetList
}
object CreateObjectRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, SchemaFacets: SchemaFacetList): CreateObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], SchemaFacets = SchemaFacets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateObjectRequest]
  }
  
  @scala.inline
  implicit class CreateObjectRequestMutableBuilder[Self <: CreateObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkNameUndefined: Self = StObject.set(x, "LinkName", js.undefined)
    
    @scala.inline
    def setObjectAttributeList(value: AttributeKeyAndValueList): Self = StObject.set(x, "ObjectAttributeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectAttributeListUndefined: Self = StObject.set(x, "ObjectAttributeList", js.undefined)
    
    @scala.inline
    def setObjectAttributeListVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "ObjectAttributeList", js.Array(value :_*))
    
    @scala.inline
    def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentReferenceUndefined: Self = StObject.set(x, "ParentReference", js.undefined)
    
    @scala.inline
    def setSchemaFacets(value: SchemaFacetList): Self = StObject.set(x, "SchemaFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaFacetsVarargs(value: SchemaFacet*): Self = StObject.set(x, "SchemaFacets", js.Array(value :_*))
  }
}
