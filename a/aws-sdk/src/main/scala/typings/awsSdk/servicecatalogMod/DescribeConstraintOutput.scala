package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConstraintOutput extends StObject {
  
  /**
    * Information about the constraint.
    */
  var ConstraintDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintDetail] = js.undefined
  
  /**
    * The constraint parameters.
    */
  var ConstraintParameters: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintParameters] = js.undefined
  
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typings.awsSdk.servicecatalogMod.Status] = js.undefined
}
object DescribeConstraintOutput {
  
  inline def apply(): DescribeConstraintOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConstraintOutput]
  }
  
  extension [Self <: DescribeConstraintOutput](x: Self) {
    
    inline def setConstraintDetail(value: ConstraintDetail): Self = StObject.set(x, "ConstraintDetail", value.asInstanceOf[js.Any])
    
    inline def setConstraintDetailUndefined: Self = StObject.set(x, "ConstraintDetail", js.undefined)
    
    inline def setConstraintParameters(value: ConstraintParameters): Self = StObject.set(x, "ConstraintParameters", value.asInstanceOf[js.Any])
    
    inline def setConstraintParametersUndefined: Self = StObject.set(x, "ConstraintParameters", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
