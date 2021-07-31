package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceResult extends StObject {
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object CreateInstanceResult {
  
  @scala.inline
  def apply(): CreateInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceResult]
  }
  
  @scala.inline
  implicit class CreateInstanceResultMutableBuilder[Self <: CreateInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
