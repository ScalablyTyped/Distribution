package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterInstanceResult extends StObject {
  
  /**
    * The registered instance's AWS OpsWorks Stacks ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
}
object RegisterInstanceResult {
  
  @scala.inline
  def apply(): RegisterInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterInstanceResult]
  }
  
  @scala.inline
  implicit class RegisterInstanceResultMutableBuilder[Self <: RegisterInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
