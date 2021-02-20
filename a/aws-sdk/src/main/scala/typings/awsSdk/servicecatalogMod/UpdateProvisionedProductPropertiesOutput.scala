package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProvisionedProductPropertiesOutput extends StObject {
  
  /**
    * The provisioned product identifier.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.native
  
  /**
    * A map that contains the properties updated.
    */
  var ProvisionedProductProperties: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductProperties] = js.native
  
  /**
    * The identifier of the record.
    */
  var RecordId: js.UndefOr[Id] = js.native
  
  /**
    * The status of the request.
    */
  var Status: js.UndefOr[RecordStatus] = js.native
}
object UpdateProvisionedProductPropertiesOutput {
  
  @scala.inline
  def apply(): UpdateProvisionedProductPropertiesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisionedProductPropertiesOutput]
  }
  
  @scala.inline
  implicit class UpdateProvisionedProductPropertiesOutputMutableBuilder[Self <: UpdateProvisionedProductPropertiesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvisionedProductId(value: Id): Self = StObject.set(x, "ProvisionedProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductIdUndefined: Self = StObject.set(x, "ProvisionedProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductProperties(value: ProvisionedProductProperties): Self = StObject.set(x, "ProvisionedProductProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductPropertiesUndefined: Self = StObject.set(x, "ProvisionedProductProperties", js.undefined)
    
    @scala.inline
    def setRecordId(value: Id): Self = StObject.set(x, "RecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordIdUndefined: Self = StObject.set(x, "RecordId", js.undefined)
    
    @scala.inline
    def setStatus(value: RecordStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
