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
  
  inline def apply(): DescribeServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceActionOutput]
  }
  
  extension [Self <: DescribeServiceActionOutput](x: Self) {
    
    inline def setServiceActionDetail(value: ServiceActionDetail): Self = StObject.set(x, "ServiceActionDetail", value.asInstanceOf[js.Any])
    
    inline def setServiceActionDetailUndefined: Self = StObject.set(x, "ServiceActionDetail", js.undefined)
  }
}
