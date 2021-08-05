package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterInstanceResult extends StObject {
  
  /**
    * The registered instance's AWS OpsWorks Stacks ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object RegisterInstanceResult {
  
  inline def apply(): RegisterInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterInstanceResult]
  }
  
  extension [Self <: RegisterInstanceResult](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
