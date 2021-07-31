package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableKeySchema extends StObject {
  
  /**
    * The name of the key schema attribute.
    */
  var AttributeName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of key used for the key schema attribute.
    */
  var KeyType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsDynamoDbTableKeySchema {
  
  @scala.inline
  def apply(): AwsDynamoDbTableKeySchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableKeySchema]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableKeySchemaMutableBuilder[Self <: AwsDynamoDbTableKeySchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: NonEmptyString): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setKeyType(value: NonEmptyString): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "KeyType", js.undefined)
  }
}
