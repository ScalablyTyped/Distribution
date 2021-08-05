package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetObjectAttributes extends StObject {
  
  /**
    * List of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList
  
  /**
    * Reference that identifies the object whose attributes will be retrieved.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference
  
  /**
    * Identifier for the facet whose attributes will be retrieved. See SchemaFacet for details.
    */
  var SchemaFacet: typings.awsSdk.clouddirectoryMod.SchemaFacet
}
object BatchGetObjectAttributes {
  
  inline def apply(AttributeNames: AttributeNameList, ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): BatchGetObjectAttributes = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetObjectAttributes]
  }
  
  extension [Self <: BatchGetObjectAttributes](x: Self) {
    
    inline def setAttributeNames(value: AttributeNameList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesVarargs(value: AttributeName*): Self = StObject.set(x, "AttributeNames", js.Array(value :_*))
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    inline def setSchemaFacet(value: SchemaFacet): Self = StObject.set(x, "SchemaFacet", value.asInstanceOf[js.Any])
  }
}
