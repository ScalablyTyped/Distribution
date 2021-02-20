package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableAttributeDefinition extends StObject {
  
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of the attribute.
    */
  var AttributeType: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableAttributeDefinition {
  
  @scala.inline
  def apply(): AwsDynamoDbTableAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableAttributeDefinition]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableAttributeDefinitionMutableBuilder[Self <: AwsDynamoDbTableAttributeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: NonEmptyString): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setAttributeType(value: NonEmptyString): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
  }
}
