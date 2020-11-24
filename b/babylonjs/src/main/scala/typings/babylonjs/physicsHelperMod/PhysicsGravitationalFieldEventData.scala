package typings.babylonjs.physicsHelperMod

import typings.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsGravitationalFieldEventData extends js.Object {
  
  /**
    * A sphere mesh used for the gravitational field event
    */
  var sphere: Mesh = js.native
}
object PhysicsGravitationalFieldEventData {
  
  @scala.inline
  def apply(sphere: Mesh): PhysicsGravitationalFieldEventData = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsGravitationalFieldEventData]
  }
  
  @scala.inline
  implicit class PhysicsGravitationalFieldEventDataOps[Self <: PhysicsGravitationalFieldEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSphere(value: Mesh): Self = this.set("sphere", value.asInstanceOf[js.Any])
  }
}
