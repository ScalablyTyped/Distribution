package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentsRequest extends StObject {
  
  /**
    * The IDs of individual environments to get information about.
    */
  var environmentIds: BoundedEnvironmentIdList
}
object DescribeEnvironmentsRequest {
  
  @scala.inline
  def apply(environmentIds: BoundedEnvironmentIdList): DescribeEnvironmentsRequest = {
    val __obj = js.Dynamic.literal(environmentIds = environmentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentsRequest]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentsRequestMutableBuilder[Self <: DescribeEnvironmentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentIds(value: BoundedEnvironmentIdList): Self = StObject.set(x, "environmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdsVarargs(value: EnvironmentId*): Self = StObject.set(x, "environmentIds", js.Array(value :_*))
  }
}
