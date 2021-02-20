package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutRequestMod {
  
  @js.native
  trait PutRequest extends StObject {
    
    /**
      * <p>A map of attribute name to attribute values, representing the primary key of an item to be processed by <code>PutItem</code>. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item which are part of an index key schema for the table, their types must match the index key schema.</p>
      */
    var Item: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]) = js.native
  }
  object PutRequest {
    
    @scala.inline
    def apply(Item: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): PutRequest = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRequest]
    }
    
    @scala.inline
    implicit class PutRequestMutableBuilder[Self <: PutRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledPutRequest extends PutRequest {
    
    /**
      * <p>A map of attribute name to attribute values, representing the primary key of an item to be processed by <code>PutItem</code>. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item which are part of an index key schema for the table, their types must match the index key schema.</p>
      */
    @JSName("Item")
    var Item_UnmarshalledPutRequest: StringDictionary[UnmarshalledAttributeValue] = js.native
  }
  object UnmarshalledPutRequest {
    
    @scala.inline
    def apply(Item: StringDictionary[UnmarshalledAttributeValue]): UnmarshalledPutRequest = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledPutRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledPutRequestMutableBuilder[Self <: UnmarshalledPutRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    }
  }
}
