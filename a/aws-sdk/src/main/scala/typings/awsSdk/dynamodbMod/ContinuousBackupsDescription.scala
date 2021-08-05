package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousBackupsDescription extends StObject {
  
  /**
    *  ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
    */
  var ContinuousBackupsStatus: typings.awsSdk.dynamodbMod.ContinuousBackupsStatus
  
  /**
    * The description of the point in time recovery settings applied to the table.
    */
  var PointInTimeRecoveryDescription: js.UndefOr[typings.awsSdk.dynamodbMod.PointInTimeRecoveryDescription] = js.undefined
}
object ContinuousBackupsDescription {
  
  inline def apply(ContinuousBackupsStatus: ContinuousBackupsStatus): ContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousBackupsDescription]
  }
  
  extension [Self <: ContinuousBackupsDescription](x: Self) {
    
    inline def setContinuousBackupsStatus(value: ContinuousBackupsStatus): Self = StObject.set(x, "ContinuousBackupsStatus", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryDescription(value: PointInTimeRecoveryDescription): Self = StObject.set(x, "PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryDescriptionUndefined: Self = StObject.set(x, "PointInTimeRecoveryDescription", js.undefined)
  }
}
