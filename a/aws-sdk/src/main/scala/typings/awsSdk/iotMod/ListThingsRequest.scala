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
  
  inline def apply(): ListThingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingsRequest]
  }
  
  extension [Self <: ListThingsRequest](x: Self) {
    
    inline def setAttributeName(value: AttributeName): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    inline def setAttributeValue(value: AttributeValue): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
    
    inline def setMaxResults(value: RegistryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    inline def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
  }
}
