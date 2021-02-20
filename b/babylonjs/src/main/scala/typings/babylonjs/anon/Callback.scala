package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends StObject {
  
  def callback(collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor, point: Nullable[Vector3]): Unit = js.native
  
  var otherImpostors: js.Array[PhysicsImpostor] = js.native
}
object Callback {
  
  @scala.inline
  def apply(
    callback: (PhysicsImpostor, PhysicsImpostor, Nullable[Vector3]) => Unit,
    otherImpostors: js.Array[PhysicsImpostor]
  ): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction3(callback), otherImpostors = otherImpostors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: (PhysicsImpostor, PhysicsImpostor, Nullable[Vector3]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOtherImpostors(value: js.Array[PhysicsImpostor]): Self = StObject.set(x, "otherImpostors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherImpostorsVarargs(value: PhysicsImpostor*): Self = StObject.set(x, "otherImpostors", js.Array(value :_*))
  }
}
