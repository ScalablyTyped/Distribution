package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySchemaElement extends StObject {
  
  /**
    * <p>The name of a key attribute.</p>
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The role that this key attribute will assume:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>HASH</code> - partition key</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>RANGE</code> - sort key</p>
    *             </li>
    *          </ul>
    *          <note>
    *             <p>The partition key of an item is also known as its <i>hash
    *                     attribute</i>. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across
    *                 partitions, based on their partition key values.</p>
    *             <p>The sort key of an item is also known as its <i>range attribute</i>.
    *                 The term "range attribute" derives from the way DynamoDB stores items with
    *                 the same partition key physically close together, in sorted order by the sort key
    *                 value.</p>
    *          </note>
    */
  var KeyType: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.KeyType | String] = js.undefined
}
object KeySchemaElement {
  
  inline def apply(): KeySchemaElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeySchemaElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeySchemaElement] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setKeyType(value: KeyType | String): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "KeyType", js.undefined)
  }
}
