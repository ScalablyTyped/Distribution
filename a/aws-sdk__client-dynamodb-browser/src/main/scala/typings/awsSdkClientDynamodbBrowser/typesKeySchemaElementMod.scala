package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.HASH
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.RANGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeySchemaElementMod {
  
  trait KeySchemaElement extends StObject {
    
    /**
      * <p>The name of a key attribute.</p>
      */
    var AttributeName: String
    
    /**
      * <p>The role that this key attribute will assume:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    var KeyType: HASH | RANGE | String
  }
  object KeySchemaElement {
    
    inline def apply(AttributeName: String, KeyType: HASH | RANGE | String): KeySchemaElement = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], KeyType = KeyType.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeySchemaElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeySchemaElement] (val x: Self) extends AnyVal {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      inline def setKeyType(value: HASH | RANGE | String): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledKeySchemaElement = KeySchemaElement
}
