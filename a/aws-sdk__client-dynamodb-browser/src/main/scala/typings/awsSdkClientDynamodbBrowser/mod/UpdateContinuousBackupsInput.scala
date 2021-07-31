package typings.awsSdkClientDynamodbBrowser.mod

import typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoverySpecificationMod.PointInTimeRecoverySpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContinuousBackupsInput
  extends StObject
     with typings.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
object UpdateContinuousBackupsInput {
  
  @scala.inline
  def apply(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: String): UpdateContinuousBackupsInput = {
    val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContinuousBackupsInput]
  }
}
