package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceActionOutput extends StObject {
  
  /**
    * Detailed information about the self-service action.
    */
  var ServiceActionDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionDetail] = js.undefined
}
object DescribeServiceActionOutput {
  
  @scala.inline
  def apply(): DescribeServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceActionOutput]
  }
  
  @scala.inline
  implicit class DescribeServiceActionOutputMutableBuilder[Self <: DescribeServiceActionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceActionDetail(value: ServiceActionDetail): Self = StObject.set(x, "ServiceActionDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionDetailUndefined: Self = StObject.set(x, "ServiceActionDetail", js.undefined)
  }
}
