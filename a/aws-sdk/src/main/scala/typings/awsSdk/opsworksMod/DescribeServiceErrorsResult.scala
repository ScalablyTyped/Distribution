package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceErrorsResult extends StObject {
  
  /**
    * An array of ServiceError objects that describe the specified service errors.
    */
  var ServiceErrors: js.UndefOr[typings.awsSdk.opsworksMod.ServiceErrors] = js.undefined
}
object DescribeServiceErrorsResult {
  
  @scala.inline
  def apply(): DescribeServiceErrorsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceErrorsResult]
  }
  
  @scala.inline
  implicit class DescribeServiceErrorsResultMutableBuilder[Self <: DescribeServiceErrorsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceErrors(value: ServiceErrors): Self = StObject.set(x, "ServiceErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceErrorsUndefined: Self = StObject.set(x, "ServiceErrors", js.undefined)
    
    @scala.inline
    def setServiceErrorsVarargs(value: ServiceError*): Self = StObject.set(x, "ServiceErrors", js.Array(value :_*))
  }
}
