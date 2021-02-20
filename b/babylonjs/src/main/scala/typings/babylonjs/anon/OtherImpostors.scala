package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PhysicsImpostor
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherImpostors extends StObject {
  
  def callback(collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor, point: Nullable[Vector3]): Unit = js.native
  
  var otherImpostors: js.Array[PhysicsImpostor] = js.native
}
object OtherImpostors {
  
  @scala.inline
  def apply(
    callback: (PhysicsImpostor, PhysicsImpostor, Nullable[Vector3]) => Unit,
    otherImpostors: js.Array[PhysicsImpostor]
  ): OtherImpostors = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction3(callback), otherImpostors = otherImpostors.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherImpostors]
  }
  
  @scala.inline
  implicit class OtherImpostorsMutableBuilder[Self <: OtherImpostors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: (PhysicsImpostor, PhysicsImpostor, Nullable[Vector3]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOtherImpostors(value: js.Array[PhysicsImpostor]): Self = StObject.set(x, "otherImpostors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherImpostorsVarargs(value: PhysicsImpostor*): Self = StObject.set(x, "otherImpostors", js.Array(value :_*))
  }
}
