package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedThroughputOverride extends StObject {
  
  /**
    * <p>Replica-specific read capacity units. If not specified, uses the source table's read
    *             capacity settings.</p>
    */
  var ReadCapacityUnits: js.UndefOr[Double] = js.undefined
}
object ProvisionedThroughputOverride {
  
  inline def apply(): ProvisionedThroughputOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedThroughputOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionedThroughputOverride] (val x: Self) extends AnyVal {
    
    inline def setReadCapacityUnits(value: Double): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
  }
}
