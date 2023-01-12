package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.physicsPhysicsImpostorMod.PhysicsImpostor
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  def callback(
    collider: PhysicsImpostor,
    collidedAgainst: PhysicsImpostor,
    point: Nullable[Vector3],
    distance: Double,
    impulse: Double,
    normal: Nullable[Vector3]
  ): Unit
  
  var otherImpostors: js.Array[PhysicsImpostor]
}
object Callback {
  
  inline def apply(
    callback: (PhysicsImpostor, PhysicsImpostor, Nullable[Vector3], Double, Double, Nullable[Vector3]) => Unit,
    otherImpostors: js.Array[PhysicsImpostor]
  ): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction6(callback), otherImpostors = otherImpostors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    inline def setCallback(
      value: (PhysicsImpostor, PhysicsImpostor, Nullable[Vector3], Double, Double, Nullable[Vector3]) => Unit
    ): Self = StObject.set(x, "callback", js.Any.fromFunction6(value))
    
    inline def setOtherImpostors(value: js.Array[PhysicsImpostor]): Self = StObject.set(x, "otherImpostors", value.asInstanceOf[js.Any])
    
    inline def setOtherImpostorsVarargs(value: PhysicsImpostor*): Self = StObject.set(x, "otherImpostors", js.Array(value*))
  }
}
