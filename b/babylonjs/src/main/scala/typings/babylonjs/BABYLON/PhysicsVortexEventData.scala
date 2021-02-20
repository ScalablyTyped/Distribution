package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsVortexEventData extends StObject {
  
  /**
    * A cylinder used for the vortex event
    */
  var cylinder: Mesh = js.native
}
object PhysicsVortexEventData {
  
  @scala.inline
  def apply(cylinder: Mesh): PhysicsVortexEventData = {
    val __obj = js.Dynamic.literal(cylinder = cylinder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsVortexEventData]
  }
  
  @scala.inline
  implicit class PhysicsVortexEventDataMutableBuilder[Self <: PhysicsVortexEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCylinder(value: Mesh): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
  }
}
