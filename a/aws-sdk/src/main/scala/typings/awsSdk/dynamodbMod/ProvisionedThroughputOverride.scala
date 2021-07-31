package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedThroughputOverride extends StObject {
  
  /**
    * Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
    */
  var ReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
}
object ProvisionedThroughputOverride {
  
  @scala.inline
  def apply(): ProvisionedThroughputOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedThroughputOverride]
  }
  
  @scala.inline
  implicit class ProvisionedThroughputOverrideMutableBuilder[Self <: ProvisionedThroughputOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
  }
}
