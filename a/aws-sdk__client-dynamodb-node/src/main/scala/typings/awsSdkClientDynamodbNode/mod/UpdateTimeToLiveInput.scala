package typings.awsSdkClientDynamodbNode.mod

import typings.awsSdkClientDynamodbNode.typesTimeToLiveSpecificationMod.TimeToLiveSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTimeToLiveInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
object UpdateTimeToLiveInput {
  
  inline def apply(TableName: String, TimeToLiveSpecification: TimeToLiveSpecification): UpdateTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimeToLiveInput]
  }
}
