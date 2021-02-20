package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeySchemaElement extends StObject {
  
  /**
    * The name of a key attribute.
    */
  var AttributeName: KeySchemaAttributeName = js.native
  
  /**
    * The role that this key attribute will assume:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeyType: typings.awsSdk.dynamodbMod.KeyType = js.native
}
object KeySchemaElement {
  
  @scala.inline
  def apply(AttributeName: KeySchemaAttributeName, KeyType: KeyType): KeySchemaElement = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], KeyType = KeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySchemaElement]
  }
  
  @scala.inline
  implicit class KeySchemaElementMutableBuilder[Self <: KeySchemaElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: KeySchemaAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyType(value: KeyType): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
  }
}
