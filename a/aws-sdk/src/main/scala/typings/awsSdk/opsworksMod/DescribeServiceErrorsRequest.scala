package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceErrorsRequest extends StObject {
  
  /**
    * The instance ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of service error IDs. If you use this parameter, DescribeServiceErrors returns descriptions of the specified errors. Otherwise, it returns a description of every error.
    */
  var ServiceErrorIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The stack ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object DescribeServiceErrorsRequest {
  
  @scala.inline
  def apply(): DescribeServiceErrorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceErrorsRequest]
  }
  
  @scala.inline
  implicit class DescribeServiceErrorsRequestMutableBuilder[Self <: DescribeServiceErrorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setServiceErrorIds(value: Strings): Self = StObject.set(x, "ServiceErrorIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceErrorIdsUndefined: Self = StObject.set(x, "ServiceErrorIds", js.undefined)
    
    @scala.inline
    def setServiceErrorIdsVarargs(value: String*): Self = StObject.set(x, "ServiceErrorIds", js.Array(value :_*))
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
