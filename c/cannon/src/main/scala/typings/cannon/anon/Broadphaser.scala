package typings.cannon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Broadphaser extends js.Object {
  
  var broadphaser: Double = js.native
  
  var integrate: Double = js.native
  
  var makeContactConstraints: Double = js.native
  
  var narrowphase: Double = js.native
  
  var solve: Double = js.native
}
object Broadphaser {
  
  @scala.inline
  def apply(
    broadphaser: Double,
    integrate: Double,
    makeContactConstraints: Double,
    narrowphase: Double,
    solve: Double
  ): Broadphaser = {
    val __obj = js.Dynamic.literal(broadphaser = broadphaser.asInstanceOf[js.Any], integrate = integrate.asInstanceOf[js.Any], makeContactConstraints = makeContactConstraints.asInstanceOf[js.Any], narrowphase = narrowphase.asInstanceOf[js.Any], solve = solve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadphaser]
  }
  
  @scala.inline
  implicit class BroadphaserOps[Self <: Broadphaser] (val x: Self) extends AnyVal {
    
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
    def setBroadphaser(value: Double): Self = this.set("broadphaser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrate(value: Double): Self = this.set("integrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeContactConstraints(value: Double): Self = this.set("makeContactConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrowphase(value: Double): Self = this.set("narrowphase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolve(value: Double): Self = this.set("solve", value.asInstanceOf[js.Any])
  }
}
