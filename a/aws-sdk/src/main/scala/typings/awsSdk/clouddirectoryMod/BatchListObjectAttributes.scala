package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListObjectAttributes extends StObject {
  
  /**
    * Used to filter the list of object attributes that are associated with a certain facet.
    */
  var FacetFilter: js.UndefOr[SchemaFacet] = js.undefined
  
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Reference of the object whose attributes need to be listed.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference
}
object BatchListObjectAttributes {
  
  @scala.inline
  def apply(ObjectReference: ObjectReference): BatchListObjectAttributes = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectAttributes]
  }
  
  @scala.inline
  implicit class BatchListObjectAttributesMutableBuilder[Self <: BatchListObjectAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacetFilter(value: SchemaFacet): Self = StObject.set(x, "FacetFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetFilterUndefined: Self = StObject.set(x, "FacetFilter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
