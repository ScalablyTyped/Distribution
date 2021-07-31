package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProvisionedProductOutput extends StObject {
  
  /**
    * Information about the result of the request.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.undefined
}
object UpdateProvisionedProductOutput {
  
  @scala.inline
  def apply(): UpdateProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisionedProductOutput]
  }
  
  @scala.inline
  implicit class UpdateProvisionedProductOutputMutableBuilder[Self <: UpdateProvisionedProductOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordDetail(value: RecordDetail): Self = StObject.set(x, "RecordDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordDetailUndefined: Self = StObject.set(x, "RecordDetail", js.undefined)
  }
}
