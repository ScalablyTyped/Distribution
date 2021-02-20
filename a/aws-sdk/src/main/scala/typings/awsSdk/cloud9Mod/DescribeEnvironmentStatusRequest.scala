package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentStatusRequest extends StObject {
  
  /**
    * The ID of the environment to get status information about.
    */
  var environmentId: EnvironmentId = js.native
}
object DescribeEnvironmentStatusRequest {
  
  @scala.inline
  def apply(environmentId: EnvironmentId): DescribeEnvironmentStatusRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentStatusRequestMutableBuilder[Self <: DescribeEnvironmentStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
