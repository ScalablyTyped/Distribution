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
  
  @scala.inline
  def apply(): DescribeConstraintOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConstraintOutput]
  }
  
  @scala.inline
  implicit class DescribeConstraintOutputMutableBuilder[Self <: DescribeConstraintOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraintDetail(value: ConstraintDetail): Self = StObject.set(x, "ConstraintDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintDetailUndefined: Self = StObject.set(x, "ConstraintDetail", js.undefined)
    
    @scala.inline
    def setConstraintParameters(value: ConstraintParameters): Self = StObject.set(x, "ConstraintParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintParametersUndefined: Self = StObject.set(x, "ConstraintParameters", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
