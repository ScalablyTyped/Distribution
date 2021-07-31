package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableStreamSpecification extends StObject {
  
  /**
    * Indicates whether DynamoDB Streams is enabled on the table.
    */
  var StreamEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the information that is written to the table.
    */
  var StreamViewType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsDynamoDbTableStreamSpecification {
  
  @scala.inline
  def apply(): AwsDynamoDbTableStreamSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableStreamSpecification]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableStreamSpecificationMutableBuilder[Self <: AwsDynamoDbTableStreamSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamEnabled(value: Boolean): Self = StObject.set(x, "StreamEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamEnabledUndefined: Self = StObject.set(x, "StreamEnabled", js.undefined)
    
    @scala.inline
    def setStreamViewType(value: NonEmptyString): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamViewTypeUndefined: Self = StObject.set(x, "StreamViewType", js.undefined)
  }
}
