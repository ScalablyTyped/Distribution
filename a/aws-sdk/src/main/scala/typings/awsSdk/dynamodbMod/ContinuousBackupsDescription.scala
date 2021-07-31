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
  
  @scala.inline
  def apply(ContinuousBackupsStatus: ContinuousBackupsStatus): ContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousBackupsDescription]
  }
  
  @scala.inline
  implicit class ContinuousBackupsDescriptionMutableBuilder[Self <: ContinuousBackupsDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuousBackupsStatus(value: ContinuousBackupsStatus): Self = StObject.set(x, "ContinuousBackupsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointInTimeRecoveryDescription(value: PointInTimeRecoveryDescription): Self = StObject.set(x, "PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointInTimeRecoveryDescriptionUndefined: Self = StObject.set(x, "PointInTimeRecoveryDescription", js.undefined)
  }
}
