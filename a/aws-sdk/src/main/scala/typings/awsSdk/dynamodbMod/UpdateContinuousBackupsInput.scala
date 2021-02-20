package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContinuousBackupsInput extends StObject {
  
  /**
    * Represents the settings used to enable point in time recovery.
    */
  var PointInTimeRecoverySpecification: typings.awsSdk.dynamodbMod.PointInTimeRecoverySpecification = js.native
  
  /**
    * The name of the table.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}
object UpdateContinuousBackupsInput {
  
  @scala.inline
  def apply(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: TableName): UpdateContinuousBackupsInput = {
    val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContinuousBackupsInput]
  }
  
  @scala.inline
  implicit class UpdateContinuousBackupsInputMutableBuilder[Self <: UpdateContinuousBackupsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointInTimeRecoverySpecification(value: PointInTimeRecoverySpecification): Self = StObject.set(x, "PointInTimeRecoverySpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
