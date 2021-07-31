package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateProvisionedProductOutput extends StObject {
  
  /**
    * Information about the result of this request.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.undefined
}
object TerminateProvisionedProductOutput {
  
  @scala.inline
  def apply(): TerminateProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateProvisionedProductOutput]
  }
  
  @scala.inline
  implicit class TerminateProvisionedProductOutputMutableBuilder[Self <: TerminateProvisionedProductOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordDetail(value: RecordDetail): Self = StObject.set(x, "RecordDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordDetailUndefined: Self = StObject.set(x, "RecordDetail", js.undefined)
  }
}
