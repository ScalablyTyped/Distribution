package typings.cannon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BOX extends js.Object {
  
  var BOX: Double = js.native
  
  var COMPOUND: Double = js.native
  
  var CONVEXPOLYHEDRON: Double = js.native
  
  var CYLINDER: Double = js.native
  
  var HEIGHTFIELD: Double = js.native
  
  var PARTICLE: Double = js.native
  
  var PLANE: Double = js.native
  
  var SPHERE: Double = js.native
}
object BOX {
  
  @scala.inline
  def apply(
    BOX: Double,
    COMPOUND: Double,
    CONVEXPOLYHEDRON: Double,
    CYLINDER: Double,
    HEIGHTFIELD: Double,
    PARTICLE: Double,
    PLANE: Double,
    SPHERE: Double
  ): BOX = {
    val __obj = js.Dynamic.literal(BOX = BOX.asInstanceOf[js.Any], COMPOUND = COMPOUND.asInstanceOf[js.Any], CONVEXPOLYHEDRON = CONVEXPOLYHEDRON.asInstanceOf[js.Any], CYLINDER = CYLINDER.asInstanceOf[js.Any], HEIGHTFIELD = HEIGHTFIELD.asInstanceOf[js.Any], PARTICLE = PARTICLE.asInstanceOf[js.Any], PLANE = PLANE.asInstanceOf[js.Any], SPHERE = SPHERE.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOX]
  }
  
  @scala.inline
  implicit class BOXOps[Self <: BOX] (val x: Self) extends AnyVal {
    
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
    def setBOX(value: Double): Self = this.set("BOX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMPOUND(value: Double): Self = this.set("COMPOUND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONVEXPOLYHEDRON(value: Double): Self = this.set("CONVEXPOLYHEDRON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCYLINDER(value: Double): Self = this.set("CYLINDER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEIGHTFIELD(value: Double): Self = this.set("HEIGHTFIELD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPARTICLE(value: Double): Self = this.set("PARTICLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLANE(value: Double): Self = this.set("PLANE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPHERE(value: Double): Self = this.set("SPHERE", value.asInstanceOf[js.Any])
  }
}
