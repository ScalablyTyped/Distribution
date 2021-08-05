package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFacetFromObjectRequest extends StObject {
  
  /**
    * The ARN of the directory in which the object resides.
    */
  var DirectoryArn: Arn
  
  /**
    * A reference to the object to remove the facet from.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference
  
  /**
    * The facet to remove. See SchemaFacet for details.
    */
  var SchemaFacet: typings.awsSdk.clouddirectoryMod.SchemaFacet
}
object RemoveFacetFromObjectRequest {
  
  inline def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): RemoveFacetFromObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFacetFromObjectRequest]
  }
  
  extension [Self <: RemoveFacetFromObjectRequest](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    inline def setSchemaFacet(value: SchemaFacet): Self = StObject.set(x, "SchemaFacet", value.asInstanceOf[js.Any])
  }
}
