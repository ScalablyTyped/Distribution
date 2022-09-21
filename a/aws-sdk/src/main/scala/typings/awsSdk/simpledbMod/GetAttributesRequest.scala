package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttributesRequest extends StObject {
  
  /**
    * The names of the attributes.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
  
  /**
    * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If true, any data previously written to SimpleDB will be returned. Otherwise, results will be consistent eventually, and the client may not see data that was written immediately before your read.
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String
  
  /**
    * The name of the item.
    */
  var ItemName: String
}
object GetAttributesRequest {
  
  inline def apply(DomainName: String, ItemName: String): GetAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributesRequest]
  }
  
  extension [Self <: GetAttributesRequest](x: Self) {
    
    inline def setAttributeNames(value: AttributeNameList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
    
    inline def setAttributeNamesVarargs(value: String*): Self = StObject.set(x, "AttributeNames", js.Array(value*))
    
    inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
