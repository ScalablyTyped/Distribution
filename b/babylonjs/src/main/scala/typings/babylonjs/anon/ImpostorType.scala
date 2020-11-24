package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImpostorType extends js.Object {
  
  var friction: js.UndefOr[Double] = js.native
  
  var impostorSize: js.UndefOr[Double | DepthHeight] = js.native
  
  var impostorType: js.UndefOr[Double] = js.native
  
  var restitution: js.UndefOr[Double] = js.native
}
object ImpostorType {
  
  @scala.inline
  def apply(): ImpostorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpostorType]
  }
  
  @scala.inline
  implicit class ImpostorTypeOps[Self <: ImpostorType] (val x: Self) extends AnyVal {
    
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
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    
    @scala.inline
    def setImpostorSize(value: Double | DepthHeight): Self = this.set("impostorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpostorSize: Self = this.set("impostorSize", js.undefined)
    
    @scala.inline
    def setImpostorType(value: Double): Self = this.set("impostorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpostorType: Self = this.set("impostorType", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestitution: Self = this.set("restitution", js.undefined)
  }
}
