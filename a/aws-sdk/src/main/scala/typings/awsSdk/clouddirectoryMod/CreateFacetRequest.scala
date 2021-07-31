package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFacetRequest extends StObject {
  
  /**
    * The attributes that are associated with the Facet.
    */
  var Attributes: js.UndefOr[FacetAttributeList] = js.undefined
  
  /**
    * There are two different styles that you can define on any given facet, Static and Dynamic. For static facets, all attributes must be defined in the schema. For dynamic facets, attributes can be defined during data plane operations.
    */
  var FacetStyle: js.UndefOr[typings.awsSdk.clouddirectoryMod.FacetStyle] = js.undefined
  
  /**
    * The name of the Facet, which is unique for a given schema.
    */
  var Name: FacetName
  
  /**
    * Specifies whether a given object created from this facet is of type node, leaf node, policy or index.   Node: Can have multiple children but one parent.     Leaf node: Cannot have children but can have multiple parents.     Policy: Allows you to store a policy document and policy type. For more information, see Policies.     Index: Can be created with the Index API.  
    */
  var ObjectType: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectType] = js.undefined
  
  /**
    * The schema ARN in which the new Facet will be created. For more information, see arns.
    */
  var SchemaArn: Arn
}
object CreateFacetRequest {
  
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn): CreateFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFacetRequest]
  }
  
  @scala.inline
  implicit class CreateFacetRequestMutableBuilder[Self <: CreateFacetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: FacetAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: FacetAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setFacetStyle(value: FacetStyle): Self = StObject.set(x, "FacetStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetStyleUndefined: Self = StObject.set(x, "FacetStyle", js.undefined)
    
    @scala.inline
    def setName(value: FacetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: ObjectType): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "ObjectType", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
