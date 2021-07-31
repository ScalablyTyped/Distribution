package typings.cookieclicker.Game

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Particle extends StObject {
  
  var dur: Double
  
  var l: js.UndefOr[HTMLElement] = js.undefined
  
  var life: Double
  
  var pic: String
  
  var picId: Double
  
  var picPos: js.Tuple2[Double, Double]
  
  var size: Double
  
  var text: String | Double
  
  var x: Double
  
  var xd: Double
  
  var y: Double
  
  var yd: Double
  
  var z: Double
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
  implicit class ParticleMutableBuilder[Self <: Particle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: HTMLElement): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    @scala.inline
    def setLife(value: Double): Self = StObject.set(x, "life", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicId(value: Double): Self = StObject.set(x, "picId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "picPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String | Double): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXd(value: Double): Self = StObject.set(x, "xd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYd(value: Double): Self = StObject.set(x, "yd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
