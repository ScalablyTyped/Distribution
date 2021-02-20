package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCopyProductStatusOutput extends StObject {
  
  /**
    * The status of the copy product operation.
    */
  var CopyProductStatus: js.UndefOr[typings.awsSdk.servicecatalogMod.CopyProductStatus] = js.native
  
  /**
    * The status message.
    */
  var StatusDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.StatusDetail] = js.native
  
  /**
    * The identifier of the copied product.
    */
  var TargetProductId: js.UndefOr[Id] = js.native
}
object DescribeCopyProductStatusOutput {
  
  @scala.inline
  def apply(): DescribeCopyProductStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCopyProductStatusOutput]
  }
  
  @scala.inline
  implicit class DescribeCopyProductStatusOutputMutableBuilder[Self <: DescribeCopyProductStatusOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyProductStatus(value: CopyProductStatus): Self = StObject.set(x, "CopyProductStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyProductStatusUndefined: Self = StObject.set(x, "CopyProductStatus", js.undefined)
    
    @scala.inline
    def setStatusDetail(value: StatusDetail): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailUndefined: Self = StObject.set(x, "StatusDetail", js.undefined)
    
    @scala.inline
    def setTargetProductId(value: Id): Self = StObject.set(x, "TargetProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetProductIdUndefined: Self = StObject.set(x, "TargetProductId", js.undefined)
  }
}
