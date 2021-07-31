package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingsRequest extends StObject {
  
  /**
    * The attribute name used to search for things.
    */
  var attributeName: js.UndefOr[AttributeName] = js.undefined
  
  /**
    * The attribute value used to search for things.
    */
  var attributeValue: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The maximum number of results to return in this operation.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the thing type used to search for things.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}
object ListThingsRequest {
  
  @scala.inline
  def apply(): ListThingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingsRequest]
  }
  
  @scala.inline
  implicit class ListThingsRequestMutableBuilder[Self <: ListThingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: AttributeName): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    @scala.inline
    def setAttributeValue(value: AttributeValue): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
    
    @scala.inline
    def setMaxResults(value: RegistryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
  }
}
