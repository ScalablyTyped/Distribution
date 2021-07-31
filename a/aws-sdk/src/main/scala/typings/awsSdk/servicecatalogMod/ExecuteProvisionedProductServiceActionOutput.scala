package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteProvisionedProductServiceActionOutput extends StObject {
  
  /**
    * An object containing detailed information about the result of provisioning the product.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.undefined
}
object ExecuteProvisionedProductServiceActionOutput {
  
  @scala.inline
  def apply(): ExecuteProvisionedProductServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteProvisionedProductServiceActionOutput]
  }
  
  @scala.inline
  implicit class ExecuteProvisionedProductServiceActionOutputMutableBuilder[Self <: ExecuteProvisionedProductServiceActionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordDetail(value: RecordDetail): Self = StObject.set(x, "RecordDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordDetailUndefined: Self = StObject.set(x, "RecordDetail", js.undefined)
  }
}
