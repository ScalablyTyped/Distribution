package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyEnvironmentManagedActionRequest extends StObject {
  
  /**
    * The action ID of the scheduled managed action to execute.
    */
  var ActionId: String = js.native
  
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[String] = js.native
  
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[String] = js.native
}
object ApplyEnvironmentManagedActionRequest {
  
  @scala.inline
  def apply(ActionId: String): ApplyEnvironmentManagedActionRequest = {
    val __obj = js.Dynamic.literal(ActionId = ActionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyEnvironmentManagedActionRequest]
  }
  
  @scala.inline
  implicit class ApplyEnvironmentManagedActionRequestMutableBuilder[Self <: ApplyEnvironmentManagedActionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentId(value: String): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: String): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
  }
}
