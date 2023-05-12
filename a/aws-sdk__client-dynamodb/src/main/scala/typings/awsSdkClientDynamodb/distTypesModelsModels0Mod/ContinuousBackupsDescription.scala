package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousBackupsDescription extends StObject {
  
  /**
    * <p>
    *             <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED,
    *             DISABLED</p>
    */
  var ContinuousBackupsStatus: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ContinuousBackupsStatus | String
  ] = js.undefined
  
  /**
    * <p>The description of the point in time recovery settings applied to the table.</p>
    */
  var PointInTimeRecoveryDescription: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.PointInTimeRecoveryDescription
  ] = js.undefined
}
object ContinuousBackupsDescription {
  
  inline def apply(): ContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinuousBackupsDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinuousBackupsDescription] (val x: Self) extends AnyVal {
    
    inline def setContinuousBackupsStatus(value: ContinuousBackupsStatus | String): Self = StObject.set(x, "ContinuousBackupsStatus", value.asInstanceOf[js.Any])
    
    inline def setContinuousBackupsStatusUndefined: Self = StObject.set(x, "ContinuousBackupsStatus", js.undefined)
    
    inline def setPointInTimeRecoveryDescription(value: PointInTimeRecoveryDescription): Self = StObject.set(x, "PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryDescriptionUndefined: Self = StObject.set(x, "PointInTimeRecoveryDescription", js.undefined)
  }
}
