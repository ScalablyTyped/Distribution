package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentManagedActionsRequest extends StObject {
  
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[String] = js.native
  
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[String] = js.native
  
  /**
    * To show only actions with a particular status, specify a status.
    */
  var Status: js.UndefOr[ActionStatus] = js.native
}
object DescribeEnvironmentManagedActionsRequest {
  
  @scala.inline
  def apply(): DescribeEnvironmentManagedActionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentManagedActionsRequest]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentManagedActionsRequestMutableBuilder[Self <: DescribeEnvironmentManagedActionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: String): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: String): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    @scala.inline
    def setStatus(value: ActionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
