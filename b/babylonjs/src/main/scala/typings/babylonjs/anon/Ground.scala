package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ground extends js.Object {
  
  /**
    * Should the ground be removed (default false)
    */
  var ground: js.UndefOr[Boolean] = js.native
  
  /**
    * Should the skybox be removed (default false)
    */
  var skyBox: js.UndefOr[Boolean] = js.native
}
object Ground {
  
  @scala.inline
  def apply(): Ground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ground]
  }
  
  @scala.inline
  implicit class GroundOps[Self <: Ground] (val x: Self) extends AnyVal {
    
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
    def setGround(value: Boolean): Self = this.set("ground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGround: Self = this.set("ground", js.undefined)
    
    @scala.inline
    def setSkyBox(value: Boolean): Self = this.set("skyBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkyBox: Self = this.set("skyBox", js.undefined)
  }
}
