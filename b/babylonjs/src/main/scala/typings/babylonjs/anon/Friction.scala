package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Friction extends js.Object {
  
  /**
    * Friction definitions
    */
  var friction: js.UndefOr[Double] = js.native
  
  /**
    * the size of the impostor. Defaults to 10cm
    */
  var impostorSize: js.UndefOr[Double | DepthHeight] = js.native
  
  /**
    * The type of impostor to create. Default is sphere
    */
  var impostorType: Double = js.native
  
  /**
    * Restitution
    */
  var restitution: js.UndefOr[Double] = js.native
}
object Friction {
  
  @scala.inline
  def apply(impostorType: Double): Friction = {
    val __obj = js.Dynamic.literal(impostorType = impostorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friction]
  }
  
  @scala.inline
  implicit class FrictionOps[Self <: Friction] (val x: Self) extends AnyVal {
    
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
    def setImpostorType(value: Double): Self = this.set("impostorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    
    @scala.inline
    def setImpostorSize(value: Double | DepthHeight): Self = this.set("impostorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpostorSize: Self = this.set("impostorSize", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestitution: Self = this.set("restitution", js.undefined)
  }
}
