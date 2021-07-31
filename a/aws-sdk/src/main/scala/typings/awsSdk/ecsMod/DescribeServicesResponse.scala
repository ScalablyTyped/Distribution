package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServicesResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  
  /**
    * The list of services described.
    */
  var services: js.UndefOr[Services] = js.undefined
}
object DescribeServicesResponse {
  
  @scala.inline
  def apply(): DescribeServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesResponse]
  }
  
  @scala.inline
  implicit class DescribeServicesResponseMutableBuilder[Self <: DescribeServicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: Services): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: Service*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
