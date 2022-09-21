package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.AttributeValue
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteRequestMod {
  
  trait DeleteRequest extends StObject {
    
    /**
      * <p>A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.</p>
      */
    var Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
  }
  object DeleteRequest {
    
    inline def apply(Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])): DeleteRequest = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteRequest]
    }
    
    extension [Self <: DeleteRequest](x: Self) {
      
      inline def setKey(value: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledDeleteRequest
    extends StObject
       with DeleteRequest {
    
    /**
      * <p>A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.</p>
      */
    @JSName("Key")
    var Key_UnmarshalledDeleteRequest: StringDictionary[UnmarshalledAttributeValue]
  }
  object UnmarshalledDeleteRequest {
    
    inline def apply(Key: StringDictionary[UnmarshalledAttributeValue]): UnmarshalledDeleteRequest = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledDeleteRequest]
    }
    
    extension [Self <: UnmarshalledDeleteRequest](x: Self) {
      
      inline def setKey(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    }
  }
}
