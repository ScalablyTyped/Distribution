package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseProvisionedCapacityOutput extends StObject {
  
  /**
    * The ID that identifies the provisioned capacity unit.
    */
  var capacityId: js.UndefOr[String] = js.undefined
}
object PurchaseProvisionedCapacityOutput {
  
  @scala.inline
  def apply(): PurchaseProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseProvisionedCapacityOutput]
  }
  
  @scala.inline
  implicit class PurchaseProvisionedCapacityOutputMutableBuilder[Self <: PurchaseProvisionedCapacityOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityId(value: String): Self = StObject.set(x, "capacityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityIdUndefined: Self = StObject.set(x, "capacityId", js.undefined)
  }
}
