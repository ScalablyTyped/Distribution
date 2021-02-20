package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConstraintOutput extends StObject {
  
  /**
    * Information about the constraint.
    */
  var ConstraintDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintDetail] = js.native
  
  /**
    * The constraint parameters.
    */
  var ConstraintParameters: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintParameters] = js.native
  
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typings.awsSdk.servicecatalogMod.Status] = js.native
}
object CreateConstraintOutput {
  
  @scala.inline
  def apply(): CreateConstraintOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConstraintOutput]
  }
  
  @scala.inline
  implicit class CreateConstraintOutputMutableBuilder[Self <: CreateConstraintOutput] (val x: Self) extends AnyVal {
    
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
