package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetObjectInformationResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the specified object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.undefined
  
  /**
    * The facets attached to the specified object.
    */
  var SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined
}
object BatchGetObjectInformationResponse {
  
  @scala.inline
  def apply(): BatchGetObjectInformationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetObjectInformationResponse]
  }
  
  @scala.inline
  implicit class BatchGetObjectInformationResponseMutableBuilder[Self <: BatchGetObjectInformationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
    
    @scala.inline
    def setSchemaFacets(value: SchemaFacetList): Self = StObject.set(x, "SchemaFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaFacetsUndefined: Self = StObject.set(x, "SchemaFacets", js.undefined)
    
    @scala.inline
    def setSchemaFacetsVarargs(value: SchemaFacet*): Self = StObject.set(x, "SchemaFacets", js.Array(value :_*))
  }
}
