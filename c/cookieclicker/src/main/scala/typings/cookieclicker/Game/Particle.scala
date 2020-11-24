package typings.cookieclicker.Game

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Particle extends js.Object {
  
  var dur: Double = js.native
  
  var l: js.UndefOr[HTMLElement] = js.native
  
  var life: Double = js.native
  
  var pic: String = js.native
  
  var picId: Double = js.native
  
  var picPos: js.Tuple2[Double, Double] = js.native
  
  var size: Double = js.native
  
  var text: String | Double = js.native
  
  var x: Double = js.native
  
  var xd: Double = js.native
  
  var y: Double = js.native
  
  var yd: Double = js.native
  
  var z: Double = js.native
}
object Particle {
  
  @scala.inline
  def apply(
    dur: Double,
    life: Double,
    pic: String,
    picId: Double,
    picPos: js.Tuple2[Double, Double],
    size: Double,
    text: String | Double,
    x: Double,
    xd: Double,
    y: Double,
    yd: Double,
    z: Double
  ): Particle = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], life = life.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any], picId = picId.asInstanceOf[js.Any], picPos = picPos.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xd = xd.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yd = yd.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Particle]
  }
  
  @scala.inline
  implicit class ParticleOps[Self <: Particle] (val x: Self) extends AnyVal {
    
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
    def setDur(value: Double): Self = this.set("dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLife(value: Double): Self = this.set("life", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPic(value: String): Self = this.set("pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicId(value: Double): Self = this.set("picId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicPos(value: js.Tuple2[Double, Double]): Self = this.set("picPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String | Double): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXd(value: Double): Self = this.set("xd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYd(value: Double): Self = this.set("yd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: HTMLElement): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL: Self = this.set("l", js.undefined)
  }
}
