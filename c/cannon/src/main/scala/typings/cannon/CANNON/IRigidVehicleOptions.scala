package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRigidVehicleOptions extends StObject {
  
  var chassisBody: Body
}
object IRigidVehicleOptions {
  
  inline def apply(chassisBody: Body): IRigidVehicleOptions = {
    val __obj = js.Dynamic.literal(chassisBody = chassisBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRigidVehicleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRigidVehicleOptions] (val x: Self) extends AnyVal {
    
    inline def setChassisBody(value: Body): Self = StObject.set(x, "chassisBody", value.asInstanceOf[js.Any])
  }
}
