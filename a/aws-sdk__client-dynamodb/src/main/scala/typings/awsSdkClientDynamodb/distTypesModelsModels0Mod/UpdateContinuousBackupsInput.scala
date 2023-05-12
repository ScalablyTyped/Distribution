package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContinuousBackupsInput extends StObject {
  
  /**
    * <p>Represents the settings used to enable point in time recovery.</p>
    */
  var PointInTimeRecoverySpecification: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.PointInTimeRecoverySpecification
  ] = js.undefined
  
  /**
    * <p>The name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object UpdateContinuousBackupsInput {
  
  inline def apply(): UpdateContinuousBackupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContinuousBackupsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContinuousBackupsInput] (val x: Self) extends AnyVal {
    
    inline def setPointInTimeRecoverySpecification(value: PointInTimeRecoverySpecification): Self = StObject.set(x, "PointInTimeRecoverySpecification", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoverySpecificationUndefined: Self = StObject.set(x, "PointInTimeRecoverySpecification", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
