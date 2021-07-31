package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedLinkSpecifier extends StObject {
  
  /**
    * Identifies the attribute value to update.
    */
  var IdentityAttributeValues: AttributeNameAndValueList
  
  /**
    * Identifies the source object that the typed link will attach to.
    */
  var SourceObjectReference: ObjectReference
  
  /**
    * Identifies the target object that the typed link will attach to.
    */
  var TargetObjectReference: ObjectReference
  
  /**
    * Identifies the typed link facet that is associated with the typed link.
    */
  var TypedLinkFacet: TypedLinkSchemaAndFacetName
}
object TypedLinkSpecifier {
  
  @scala.inline
  def apply(
    IdentityAttributeValues: AttributeNameAndValueList,
    SourceObjectReference: ObjectReference,
    TargetObjectReference: ObjectReference,
    TypedLinkFacet: TypedLinkSchemaAndFacetName
  ): TypedLinkSpecifier = {
    val __obj = js.Dynamic.literal(IdentityAttributeValues = IdentityAttributeValues.asInstanceOf[js.Any], SourceObjectReference = SourceObjectReference.asInstanceOf[js.Any], TargetObjectReference = TargetObjectReference.asInstanceOf[js.Any], TypedLinkFacet = TypedLinkFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkSpecifier]
  }
  
  @scala.inline
  implicit class TypedLinkSpecifierMutableBuilder[Self <: TypedLinkSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityAttributeValues(value: AttributeNameAndValueList): Self = StObject.set(x, "IdentityAttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityAttributeValuesVarargs(value: AttributeNameAndValue*): Self = StObject.set(x, "IdentityAttributeValues", js.Array(value :_*))
    
    @scala.inline
    def setSourceObjectReference(value: ObjectReference): Self = StObject.set(x, "SourceObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetObjectReference(value: ObjectReference): Self = StObject.set(x, "TargetObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedLinkFacet(value: TypedLinkSchemaAndFacetName): Self = StObject.set(x, "TypedLinkFacet", value.asInstanceOf[js.Any])
  }
}
