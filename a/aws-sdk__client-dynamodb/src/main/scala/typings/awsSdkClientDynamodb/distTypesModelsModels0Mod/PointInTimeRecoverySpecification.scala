package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointInTimeRecoverySpecification extends StObject {
  
  /**
    * <p>Indicates whether point in time recovery is enabled (true) or disabled (false) on the
    *             table.</p>
    */
  var PointInTimeRecoveryEnabled: js.UndefOr[Boolean] = js.undefined
}
object PointInTimeRecoverySpecification {
  
  inline def apply(): PointInTimeRecoverySpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointInTimeRecoverySpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointInTimeRecoverySpecification] (val x: Self) extends AnyVal {
    
    inline def setPointInTimeRecoveryEnabled(value: Boolean): Self = StObject.set(x, "PointInTimeRecoveryEnabled", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryEnabledUndefined: Self = StObject.set(x, "PointInTimeRecoveryEnabled", js.undefined)
  }
}
